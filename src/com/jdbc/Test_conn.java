package com.jdbc;


import java.sql.*;

public class Test_conn {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		//使用用户名，密码连接mysql数据库
		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc","root","123456");
		//通过连接对象获取语句对象
		Statement yuju=conn.createStatement();
		//定义sql语句
		String sql="UPDATE tb_user set email='jack@qq.com' where id=1";
		//执行
		yuju.execute(sql);
	}

}
