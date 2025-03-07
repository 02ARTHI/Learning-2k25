<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>form page</title>
</head>
<body>
 <form:form action="registerCustomer" modelAttribute="employee">
      <table>
          <form:hidden path="id"/>
          <tr>
          <th>Customer First Name</th>
          <td><form:input path="firstName" /></td>
          </tr>
              <tr>
          <th>Customer Last Name</th>
          <td><form:input path="lastName" /></td>
          </tr>
              <tr>
          <th>Customer City</th>
          <td><form:input path="city" /></td>
          </tr>
          
                <tr>
          
          <td><input type="submit" value="Register"/></td>
          </tr>
      </table>
  </form:form>
</body>
</html>