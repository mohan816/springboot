<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
  <h1>sign up page</h1>
  <form:form action="registerUser" modelAttribute="user">
  Name:
  <form:input path="name"/>
  <br/>
  <br/>
  Gender:
  <br/>
  Male<form:radiobutton path="gender" value="male"/>
  Female<form:radiobutton path="gender" value="female"/>
  <br/>
  <br/>
  Location:
   <form:select path="location">
   <form:option value="India"></form:option>
   <form:option value="USA"></form:option>
   </form:select>
  College:
  <br/>
  <br/>
  <form:select path="College">
   <form:option value="VIT"></form:option>
   <form:option value="NIT"></form:option>
   </form:select>
  </form:form>
</body>
</html>