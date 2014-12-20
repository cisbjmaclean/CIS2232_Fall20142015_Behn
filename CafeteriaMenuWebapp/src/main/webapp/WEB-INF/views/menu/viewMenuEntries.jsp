<%-- 
    Document   : viewMenuEntries
    Created on : 9-Dec-2014
    Final copy : 20-Dec-2014, 1:02 AM 
    Author     : Behn
    CIS-2232   : Advanced Object Oriented Programming
    Final Project
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<spring:nestedPath path="menu">
    <form action="" method="post">
        <table>
            <tr>
                <td colspan="5">
                    <b>${message}</b>
                </td>
            </tr>
            <tr>
                <th>Day</th>
                <th>Name</th>
                <th>Price</th>
                <th>Description</th>
                <th>Allergens</th>
            </tr>
            <c:forEach var="thisEntry" items="${menu}"
                       varStatus="loopCounter">
                <tr>
                    <td><c:out value="${thisEntry.getMealDay()}" /></td>
                    <td><c:out value="${thisEntry.getMealName()}" /></td>
                    <td><c:out value="${thisEntry.getMealPrice()}" /></td>
                    <td><c:out value="${thisEntry.getMealDescription()}" /></td>
                    <td><c:out value="${thisEntry.getMealAllergens()}" /></td>
                </tr>
            </c:forEach>




        </table>
    </form>
</spring:nestedPath>