import dao.ProductDAO;
import dto.Product;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;


@WebServlet(name="DeleteProductController", urlPatterns={"/delete"})
public class DeleteProductController extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
        String pid = req.getParameter("id");
        int id = Integer.parseInt(pid);
        new ProductDAO().deleteProduct(id);
        
        
        //hien thi
        ArrayList<Product> list = new ProductDAO().getProducts();
        req.setAttribute("arr", list);
        req.getRequestDispatcher("List.jsp").forward(req, resp);
    } 


}