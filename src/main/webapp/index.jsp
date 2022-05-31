<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
    <link rel = "stylesheet" href = "homePage.css" >
    <script type="text/javascript">
    function addCustomer(){
    document.forms[0].action = "addCustomer";
    document.submit();
    }
    </script>
</head>
<body>
<form method = "post">
 <div class ="heading">
    <h2 id ="myHeader">CRM - Customer Relationship Manager</h2>
    </div>
    <br>
    <button id ="mybutton" type = "submit" onclick="addCustomer()">Add Customer</button>
    </form>
</body>
</html>