<%-- 
    Document   : menuEntry
    Created on : 9-Dec-2014, 10:35:46 PM
    Author     : Behn
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<html:html lang="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Entry</title>
        
        <html:base/>
    </head>
    <spring:nestedPath path="menuEntry">
        <form action="addMenuEntry" method="post">
            <body>

                <h2>Please provide the weekly menu</h2>
                
                <p>Please write out the menu for the week.</p></br>
                
                <table>
                    <caption>Sunday</caption>
                    <tr>
                        <td>Meal Name:</td>
                        <td><form:input path="mealNameSunday"/>
                        </td>
                    </tr>          
                    <tr>
                        <td>Meal Price:</td>
                        <td><form:input path="mealPriceSunday" />
                        </td>
                    </tr>
                    <tr>
                        <td>Meal Description:</td>
                        <td><form:input path="mealDescriptionSunday" />
                        </td>
                    </tr>
                    <tr>
                        <td>Meal Allergens:</td>
                        <td><form:input path="mealAllergensSunday" />
                        </td>
                    </tr>         
                </table><br>
                        
                <table>
                    <caption>Monday</caption>
                    <tr>
                        <td>Meal Name:</td>
                        <td><form:input path="mealNameMonday"/>
                        </td>
                    </tr>          
                    <tr>
                        <td>Meal Price:</td>
                        <td><form:input path="mealPriceMonday" />
                        </td>
                    </tr>
                    <tr>
                        <td>Meal Description:</td>
                        <td><form:input path="mealDescriptionMonday" />
                        </td>
                    </tr>
                    <tr>
                        <td>Meal Allergens:</td>
                        <td><form:input path="mealAllergensMonday" />
                        </td>
                    </tr>         
                </table><br>
                        
                <table>
                    <caption>Tuesday</caption>
                    <tr>
                        <td>Meal Name:</td>
                        <td><form:input path="mealNameTuesday"/>
                        </td>
                    </tr>          
                    <tr>
                        <td>Meal Price:</td>
                        <td><form:input path="mealPriceTuesday" />
                        </td>
                    </tr>
                    <tr>
                        <td>Meal Description:</td>
                        <td><form:input path="mealDescriptionTuesday" />
                        </td>
                    </tr>
                    <tr>
                        <td>Meal Allergens:</td>
                        <td><form:input path="mealAllergensTuesday" />
                        </td>
                    </tr>         
                </table><br>
                        
                <table>
                    <caption>Wednesday</caption>
                    <tr>
                        <td>Meal Name:</td>
                        <td><form:input path="mealNameWednesday"/>
                        </td>
                    </tr>          
                    <tr>
                        <td>Meal Price:</td>
                        <td><form:input path="mealPriceWednesday" />
                        </td>
                    </tr>
                    <tr>
                        <td>Meal Description:</td>
                        <td><form:input path="mealDescriptionWednesday" />
                        </td>
                    </tr>
                    <tr>
                        <td>Meal Allergens:</td>
                        <td><form:input path="mealAllergensWednesday" />
                        </td>
                    </tr>         
                </table><br>
                        
                <table>
                    <caption>Thursday</caption>
                    <tr>
                        <td>Meal Name:</td>
                        <td><form:input path="mealNameThursday"/>
                        </td>
                    </tr>          
                    <tr>
                        <td>Meal Price:</td>
                        <td><form:input path="mealPriceThursday" />
                        </td>
                    </tr>
                    <tr>
                        <td>Meal Description:</td>
                        <td><form:input path="mealDescriptionThursday" />
                        </td>
                    </tr>
                    <tr>
                        <td>Meal Allergens:</td>
                        <td><form:input path="mealAllergensThursday" />
                        </td>
                    </tr>         
                </table><br>
                        
                <table>
                    <caption>Friday</caption>
                    <tr>
                        <td>Meal Name:</td>
                        <td><form:input path="mealNameFriday"/>
                        </td>
                    </tr>          
                    <tr>
                        <td>Meal Price:</td>
                        <td><form:input path="mealPriceFriday" />
                        </td>
                    </tr>
                    <tr>
                        <td>Meal Description:</td>
                        <td><form:input path="mealDescriptionFriday" />
                        </td>
                    </tr>
                    <tr>
                        <td>Meal Allergens:</td>
                        <td><form:input path="mealAllergensFriday" />
                        </td>
                    </tr>         
                </table><br>
                        
                <table>
                    <caption>Saturday</caption>
                    <tr>
                        <td>Meal Name:</td>
                        <td><form:input path="mealNameSaturday"/>
                        </td>
                    </tr>          
                    <tr>
                        <td>Meal Price:</td>
                        <td><form:input path="mealPriceSaturday" />
                        </td>
                    </tr>
                    <tr>
                        <td>Meal Description:</td>
                        <td><form:input path="mealDescriptionSaturday" />
                        </td>
                    </tr>
                    <tr>
                        <td>Meal Allergens:</td>
                        <td><form:input path="mealAllergensSaturday" />
                        </td>
                    </tr>         
                </table><br>
                    
                <table>    
                    <tr>
                        <td colspan="2">
                            <input type="submit" value="Submit"/>
                        </td>
                    </tr>
                </table>
                    
            </body>
        </form>
    </spring:nestedPath>

</html:html>