<jsp:useBean id="name" scope="request" type="java.lang.String"/>
<%@page pageEncoding="UTF-8" %>
<html>
    <head>
        <title>welcome to hope framework</title>
    </head>
    <body>
        <h1>欢迎来到${name}</h1>
    </body>
</html>