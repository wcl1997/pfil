<%@ page import="org.apache.tomcat.jni.Time" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.TimeZone" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/11
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
-------------------------------------------
<%--<img src="D:\\img\\" alt="">--%>
<%
    Date d = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss ");
    System.out.println("格式化输出：" + sdf.format(d));
%>
    <form method="POST" action="upload" enctype="multipart/form-data">
        <input type="file" name="file" /><br/><br/>
        <input type="submit" value="Submit">
    </form>

</body>
</html>
