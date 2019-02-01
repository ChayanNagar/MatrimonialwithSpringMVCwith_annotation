<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <style>
  h1{
  color:red
 }
 label
{
font-size:18px;
font-family: comic sans ms;
color:#424bf4;
}
button {
  background-color: #4CAF50;
  color: orange;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 40%;
}

button:hover {
  opacity: 0.8;
  </style>

<title>Registration Page</title>
</head>
<body>
<h1 align="center">Register For Free</h1>
 <h1 align="center"><font color="orange">${welcomemsg}</font></h1>
<h4 align="right"><a href="login">For Login Click Here</a></h4>

<div class="container">
	<div class="col-sm-3">
    
<form action="registration" method="post">
  
    <h2>${msg}</h2>
     <div class="form-group">
    <label for="Name"> Name:</label>
    <input type="text" class="form-control" name="name" id="name" required>
  </div>
 
  <div class="form-group">
    <label for="gender">Gender:</label>
    <input type="radio" name="gender" value="Male">Male
    <input type="radio" name="gender" value="Female">Female
    <input type="radio" name="gender" value="Female">Other
  </div>
  
  <div class="form-group">
    <label for="dob">Date Of Birth:</label>
    <input type="text" class="form-control" name="dob" id="name" required>
     </div>

   <div class="form-group">
    <label for="religion">Religion:</label>
      <select name="religion">
     <option value="hindu">Hindu</option>
     <option value="muslim">Muslim</option>
     <option value="sikh">Sikh</option>
     <option value="christian">Christian</option>
      </select>
     </div>
     
     <div class="form-group">
    <label for="mtongue">Mother Tongue:</label>
    <input type="text" class="form-control" name="tongue" id="name" required>
           </div>
     
     <div class="form-group">
    <label for="caste">Caste/Divison:</label>
    <input type="text" class="form-control" name="caste" id="name" required>
           </div>
 
   <div class="form-group">
    <label for="country">Country:</label>
    <input type="text" class="form-control" name="country" id="name" required>
           </div>
 
   <div class="form-group">
    <label for="mobile">Mobile Number:</label>
    <input type="text" class="form-control" name="mnumber"  id="name" required>
           </div>
           
     <div class="form-group">
    <label for="email">Email Id:</label>
    <input type="text" class="form-control" name="email" id="name" required>
           </div>
    
     <div class="form-group">
    <label for="password">Password:</label>
    <input type="text" class="form-control" name="password"  id="name" required>
           </div>
     <button type="submit" class="btn btn-primary">Submit</button>
     </form>
     
   </div>
</div>

</body>
</html>