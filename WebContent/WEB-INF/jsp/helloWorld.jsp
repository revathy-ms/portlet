<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<table border ="2">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Department</th>
        <th>Domain</th>
        <th>Pjct_id</th>
    </tr>
    <c:forEach items = "${edata}" var = "emp">
        <tr>
            <td>${emp.eid}</td>
            <td>${emp.ename}</td>
            <td>${emp.dept}</td>
            <td>${emp.domain}</td>
            <td>${emp.pid}</td>
        </tr>
    </c:forEach>
</table>

	