import dao.ProductDAO;
import dto.Product;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;


@WebServlet(name="EditProductController", urlPatterns={"/edit"})
public class EditProductController extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
        String pid = req.getParameter("id");
        int id = Integer.parseInt(pid);
        
        Product product = new ProductDAO().getProductByID(id);
        req.setAttribute("product", product);
      req.getRequestDispatcher("edit-product.jsp").forward(req, resp);
    } 

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
        int pid = Integer.parseInt(req.getParameter("pid"));
        String pname = req.getParameter("pname");
        Double pprice = Double.parseDouble(req.getParameter("pprice"));
        int pquantity = Integer.parseInt(req.getParameter("pquantity"));
        
        Product p = new Product(pid, pname, pprice, pquantity);
        
        int status = new ProductDAO().updateProduct(pid, p);
        
        String msg= "";
        if (status == 1) {
            msg = "update thanh cong";
        }else{
            msg = "update that bai";
        }
        req.setAttribute("msg", msg);
        
        
        ArrayList<Product> list = new ProductDAO().getProducts();
        req.setAttribute("arr", list);
        req.getRequestDispatcher("List.jsp").forward(req, resp);
    }


}