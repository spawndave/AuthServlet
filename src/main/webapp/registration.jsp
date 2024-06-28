<%@ page contentType="text/html;charset=UTF-8" language="Java" %>
<%@ page isELIgnored = "false" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Registration page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link href="resources/css/style.css" rel="stylesheet"/>
    <link href="resources/css/hello-style.css" rel="stylesheet" />
</head>
<body>
<div class="wrapper">
      <main class="main">
          <div class="form-signin h-100 w-100 m-auto row align-items-center">
            <form action="registration" class="h-100 container d-flex flex-column justify-content-center" method="post" >
                <div class="container ">
                    <h4>Registration form</h4>
                    <div class="row g-3 ">
                        <div class="col-12">
                            <label for="name" class="form-label">Name </label>
                            <input type="text" name="name" class="form-control" id="name" required="required">
                            <div class="invalid-feedback">
                                Please enter a valid name.
                            </div>
                        </div>
                        <div class="col-12">
                            <label for="login" class="form-label">Login</label>
                            <input type="text" name="login" class="form-control" id="login" required="required">
                            <div class="invalid-feedback">
                                Please enter your shipping address.
                            </div>
                        </div>
                        <div class="col-12">
                            <label for="password" class="form-label">Password</label>
                            <input type="password" class="form-control" name="password" id="password" required="required">
                            <div class="invalid-feedback">
                                Please enter your password.
                            </div>
                        </div>
                        <div class="col-6">
                            <button class="btn btn-primary btn-lg" type="submit">Continue</button>
                        </div>
                    </div>
                </div>

            </form>
          </div>
      </main>


  </div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
</body>
</html>
