<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Simple Calculator</h1>
<br/>
<form action="/calculator" method="get">
    <fieldset>
        <legend>Calculator</legend>
        <label for="f_operand">First operand:</label><br>
        <input type="text" id="f_operand" name="f_operand" value="1"><br>
        <label for="operator">Operator:</label><br>
        <select name="operator" id="operator">
            <option value="+">Add</option>
            <option value="-">Subtract</option>
            <option value="*">Multiply</option>
            <option value="/">Divide</option>
        </select>
        <br>
        <label for="s_operand">Second operand:</label><br>
        <input type="text" id="s_operand" name="s_operand" value="1"><br><br>
        <input type="submit" value="Submit">
    </fieldset>
</form>
</body>
</html>