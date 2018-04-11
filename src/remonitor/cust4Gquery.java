package remonitor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class cust4Gquery {
	public static void update(List<String>  orderlist){
		Connection jdbc_Connect_Oracle = null; 
		String cust_so_number=null;
		 for(int i=0;i<orderlist.size();i++){
			    String CustOrderId=orderlist.get(i).split("\\|")[0];
			    String province=orderlist.get(i).split("\\|")[1];
		String dbNbr=null;
		if (province.equals("844")){
			jdbc_Connect_Oracle=db4Gconnection.getCrm0102GdJsDbConnection();
			dbNbr="1";		}
		else if(province.equals("832")){
			jdbc_Connect_Oracle=db4Gconnection.getCrm0102GdJsDbConnection();
			dbNbr="2";		}
	    else if (province.equals("851")){
				jdbc_Connect_Oracle = db4Gconnection.getCrm0304ScZjDbConnection();
				dbNbr="3";		    }
	    else if (province.equals("833")) {
		    	jdbc_Connect_Oracle = db4Gconnection.getCrm0304ScZjDbConnection();
		    	dbNbr="4";   }
		else if (province.equals("834")){
				jdbc_Connect_Oracle = db4Gconnection.getCrm0506AhSxDbConnection();
				dbNbr="5";		    }  
		else if(province.equals("861")) {
				jdbc_Connect_Oracle = db4Gconnection.getCrm0506AhSxDbConnection();
				dbNbr="6";		    } 
		else if (province.equals("835")){
				jdbc_Connect_Oracle = db4Gconnection.getCrm0708FjShDbConnection();
				dbNbr="7";		    }
		else if  (province.equals("831")) {
				jdbc_Connect_Oracle = db4Gconnection.getCrm0708FjShDbConnection();
				dbNbr="8";		    } 
		else if (province.equals("813")) {
				jdbc_Connect_Oracle = db4Gconnection.getCrm09HbDbConnection();
				dbNbr="9";		    } 
		else if (province.equals("815")) {
				jdbc_Connect_Oracle = db4Gconnection.getCrm10NmDbConnection();
				dbNbr="10";		    }
		else if (province.equals("843")){
				jdbc_Connect_Oracle = db4Gconnection.getCrm1112HnLnDbConnection();
		    	dbNbr="11";		    }
		else if  (province.equals("821")) {
				jdbc_Connect_Oracle = db4Gconnection.getCrm1112HnLnDbConnection();
				dbNbr="12";		    } 
		else if (province.equals("842")){
				jdbc_Connect_Oracle = db4Gconnection.getCrm1314HbGzDbConnection();
				dbNbr="13";		    }
		else if  (province.equals("852")) {
				jdbc_Connect_Oracle = db4Gconnection.getCrm1314HbGzDbConnection();
				dbNbr="14";		    } 
		else if (province.equals("837")) {
				jdbc_Connect_Oracle = db4Gconnection.getCrm1516SdCqDbConnection();
				dbNbr="15";		    }
		else if  (province.equals("850")) {
				jdbc_Connect_Oracle = db4Gconnection.getCrm1516SdCqDbConnection();
				dbNbr="16";		    } 
		else if (province.equals("865")) {
				jdbc_Connect_Oracle = db4Gconnection.getCrm1718XjBjDbConnection();
				dbNbr="17";		    }
		else if(province.equals("811")) {
				jdbc_Connect_Oracle = db4Gconnection.getCrm1718XjBjDbConnection();
				dbNbr="18";		    } 
		else if (province.equals("812")){
				jdbc_Connect_Oracle = db4Gconnection.getCrm1920TjJxDbConnection();
				dbNbr="19";		    } 
		else if  (province.equals("836")) {
				jdbc_Connect_Oracle = db4Gconnection.getCrm1920TjJxDbConnection();
				dbNbr="20";			} 
		else if (province.equals("863")){
				jdbc_Connect_Oracle = db4Gconnection.getCrm2122QhGsDbConnection();
				dbNbr="21";			}
		else if (province.equals("862")) {
				jdbc_Connect_Oracle = db4Gconnection.getCrm2122QhGsDbConnection();
				dbNbr="22";			} 
		else if (province.equals("822")){
				jdbc_Connect_Oracle = db4Gconnection.getCrm2324JlHnDbConnection();
				dbNbr="23";			}
		else if  (province.equals("841")) {
				jdbc_Connect_Oracle = db4Gconnection.getCrm2324JlHnDbConnection();
				dbNbr="24";			} 
		else if (province.equals("823")){
				jdbc_Connect_Oracle = db4Gconnection.getCrm2526HlYnDbConnection();
				dbNbr="25";			}
		else if(province.equals("853")) {
				jdbc_Connect_Oracle = db4Gconnection.getCrm2526HlYnDbConnection();
				dbNbr="26";			} 
		else if (province.equals("845")){
				jdbc_Connect_Oracle = db4Gconnection.getCrm2728GxSxDbConnection();
				dbNbr="27";			}
		else if (province.equals("814")) {
				jdbc_Connect_Oracle = db4Gconnection.getCrm2728GxSxDbConnection();
				dbNbr="28";			} 
		else if (province.equals("846")){
				jdbc_Connect_Oracle = db4Gconnection.getCrm293031HnNxXzDbConnection();	
		        dbNbr="29";			}
		else if (province.equals("864")){
				jdbc_Connect_Oracle = db4Gconnection.getCrm293031HnNxXzDbConnection();	
			     dbNbr="30";			}
		else if (province.equals("854"))  {
				jdbc_Connect_Oracle = db4Gconnection.getCrm293031HnNxXzDbConnection();	
				dbNbr="31";}
		try{
        String sql00="select cust_so_number from crm_app_"+dbNbr+".customer_order  where cust_order_id =? ";
        PreparedStatement pstmtX00 = jdbc_Connect_Oracle.prepareStatement(sql00);
    	pstmtX00.setString(1, CustOrderId);
    	ResultSet result00 = pstmtX00.executeQuery();
    	while(result00.next()){
    	cust_so_number=result00.getString(1);}
    	String sql1="update crm_app_"+dbNbr+".customer_order c  set c.status_cd = '201300' where c.cust_so_number = ? ";
    	String sql2="update crm_app_"+dbNbr+".order_item r set r.status_cd = '201300' where r.order_item_cd not in('1000','1100') and r.cust_order_id =? ";
    	String sql3="update crm_app_"+dbNbr+".order_item r set r.status_cd = '301200' where r.order_item_cd  in('1000','1100') and r.cust_order_id =? ";
    	String sql4="update crm_"+dbNbr+".order_item e set e.status_cd='100004' ,e.remarks='被撤单需要正常报竣归档，撤单订单需刷成100004，原状态：301200' where e.order_item_id in (select rr.a_order_item_id from crm_"+dbNbr+".order_item_rel rr, crm_"+dbNbr+".order_item aa where rr.z_order_item_id = aa.order_item_id and aa.cust_order_id =? ) and e.status_cd ='301200'";
        String sql5="insert into intf_"+dbNbr+".intf_co_dispatch_msg t select * from  crm_app_"+dbNbr+".intf_co_dispatch_msg_his a where a.msg_id in (select t.msg_id from intf_"+dbNbr+".listener_record t where t.obj_id =? and t.msg_type_cd='102' )";
        String sql6="delete from intf_"+dbNbr+".intf_co_dispatch_msg_his t where t.msg_id in (select t.msg_id from intf_"+dbNbr+".listener_record t where t.obj_id =? and t.msg_type_cd='102' )";
        String sql7="update intf_"+dbNbr+".intf_co_dispatch_msg t set t.deal_flag='Q' where t.msg_id in (select t.msg_id from intf_"+dbNbr+".listener_record t where t.obj_id =? and t.msg_type_cd='102' )";
        PreparedStatement pstmtX1 = jdbc_Connect_Oracle.prepareStatement(sql1);
        pstmtX1.setString(1, cust_so_number);
        pstmtX1.executeUpdate();
        PreparedStatement pstmtX2 = jdbc_Connect_Oracle.prepareStatement(sql2);
        pstmtX2.setString(1, CustOrderId);
        pstmtX2.executeUpdate();
        PreparedStatement pstmtX3 = jdbc_Connect_Oracle.prepareStatement(sql3);
        pstmtX3.setString(1, CustOrderId);
        pstmtX3.executeUpdate();
        PreparedStatement pstmtX4 = jdbc_Connect_Oracle.prepareStatement(sql4);
        pstmtX4.setString(1, CustOrderId);
        pstmtX4.executeUpdate();
        PreparedStatement pstmtX5 = jdbc_Connect_Oracle.prepareStatement(sql5);
        pstmtX5.setString(1, CustOrderId);
        pstmtX5.executeUpdate();
        PreparedStatement pstmtX6 = jdbc_Connect_Oracle.prepareStatement(sql6);
        pstmtX6.setString(1, CustOrderId);
        pstmtX6.executeUpdate();
        PreparedStatement pstmtX7 = jdbc_Connect_Oracle.prepareStatement(sql7);
        pstmtX7.setString(1, CustOrderId);
        pstmtX7.executeUpdate();
        String sql11="select distinct access_nbr  from crm_app_"+dbNbr+".order_item where cust_order_id =? order by access_nbr";
        PreparedStatement pstmtX11 = jdbc_Connect_Oracle.prepareStatement(sql11);
	    pstmtX11.setString(1, CustOrderId);
	    ResultSet result = pstmtX11.executeQuery();
	    String phonenumber=null;
        if (result.next())    {
        	phonenumber=result.getString(1);
        }
        System.out.println(phonenumber);
        String sql21="UPDATE crm_app_"+dbNbr+".phone_number pn  SET pn.status_cd  = '1004', pn.description = pn.description || substr(to_char(sysdate, 'yyyymmdd'), 5, 4) ||'手工恢复以重新下省' where pn.phone_number =?  and pn.status_cd  = '1099' ";
        PreparedStatement pstmtX21 = jdbc_Connect_Oracle.prepareStatement(sql21);
        pstmtX21.setString(1, phonenumber);
        pstmtX21.executeUpdate();
        String sql22="UPDATE crm_app_"+dbNbr+".mkt_res_inst mri SET status_cd  = '1108', mri.remark = mri.remark ||substr(to_char(sysdate, 'yyyymmdd'), 5, 4) ||'手工恢复以重新下省' where mri.mkt_res_inst_code in (select distinct coupon_instance_number from crm_app_"+dbNbr+".bo_2_coupon a where order_item_id in (select b.order_item_id from crm_app_"+dbNbr+".order_item b where b.cust_order_id =?   ))";
        PreparedStatement pstmtX22 = jdbc_Connect_Oracle.prepareStatement(sql22);
        pstmtX22.setString(1, CustOrderId);
        pstmtX22.executeUpdate();
        String sql23="UPDATE crm_app_"+dbNbr+".mkt_res_uim_inst mrui SET status_cd  = '1108',mrui.remark = mrui.remark ||substr(to_char(sysdate, 'yyyymmdd'), 5, 4) ||'手工恢复以重新下省renj' where mrui.mkt_res_inst_code in (select distinct coupon_instance_number from crm_app_"+dbNbr+".bo_2_coupon a where order_item_id in (select b.order_item_id from crm_app_"+dbNbr+".order_item b where b.cust_order_id =?  ))";
        PreparedStatement pstmtX23 = jdbc_Connect_Oracle.prepareStatement(sql23);
        pstmtX23.setString(1, CustOrderId);
        pstmtX23.executeUpdate();
		jdbc_Connect_Oracle.close();
		} catch (SQLException e1)
	    {e1.printStackTrace();   }  
        
	}
	}
}

