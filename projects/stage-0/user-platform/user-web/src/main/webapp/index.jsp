<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<head>
    <jsp:directive.include
            file="/WEB-INF/jsp/prelude/include-head-meta.jspf"/>
    <title>My Home Page</title>
    <base href="<%=basePath%>">
</head>
<body>
<center>
    <form action="<%=basePath%>user/register" method="post">
        <table border="1px" width="438px">
            <tr align="center">
                <td>用户名</td>
                <td>
                    <input type="text" name="username">
                </td>
            </tr>
            <tr align="center">
                <td>密码</td>
                <td>
                    <input type="password" name="password">
                </td>
            </tr>
            <tr align="center">
                <td colspan="2">
                    <input type="submit" value="用户登录">

                    <input type="reset" value="重置内容">
                </td>
            </tr>
        </table>
    </form>
</center>
</body>