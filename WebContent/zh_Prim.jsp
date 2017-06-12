<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>普利姆算法</title>
</head>
<body>
	<center>
		<h1>普利姆算法</h1>
		<hr>
		
		<form action="Prim" method="post">
			<table>
				<tr>
					<td>请输入顶点1到顶点2,3,4,5的距离</td>
					<td><input name="v1" id="v12"/></td>
					<td><input name="v1" id="v13"/></td>
					<td><input name="v1" id="v14"/></td>
					<td><input name="v1" id="v15"/></td>
				</tr>
				<tr>
					<td>请输入顶点2到顶点3,4,5的距离</td>
					<td><input name="v2" id="v23"/></td>
					<td><input name="v2" id="v24"/></td>
					<td><input name="v2" id="v25"/></td>
				</tr>
				<tr>
					<td>请输入顶点3到顶点4,5的距离</td>
					<td><input name="v3" id="v34"/></td>
					<td><input name="v3" id="v35"/></td>
				</tr>
				<tr>
					<td>请输入顶点4到顶点5的距离</td>
					<td><input name="v4" id="v45"/></td>
				</tr>
			</table>
			<input type="submit" value="提交"/>
			<br><br>
			<table>
			参考内容
			<tr>
				<td>6</td><td>9</td><td>5</td><td>3</td>
			</tr>
			<tr>
				<td>6</td><td>7</td><td>8</td>
			</tr>
			<tr>	
				<td>9</td><td>3</td>
			</tr>
			<tr>	
				<td>3</td>
			</tr>
			</table>
		</form>
	</center>
</body>
</html>