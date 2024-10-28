<!Doctype html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>

<body>
    <h1> This is the home page </h1>
    <h2> Called by the Home Controller </h2>
    <h3> The value is : <%
      Integer n = (Integer) request.getAttribute("id");

      %> </h3>
      <h3> <%= n %> </h3>
</body>
</html>