package remonitor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class db4Gconnection {
    private static String crm0102GdJsDbConnectionUrl = "jdbc:oracle:thin:@(DESCRIPTION = (ADDRESS_LIST =(ADDRESS = (PROTOCOL = TCP)(HOST = 10.128.21.88)(PORT = 15551))) (CONNECT_DATA = (SERVICE_NAME = gdjswpr)))";
    private static String crm0304ScZjDbConnectionUrl = "jdbc:oracle:thin:@(DESCRIPTION = (ADDRESS_LIST =(ADDRESS = (PROTOCOL = TCP)(HOST =10.128.21.88)(PORT = 15552))) (CONNECT_DATA = (SERVICE_NAME = sczjwpr)))";
    private static String crm0506AhSxDbConnectionUrl = "jdbc:oracle:thin:@(DESCRIPTION = (ADDRESS_LIST =(ADDRESS = (PROTOCOL = TCP)(HOST =10.128.21.88)(PORT = 15553))) (CONNECT_DATA = (SERVICE_NAME = ahsxwpr)))";
    private static String crm0708FjShDbConnectionUrl = "jdbc:oracle:thin:@(DESCRIPTION = (ADDRESS_LIST =(ADDRESS = (PROTOCOL = TCP)(HOST =10.128.21.88)(PORT = 15554))) (CONNECT_DATA = (SERVICE_NAME = fjshwpr)))";
    private static String crm09HbDbConnectionUrl = "jdbc:oracle:thin:@(DESCRIPTION = (ADDRESS_LIST =(ADDRESS = (PROTOCOL = TCP)(HOST =10.128.21.88)(PORT = 15500))) (CONNECT_DATA = (SID = hb01wpr1)))";
    private static String crm10NmDbConnectionUrl = "jdbc:oracle:thin:@(DESCRIPTION = (ADDRESS_LIST =(ADDRESS = (PROTOCOL = TCP)(HOST =10.128.21.88)(PORT = 15500))) (CONNECT_DATA = (SID = nm01wpr1)))";
    private static String crm1112HnLnDbConnectionUrl = "jdbc:oracle:thin:@(DESCRIPTION = (ADDRESS_LIST =(ADDRESS = (PROTOCOL = TCP)(HOST =10.128.21.88)(PORT = 15556))) (CONNECT_DATA = (SERVICE_NAME = hnlnwpr)))";
    private static String crm1314HbGzDbConnectionUrl = "jdbc:oracle:thin:@(DESCRIPTION = (ADDRESS_LIST =(ADDRESS = (PROTOCOL = TCP)(HOST =10.128.21.88)(PORT = 15557))) (CONNECT_DATA = (SERVICE_NAME = hbgzwpr)))";
    private static String crm1516SdCqDbConnectionUrl = "jdbc:oracle:thin:@(DESCRIPTION = (ADDRESS_LIST =(ADDRESS = (PROTOCOL = TCP)(HOST =10.128.21.88)(PORT = 15558))) (CONNECT_DATA = (SERVICE_NAME = sdcqwpr)))";
    private static String crm1718XjBjDbConnectionUrl = "jdbc:oracle:thin:@(DESCRIPTION = (ADDRESS_LIST =(ADDRESS = (PROTOCOL = TCP)(HOST =10.128.21.88)(PORT = 15559))) (CONNECT_DATA = (SERVICE_NAME = xjbjwpr)))";
    private static String crm1920TjJxDbConnectionUrl = "jdbc:oracle:thin:@(DESCRIPTION = (ADDRESS_LIST =(ADDRESS = (PROTOCOL = TCP)(HOST =10.128.21.88)(PORT = 15560))) (CONNECT_DATA = (SERVICE_NAME = tjjxwpr)))";
    private static String crm2122QhGsDbConnectionUrl = "jdbc:oracle:thin:@(DESCRIPTION = (ADDRESS_LIST =(ADDRESS = (PROTOCOL = TCP)(HOST =10.128.21.88)(PORT = 15561))) (CONNECT_DATA = (SERVICE_NAME = qhgswpr)))";
    private static String crm2324JlHnDbConnectionUrl = "jdbc:oracle:thin:@(DESCRIPTION = (ADDRESS_LIST =(ADDRESS = (PROTOCOL = TCP)(HOST =10.128.21.88)(PORT = 15562))) (CONNECT_DATA = (SERVICE_NAME = jlhnwpr)))";
    private static String crm2526HlYnDbConnectionUrl = "jdbc:oracle:thin:@(DESCRIPTION = (ADDRESS_LIST =(ADDRESS = (PROTOCOL = TCP)(HOST =10.128.21.88)(PORT = 15563))) (CONNECT_DATA = (SERVICE_NAME = ljynwpr)))";
    private static String crm2728GxSxDbConnectionUrl = "jdbc:oracle:thin:@(DESCRIPTION = (ADDRESS_LIST =(ADDRESS = (PROTOCOL = TCP)(HOST =10.128.21.88)(PORT = 15564))) (CONNECT_DATA = (SERVICE_NAME = gxsxwpr)))";
    private static String crm293031HnNxXzDbConnectionUrl = "jdbc:oracle:thin:@(DESCRIPTION = (ADDRESS_LIST =(ADDRESS = (PROTOCOL = TCP)(HOST =10.128.21.88)(PORT = 15565))) (CONNECT_DATA = (SERVICE_NAME = hnxzwpr)))";
    private static String crmAllCsbLogDbConnectionUrl = "jdbc:oracle:thin:@(DESCRIPTION =(ADDRESS_LIST =(ADDRESS = (PROTOCOL = TCP)(HOST = 10.128.109.179)(PORT = 3436)))(CONNECT_DATA =(SID = lg18rpr)))";
    private static String crm4GReadDbonnectionUrl = "jdbc:oracle:thin:@(DESCRIPTION =(ADDRESS_LIST =(ADDRESS = (PROTOCOL = TCP)(HOST = 10.128.21.89)(PORT = 15500)))(CONNECT_DATA =(SERVICE_NAME = rd01rpr)))";
    private static String user = "xiahx";// 用户名 
    private static String password = "xiahx_123";//  密码
    private static String className = "oracle.jdbc.driver.OracleDriver";
    public static Connection getCrm0102GdJsDbConnection() {
    	Connection conn=null;
    	try
        {
            Class.forName(className);// 加载Oracle驱动程序
         } catch (ClassNotFoundException e)
          { e.printStackTrace();}

        try
        {
        	conn = DriverManager.getConnection(crm0102GdJsDbConnectionUrl, user, password);// 获取连接
            System.out.println("广东江苏数据库连接建立成功...");
        } catch (SQLException e) {
          e.printStackTrace();}
    return conn;
    }
	    public static Connection getCrm0304ScZjDbConnection() {
	    	Connection conn=null;
	    	try
	        {
	            Class.forName(className);// 加载Oracle驱动程序
	         } catch (ClassNotFoundException e)
	          { e.printStackTrace();}

	        try
	        {
	        	conn = DriverManager.getConnection(crm0304ScZjDbConnectionUrl, user, password);// 获取连接
	            System.out.println("四川浙江数据库连接建立成功...");
	        } catch (SQLException e) {
	          e.printStackTrace();}
	    return conn;
	    }

	    public static Connection getCrm0506AhSxDbConnection() {
	    	Connection conn=null;
	    	try
	        {
	            Class.forName(className);// 加载Oracle驱动程序
	         } catch (ClassNotFoundException e)
	          { e.printStackTrace();}

	        try
	        {
	        	conn = DriverManager.getConnection(crm0506AhSxDbConnectionUrl, user, password);// 获取连接
	            System.out.println("安徽陕西数据库连接建立成功...");
	        } catch (SQLException e) {
	          e.printStackTrace();}
	    return conn;
	    }

	    public static Connection getCrm0708FjShDbConnection() {
	    	Connection conn=null;
	    	try
	        {
	            Class.forName(className);// 加载Oracle驱动程序
	         } catch (ClassNotFoundException e)
	          { e.printStackTrace();}

	        try
	        {
	        	conn = DriverManager.getConnection(crm0708FjShDbConnectionUrl, user, password);// 获取连接
	            System.out.println("福建上海数据库连接建立成功...");
	        } catch (SQLException e) {
	          e.printStackTrace();}
	    return conn;
	    }

	    public static Connection getCrm09HbDbConnection() {
	    	Connection conn=null;
	    	try
	        {
	            Class.forName(className);// 加载Oracle驱动程序
	         } catch (ClassNotFoundException e)
	          { e.printStackTrace();}

	        try
	        {
	        	conn = DriverManager.getConnection(crm09HbDbConnectionUrl, user, password);// 获取连接
	            System.out.println("河北数据库连接建立成功...");
	        } catch (SQLException e) {
	          e.printStackTrace();}
	    return conn;
	    }

	    public static Connection getCrm10NmDbConnection() {
	    	Connection conn=null;
	    	try
	        {
	            Class.forName(className);// 加载Oracle驱动程序
	         } catch (ClassNotFoundException e)
	          { e.printStackTrace();}

	        try
	        {
	        	conn = DriverManager.getConnection(crm10NmDbConnectionUrl, user, password);// 获取连接
	            System.out.println("内蒙古数据库连接建立成功...");
	        } catch (SQLException e) {
	          e.printStackTrace();}
	    return conn;
	    }

	    public static Connection getCrm1112HnLnDbConnection() {
	    	Connection conn=null;
	    	try
	        {
	            Class.forName(className);// 加载Oracle驱动程序
	         } catch (ClassNotFoundException e)
	          { e.printStackTrace();}

	        try
	        {
	        	conn = DriverManager.getConnection(crm1112HnLnDbConnectionUrl, user, password);// 获取连接
	            System.out.println("湖南辽宁数据库连接建立成功...");
	        } catch (SQLException e) {
	          e.printStackTrace();}
	    return conn;
	    }

	    public static Connection getCrm1314HbGzDbConnection() {
	    	Connection conn=null;
	    	try
	        {
	            Class.forName(className);// 加载Oracle驱动程序
	         } catch (ClassNotFoundException e)
	          { e.printStackTrace();}

	        try
	        {
	        	conn = DriverManager.getConnection(crm1314HbGzDbConnectionUrl, user, password);// 获取连接
	            System.out.println("湖北贵州数据库连接建立成功...");
	        } catch (SQLException e) {
	          e.printStackTrace();}
	    return conn;
	    }

	    public static Connection getCrm1516SdCqDbConnection() {
	    	Connection conn=null;
	    	try
	        {
	            Class.forName(className);// 加载Oracle驱动程序
	         } catch (ClassNotFoundException e)
	          { e.printStackTrace();}

	        try
	        {
	        	conn = DriverManager.getConnection(crm1516SdCqDbConnectionUrl, user, password);// 获取连接
	            System.out.println("山东重庆数据库连接建立成功...");
	        } catch (SQLException e) {
	          e.printStackTrace();}
	    return conn;
	    }

	    public static Connection getCrm1718XjBjDbConnection() {
	    	Connection conn=null;
	    	try
	        {
	            Class.forName(className);// 加载Oracle驱动程序
	         } catch (ClassNotFoundException e)
	          { e.printStackTrace();}

	        try
	        {
	        	conn = DriverManager.getConnection(crm1718XjBjDbConnectionUrl, user, password);// 获取连接
	            System.out.println("新疆北京数据库连接建立成功...");
	        } catch (SQLException e) {
	          e.printStackTrace();}
	    return conn;
	    }

	    public static Connection getCrm1920TjJxDbConnection() {
	    	Connection conn=null;
	    	try
	        {
	            Class.forName(className);// 加载Oracle驱动程序
	         } catch (ClassNotFoundException e)
	          { e.printStackTrace();}

	        try
	        {
	        	conn = DriverManager.getConnection(crm1920TjJxDbConnectionUrl, user, password);// 获取连接
	            System.out.println("天津江西数据库连接建立成功...");
	        } catch (SQLException e) {
	          e.printStackTrace();}
	    return conn;
	    }

	    public static Connection getCrm2122QhGsDbConnection() {
	    	Connection conn=null;
	    	try
	        {
	            Class.forName(className);// 加载Oracle驱动程序
	         } catch (ClassNotFoundException e)
	          { e.printStackTrace();}

	        try
	        {
	        	conn = DriverManager.getConnection(crm2122QhGsDbConnectionUrl, user, password);// 获取连接
	            System.out.println("青海甘肃数据库连接建立成功...");
	        } catch (SQLException e) {
	          e.printStackTrace();}
	    return conn;
	    }

	    public static Connection getCrm2324JlHnDbConnection() {
	    	Connection conn=null;
	    	try
	        {
	            Class.forName(className);// 加载Oracle驱动程序
	         } catch (ClassNotFoundException e)
	          { e.printStackTrace();}

	        try
	        {
	        	conn = DriverManager.getConnection(crm2324JlHnDbConnectionUrl, user, password);// 获取连接
	            System.out.println("吉林河南数据库连接建立成功...");
	        } catch (SQLException e) {
	          e.printStackTrace();}
	    return conn;
	    }

	    public static Connection getCrm2526HlYnDbConnection() {
	    	Connection conn=null;
	    	try
	        {
	            Class.forName(className);// 加载Oracle驱动程序
	         } catch (ClassNotFoundException e)
	          { e.printStackTrace();}

	        try
	        {
	        	conn = DriverManager.getConnection(crm2526HlYnDbConnectionUrl, user, password);// 获取连接
	            System.out.println("黑龙江云南数据库连接建立成功...");
	        } catch (SQLException e) {
	          e.printStackTrace();}
	    return conn;
	    }

	    public static Connection getCrm2728GxSxDbConnection() {
	    	Connection conn=null;
	    	try
	        {
	            Class.forName(className);// 加载Oracle驱动程序
	         } catch (ClassNotFoundException e)
	          { e.printStackTrace();}

	        try
	        {
	        	conn = DriverManager.getConnection(crm2728GxSxDbConnectionUrl, user, password);// 获取连接
	            System.out.println("广西山西数据库连接建立成功...");
	        } catch (SQLException e) {
	          e.printStackTrace();}
	    return conn;
	    }

	    public static Connection getCrm293031HnNxXzDbConnection() {
	    	Connection conn=null;
	    	try
	        {
	            Class.forName(className);// 加载Oracle驱动程序
	         } catch (ClassNotFoundException e)
	          { e.printStackTrace();}

	        try
	        {
	        	conn = DriverManager.getConnection(crm293031HnNxXzDbConnectionUrl, user, password);// 获取连接
	            System.out.println("海南宁夏西藏数据库连接建立成功...");
	        } catch (SQLException e) {
	          e.printStackTrace();}
	    return conn;
	    }
	    
	    public static Connection crmAllCsbLogDbConnection() {
	    	Connection conn=null;
	    	try
	        {
	            Class.forName(className);// 加载Oracle驱动程序
	         } catch (ClassNotFoundException e)
	          { e.printStackTrace();}

	        try
	        {
	        	conn = DriverManager.getConnection(crmAllCsbLogDbConnectionUrl, "xiebc", "xiebc234");// 获取连接
	            System.out.println("log13读库数据库连接建立成功...");
	        } catch (SQLException e) {
	          e.printStackTrace();}
	    return conn;
	    }
	    
	    public static Connection crm4GReadDbonnection() {
	    	Connection conn=null;
	    	try
	        {
	            Class.forName(className);// 加载Oracle驱动程序
	         } catch (ClassNotFoundException e)
	          { e.printStackTrace();}

	        try
	        {
	        	conn = DriverManager.getConnection(crm4GReadDbonnectionUrl, "xiebc", "xiebc");// 获取连接
	            System.out.println("4G读库数据库连接建立成功...");
	        } catch (SQLException e) {
	          e.printStackTrace();}
	    return conn;
	    }
	    public static void close(Connection c) {
	    	if (c != null) {
	    	try {
	    	c.close();
	    	} catch (Throwable e) {
	    	e.printStackTrace();
	    	}
	    	}
	    	}

	    	public static void close(PreparedStatement c) {
	    	if (c != null) {
	    	try {
	    	c.close();
	    	} catch (Throwable e) {
	    	e.printStackTrace();
	    	}
	    	}
	    	}
	}



