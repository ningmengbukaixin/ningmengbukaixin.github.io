<%--

  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    application.setAttribute("path", request.getContextPath());
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script type="text/javascript"src="${path}/static/jquery-3.3.1.min.js"></script>
1111111111111111111

<script type="text/javascript">
    $(function () {
        var arrey = [1,2,3,4,5,6];
        var string = "123123"
        if(arrey.includes(1)){
            alert(arrey.includes(1))
        }else {
            alert(arrey.includes(6))
        }
    })



</script>
</body>
</html>
