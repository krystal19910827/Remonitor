package remonitor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

 
 
 

public class query {
	public static  List<String> getCustOrderId(String Order){
		Connection conn =dbconnect.getconnect();
		List<String> list = new ArrayList <String>();
	    String sql = "SELECT cust_order_id,substr(eo.common_region_id,0,3) FROM ess_app_pub.ecs_order eo  where eo.ext_cust_order_id=?";
	    try
	    {
	PreparedStatement pre = conn.prepareStatement(sql);// 实例化预编译语句
	pre.setString(1, Order);
	ResultSet result = pre.executeQuery();
	while (result.next()){
		list.add(result.getString(1)+"|"+result.getString(2));
	}
	conn.close();
	    }catch (SQLException e1)
	    {e1.printStackTrace();  }
	    return list;
	}
}

