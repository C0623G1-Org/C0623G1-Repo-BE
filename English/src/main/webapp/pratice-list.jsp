<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 10/2/23
  Time: 4:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Practice List</title>
</head>
<body>
<h1>Làm bài</h1>

<form>
  <c:forEach var="qs" items="${questionList}" varStatus="loop">
    <div class="form-group">
      <label for="${qs.question}" class="font-weight-bold text-capitalize">${loop.count}) ${qs.question}</label>
      <div class="form-check">
        <input class="form-check-input" type="radio" name="question_group_1" id="question_1_1" value="option1">
        <label class="form-check-label" for="question_1_1">
            ${qs.answerA}
        </label>
      </div>
      <div class="form-check">
        <input class="form-check-input" type="radio" name="question_group_1" id="question_1_2" value="option2">
        <label class="form-check-label" for="question_1_2">
            ${qs.answerB}
        </label>
      </div>
      <div class="form-check">
        <input class="form-check-input" type="radio" name="question_group_1" id="question_1_3" value="option3">
        <label class="form-check-label" for="question_1_3">
            ${qs.answerC}
        </label>
      </div>
      <div class="form-check">
        <input class="form-check-input" type="radio" name="question_group_1" id="question_1_4" value="option4">
        <label class="form-check-label" for="question_1_3">
            ${qs.answerD}
        </label>
      </div>
    </div>
  </c:forEach>
</form>
<button type="submit" name="submit">Chấm điểm</button>
</body>
</html>
