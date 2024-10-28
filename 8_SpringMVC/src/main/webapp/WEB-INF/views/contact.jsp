<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Contact Details</title>


  </head>
  <body>


     <div  class="content_container py-4 d-flex flex-column  justify-content-center align-items-center">
         <h3>Fill the FeedBack Form </h3>

     <form action="<%=application.getContextPath() %>/contact" method="post" class="mt-3 text-white">

       <!-- Name -->
             <div class="mb-3">
               <label for="exampleInputPassword1" class="form-label">User Name</label>
               <input placeholder="Enter here" name="name" type="text" class="form-control" id="exampleInputPassword1">
             </div>

       <!-- email Field -->
       <div class="mb-3">
         <label for="exampleInputEmail1" class="form-label">Email address</label>
         <input placeholder="Enter here" name="email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
       </div>

        <!-- Contact Number -->
       <div class="mb-3">
         <label for="exampleInputPassword1" class="form-label">Phone Number</label>
         <input placeholder="Enter here" name="phone" type="text" class="form-control" id="exampleInputPassword1">
       </div>


       <div class="content_container d-flex justify-content-center">
       <button type="submit" class="btn btn-warning">Submit</button>
       <button type="reset" class="btn btn-light">Reset</button>
       </div>
     </form>

     </div>


  </body>
</html>