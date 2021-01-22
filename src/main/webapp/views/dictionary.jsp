<%--
  Created by IntelliJ IDEA.
  User: luong
  Date: 1/21/2021
  Time: 3:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page pageEncoding="UTF-8" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<form action="/vocabulary" method="post" style="display: inline; border: 1px black" >
    <fieldset style="display: inline">
        <legend style="display: inline"> Dictionary </legend>
        <select name="chooseOption" id="">
            <c:choose>
                <c:when test="${chooseOption.equals('eng')}">
                    <option value="eng">ENG-VN</option>
                    <option value="vn" >VN-ENG</option>
                </c:when>
                <c:otherwise>
                    <option value="vn" >VN-ENG</option>
                    <option value="eng">ENG-VN</option>
                </c:otherwise>
            </c:choose>

        </select>
        <input type="text" name="vocabulary" value="${vocabulary}" placeholder="Input word search"/>
        <input type="text" name="result" value="${result}" placeholder="result" disabled/>
        <input type="submit" value="Search" >
    </fieldset>
</form>
<%--<input type="text" name="vocabularyEng">--%>
<%--<input type="text" name="vocabularyVN"/>--%>
</body>
</html>
