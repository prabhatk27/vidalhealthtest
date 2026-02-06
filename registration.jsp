<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<h2>Student Registration</h2>

<form action="registerEmp" method="post">
    Name: <input type="text" name="name"/><br><br>
    Reg no: <input type="text" name="regNo"/><br><br>
    Email: <input type="email" name="email"/><br><br>
    
    <input type="submit" value="Register"/>
</form>

<br>
<a href="view">View All Employee</a>
