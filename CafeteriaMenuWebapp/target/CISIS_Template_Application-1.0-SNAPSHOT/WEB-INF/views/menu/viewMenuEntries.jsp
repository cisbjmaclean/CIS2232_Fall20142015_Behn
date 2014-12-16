<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<spring:nestedPath path="menu">
    <form action="" method="post">
        <table>
            <tr>
                <td colspan="3">
                    <b>${message}</b>
                </td>
            </tr>
            <c:forEach var="thisEntry" items="${menu}"
                       varStatus="loopCounter">
                <tr>
                    <td><c:out value="${thisEntry.getMealName()}" /></td>
                    <td><c:out value="${thisEntry.getMealPrice()}" /></td>
                    <td><c:out value="${thisEntry.getMealDescription()}" /></td>
                    <td><c:out value="${thisEntry.getMealAllergens()}" /></td>
                </tr>
            </c:forEach>




        </table>
    </form>
</spring:nestedPath>