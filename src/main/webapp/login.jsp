<%@ page contentType="text/html;charset=UTF-8" language="Java" %>
<%@ page isELIgnored = "false" %>
<%@ taglib prefix = "c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Login page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link href="resources/css/style.css" rel="stylesheet" />
    <link href="resources/css/hello-style.css" rel="stylesheet" />
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
  </head>
  <body>
  <div class="wrapper">
      <main class="main">
          <div class="form-signin h-100 w-100 m-auto row align-items-center">
            <form action="login" method="post">
                    <h1 class="h3 mb-3 fw-normal">Please login</h1>
                   <c:if test="${not empty error}">
                       <p class="p-3 text-danger-emphasis bg-danger-subtle border border-danger-subtle rounded-3">${error}</p>
                   </c:if>
                    <div class="form-floating">
                      <input type="login" name="login" class="form-control" id="floatingInput" placeholder="name@example.com" required="required">
                      <label for="floatingInput">Login</label>
                    </div>
                    <div class="form-floating">
                      <input type="password" name="password" class="form-control" id="floatingPassword" placeholder="Password" required="required">
                      <label for="floatingPassword">Password</label>
                    </div>

                    <div class="text-start  my-3">
                      <a class="user-board link-underline-light" href="/registration">Registration</a>
                    </div>
                    <button class="btn btn-primary w-100 py-2" type="submit">Sign in</button>
                    <p class="mt-5 mb-3 text-body-secondary">©2024</p>
                  </form>
          </div>
      </main>

  </div>
  </body>
</html>
