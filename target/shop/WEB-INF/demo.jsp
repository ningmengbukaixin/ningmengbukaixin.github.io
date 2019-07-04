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
<script type="text/javascript" src="${path}/static/jquery-3.3.1.min.js"></script>
<body>

<i id="but">测试</i>
${userName}
${userPass}

<script type="text/javascript">
$(function () {
    $("#but").click(function () {
        location.href="${path}/test";
    })
})

</script>
</body>
</html>
