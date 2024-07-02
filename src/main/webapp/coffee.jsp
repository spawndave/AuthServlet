<%@ page contentType="text/html;charset=UTF-8" language="Java" %>
<%@ taglib prefix = "c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Home page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link href="resources/css/hello-style.css" rel="stylesheet" />
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
  </head>
<body>
<div class="wrapper">
    <header>
        <div class="column_header">
            <div>
                <h2>Hey <span class="user-name-color">${user.name}</span>, nice to meet you!</h2>
                <h5>Have a good time, take a cup of coffee...</h5>
            </div>
            <a class="user-board link-underline-light" href="/logout">logout</a>
        </div>
    </header>
    <main class="main">
        <div class="column column_main">
          <h2>${coffee.title}</h2>
          <h4>${coffee.description}</h4>
          <h4>Price: ${coffee.price}$</h4>
        <a class="user-board link-underline-light" href="/home">Main page</a>
        </div>
    </main>


</div>

</body>
</html>

