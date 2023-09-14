<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Todo Page</title>
</head>
<body>
	<h1>Your To-dos, ${name}</h1>
	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Description</th>
				<th>Target Date</th>
				<th>Is Done?</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="todo" items="${todos}">
				<tr>
					<td>${todo.id}</td>
					<td>${todo.desc}</td>
					<td>${todo.targetDate}</td>
					<td>${todo.isDone}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>