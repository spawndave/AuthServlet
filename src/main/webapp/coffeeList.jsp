<%@ page contentType="text/html;charset=UTF-8" language="Java" %>
<%@ page isELIgnored = "false" %>
<%@ taglib prefix = "c" uri="jakarta.tags.core" %>

<h2>Coffee machine</h2>

  <div class="list-group">
    <c:forEach items="${coffeeList}" var="coffee">
      <label class="list-group-item d-flex gap-2 justify-content-between" >
        <span>
         ${coffee.title}
         <small class="d-block text-body-secondary"><a href="/coffee?id=${coffee.id}">Learn more...</a></small>
        </span>
        <a class="btn btn-info rounded-pill px-3" href="/coffee/drink?id=${coffee.id}" role="button">Drink</a>
      </label>

    </c:forEach>
  </div>
