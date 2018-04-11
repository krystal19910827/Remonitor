package remonitor;

import java.util.List;

 

public class app {
	public static void main(String[] args) {
	  String[] order=readtxt.Readfile();
	  for (int i=0;i<order.length;i++){
		  System.out.println(order[i]); 
		  List<String>  orderlist= query.getCustOrderId(order[i]);
		  System.out.println(orderlist);  
		  cust4Gquery.update(orderlist);
			  
		  }

}
	}
