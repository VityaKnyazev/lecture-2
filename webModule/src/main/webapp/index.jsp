<%@ page import="by.it_academy.java_enterprise.knyazev.Logic"%>
<html>
<body>
<h2>Hello Maven World!</h2>
<% Logic logic = Logic.getInstance();
	out.println(logic.getLogicalResult());%>
</body>
</html>