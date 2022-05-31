<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

    <link rel = "stylesheet" href = "homePage.css" >
<script>
function save()
{
	windows.open("details saved !!");
	}
</script>
</head>
<body>
  <div class ="heading">
    <h2 id ="myHeader">CRM - Customer Relationship Manager</h2>
    </div>
    <div class="SavePage">
   <h3> Save Customer</h3>
  </div>
  <!-- <div class ="heading">
    <h2 id ="myHeader">CRM - Customer Relationship Manager</h2>
    </div>
    <div class="SavePage">
   <h3> Save Customer</h3>
  </div>

  <div class = "field">

  <label for="firstName">First name:</label>
  <input id="input" type = "text" name = "firstName">
</div>
  <br>
  <div class = "field">
  <label for="lastName">Last name:</label>
  <input type = "text" name = "lastName">
</div>
  <br>
<div class = "field">
  <label for="email">Emal:</label>
  <input type = "email" name = "email">
  </div> -->

  <form action = "save" method="post" modelAttribute = "customer">

     <table>
       <tr>
         <td>First Name:</td>
         <td>
           <input type = "text" name="firstName">
         </td>
       </tr>

       <tr>
        <td>Last Name:</td>
        <td>
          <input type = "text" name="lastName">
        </td>
      </tr>

      <tr>
        <td>Email:</td>
        <td>
          <input type = "email" name="Email">
        </td>
      </tr>

      </table>

      <div class = "saveButton">
        <button id="button" onclick = "save()" >Save</button>
      </div>

  </form>
  <div class = "link">
<a  href = "index.jsp" targt = "_blank">Back to List</a>
</div>
</body>
</html>