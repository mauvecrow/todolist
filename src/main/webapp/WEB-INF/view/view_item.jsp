<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="quangson.brad.util.Mappings" %>
<html>
<head>
    <title>View Items</title>
</head>
<body>
    <div align="center">
        <table>
            <caption><h2>
                <c:out value="${viewItem.title}"/>
            </h2></caption>
            <tr>
                <td><label>ID</label></td>
                <td>
                    <c:out value="${viewItem.id}"/>
                </td>
            </tr>

            <tr>
                <td><label>Deadline</label></td>
                <td>
                    <c:out value="${viewItem.deadline}"/>
                </td>
            </tr>

            <tr>
                <td><label>Details</label></td>
                <td>
                    <c:out value="${viewItem.details}"/>
                </td>
            </tr>
        </table>
        <br><br>
        <c:url var="itemList" value="${Mappings.ITEMS}" />
        <a href="${itemList}">Show Table</a>
    </div>
</body>
</html>