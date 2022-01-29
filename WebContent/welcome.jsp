<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
hi customer
<form action="csubmit.jsp" method="post">
<label for="stock">Choose a stock:</label>
  <select name="cars" id="cars">
    <option value="dbs">dbs</option>
    <option value="hdfc">hdfc</option>
    <option value="sbi">sbi</option>
    <option value="indian">indian</option>
  </select>
  <br><br>
  <label for="ordertype">order type</label>
  <select name="cars" id="cars">
    <option value="limit">limit</option>
    <option value="market">market</option>
  </select>
  <br><br>
  price:<input type="value" name="price">
    <br><br>
  quantity:<input type="value" name="quantity">
  <br>
  <br>
  <input type="submit">
 </form>
  
</body>
</html>