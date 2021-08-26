import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bankaccountmanagement.AccountManagement;

import com.bankaccountmanagement.DataErrorException;
import com.bankaccountmanagement.ProgramDriver;

public class Servlets extends HttpServlet {
	ProgramDriver driver= new ProgramDriver();
	public Servlets() {
		try {
			driver.setDataBase();
		} catch (DataErrorException e1) {
			e1.printStackTrace();
		}
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		String  str=req.getParameter("path");
		if(str.equals("Customers")) {
			
			RequestDispatcher request=req.getRequestDispatcher("Customers.jsp");
			try {
				addAttribute(req,res,str);
			} catch (DataErrorException e) {
				e.printStackTrace();
			}
			request.forward(req,res);
		}
		if(str.equals("Accounts")) {
			RequestDispatcher request=req.getRequestDispatcher("Accounts.jsp");
			try {
				addAttribute(req,res,str);
			} catch (DataErrorException e) {
				e.printStackTrace();
			}
			request.forward(req,res);
		}
		if(str.equals("Transactions")) {
			RequestDispatcher request=req.getRequestDispatcher("Transactions.jsp");
			request.forward(req,res);
		}
		
	}
	
	public void addAttribute(HttpServletRequest req,HttpServletResponse res,String str) throws DataErrorException {
		List array=null;
		if(str.equals("Customers")) {
			
			array=AccountManagement.OBJECT.getCustomerList();
			req.setAttribute("customers", array);
		}
		else if(str.equals("Accounts")) {
			
			array=AccountManagement.OBJECT.getAccountList();
			req.setAttribute("accounts", array);
		}
		
	}
	

}