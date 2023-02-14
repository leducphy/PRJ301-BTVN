package controller;

import dto.Product;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;

@WebServlet(name = "ProductListController", urlPatterns = {"/list"})
public class ProductListController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        //edit here
        Product p1 = new Product(1, "Iphone 12", 999, 3);
        Product p2 = new Product(2, "Samsung s22", 999, 3);
        Product p3 = new Product(3, "Vivi v12", 999, 3);
        Product p4 = new Product(4, "Iphone 7", 999, 3);
        Product p5 = new Product(5, "Iphone 8", 999, 3);

        ArrayList<Product> arr = new ArrayList<>();
        arr.add(p1);
        arr.add(p2);
        arr.add(p3);
        arr.add(p4);
        arr.add(p5);

        req.setAttribute("arr", arr);

        req.getRequestDispatcher("List.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String search = (String)req.getParameter("search");
        Product p1 = new Product(1, "Iphone 12", 999, 3);
        Product p2 = new Product(2, "Samsung s22", 999, 3);
        Product p3 = new Product(3, "Vivi v12", 999, 3);
        Product p4 = new Product(4, "Iphone 7", 999, 3);
        Product p5 = new Product(5, "Iphone 8", 999, 3);

        ArrayList<Product> arr = new ArrayList<>();
        ArrayList<Product> arrSearch = new ArrayList<>();

        arr.add(p1);
        arr.add(p2);
        arr.add(p3);
        arr.add(p4);
        arr.add(p5);

        for (Product p : arr) {
            if (p.getName().contains(search)) {
                arrSearch.add(p);
            }
        }

        req.setAttribute("arr", arrSearch);
        req.setAttribute("search", search);

        req.getRequestDispatcher("List.jsp").forward(req, resp);
    }

}
