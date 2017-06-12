<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
		<h1>迪杰斯特拉算法</h1>
		<hr>
		<form action="Dijkstra" method="post">
			<table>
				<tr>
					<td>请输入顶点1到各顶点的距离</td>
					<td><input name="v1" id="v12"/></td>
					<td><input name="v1" id="v13"/></td>
					<td><input name="v1" id="v14"/></td>
					<td><input name="v1" id="v15"/></td>
				</tr>
				<tr>
					<td>请输入顶点2到各顶点的距离</td>
					<td><input name="v2" id="v23"/></td>
					<td><input name="v2" id="v24"/></td>
					<td><input name="v2" id="v25"/></td>
				</tr>
				<tr>
					<td>请输入顶点3到各顶点的距离</td>
					<td><input name="v3" id="v34"/></td>
					<td><input name="v3" id="v35"/></td>
				</tr>
				<tr>
					<td>请输入顶点4到各顶点的距离</td>
					<td><input name="v4" id="v45"/></td>
				</tr>
			</table>
			<input type="submit" value="提交"/>
			<br><br>
			<table>
			参考内容
			<tr>
				<td>10</td><td>200</td><td>200</td><td>200</td>
			</tr>
			<tr>
				<td>20</td><td>200</td><td>200</td>
			</tr>
			<tr>	
				<td>30</td><td>200</td>
			</tr>
			<tr>	
				<td>40</td>
			</tr>
			</table>
		</form>
	</center>
</body>
</html>