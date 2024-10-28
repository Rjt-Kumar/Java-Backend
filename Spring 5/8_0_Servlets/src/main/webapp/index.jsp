<!doctype html>
<html lang="en">
<head>
     <meta charset="UTF-8" />
     <title>Welcome to Servlet for Learning </title>
          <link rel="stylesheet" href= "<%= application.getContextPath() %>/css/styles.css"/>

</head>
<body>
   <div class="container">
       <h1> Welcome To Servlet Crash Course
        </h1>

       <p> This is very informative </p>
        <p> "<%= application.getContextPath() %> " </p>
       <form action=" <%= application.getContextPath() %>/third" method="post">
       <input name="user" type="text" placeholder="Username : "/>
       <input name="message" type="text" placeholder="Enter Message here : "/>
       <button type="submit"> Submit </button>
       </form>

    </div>
    <script src="<%= application.getContextPath() %>/js/script.js"></script>
</body>
</html>