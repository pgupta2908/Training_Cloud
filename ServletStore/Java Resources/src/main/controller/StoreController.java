package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import com.cg.exception.StoreException;

import Service.CustomerService;
import Service.RetailerService;
import model.Customer;

/**
 * Servlet implementation class StoreController
 */
// @WebServlet("/storeController")
public class StoreController extends HttpServlet {

	private static final long serialVersionUID = 6274646064620173055L;

	ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);

	CustomerService custService = (CustomerService) context.getBean("CustomerService");
	RetailerService retailerService = (RetailerService) context.getBean("RetailerService");

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String qStr = request.getParameter("act");
		RequestDispatcher dispatch = null;
		System.out.println(qStr);

		if ("viewAllCustomer".equals(qStr)) {
			List<Customer> list = retailerService.viewCustomer();
			request.setAttribute("listCustomer", list);
			dispatch = request.getRequestDispatcher("allCustomers.jsp");
			dispatch.forward(request, response);
		}
		if ("addCustomer".equals(qStr)) {
			dispatch = request.getRequestDispatcher("addCustomer.jsp");
			dispatch.forward(request, response);
		}
		if ("updateCustomer".equals(qStr)) {
			dispatch = request.getRequestDispatcher("updateCustomer.jsp");
			dispatch.forward(request, response);
		}
		if ("deleteCustomer".equals(qStr)) {
			dispatch = request.getRequestDispatcher("deleteCustomer.jsp");
			dispatch.forward(request, response);
		}
		/*else
		{
			dispatch = request.getRequestDispatcher("failiure.jsp");
			dispatch.forward(request, response);
		}*/

	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		super.doPut(req, resp);
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		super.doDelete(req, resp);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		System.out.println("uihui");
		///String qStr = request.getParameter("act");
		//.out.println(qStr);

		RequestDispatcher dispatch = null;

		//if ("addCustomer".equals(qStr)) {
			dispatch = request.getRequestDispatcher("addNew.jsp");
			dispatch.forward(request, response);
			String custId = request.getParameter("Customer_Id");
			String name = request.getParameter("Customer_Name");
			String address = request.getParameter("Customer_Address");
			String payment = request.getParameter("payment_Mode");
			String retailerId = request.getParameter("retailer_id");
			System.out.println(name);
			System.out.println(custId);
			Customer customer = new Customer(custId, name, address, payment, retailerId);

			String cust = custService.addCustomer(customer);
//			System.out.println(cust);
			request.getRequestDispatcher("success.jsp").forward(request, response);
	//	} else
	//		dispatch = request.getRequestDispatcher("failiure.jsp");
	}

}
