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

import com.bankaccountmanagement.AccountInfo;
import com.bankaccountmanagement.CustomerInfo;
import com.bankaccountmanagement.DataErrorException;
import com.bankaccountmanagement.Helper;
import com.bankaccountmanagement.ProgramDriver;

public class Customer extends HttpServlet{
	ProgramDriver driver=new ProgramDriver();
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		ArrayList list=new ArrayList();
		ArrayList<ArrayList> array=new ArrayList();
		String  name=req.getParameter("name");
		String emailId=req.getParameter("emailid");
		long phoneNumber=Long.parseLong(req.getParameter("phone"));
		double amount=Double.parseDouble(req.getParameter("amount"));
		CustomerInfo customer=Helper.getCustomerInfo(name, emailId, phoneNumber);
		AccountInfo account=Helper.getAccountInfo(0, amount);
		list.add(customer);
		list.add(account);
		array.add(list);
		try {
			HashMap<String,ArrayList<ArrayList>>map=driver.addNewCustomer(array);
			PrintWriter writter=res.getWriter();
			writter.print(map);
		} catch (DataErrorException e) {
			e.printStackTrace();
		}
	}

}
