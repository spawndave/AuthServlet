<%@ page contentType="text/html;charset=UTF-8" language="Java" %>
<%@ page isELIgnored = "false" %>
<%@ taglib prefix = "c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<h2>Your stomach</h2>

<small class="d-block text-body-secondary">( Be careful, do not drink too much )
    <c:if test="${drinckedCoffeeList.size() > 4}">
        no more...
    </c:if>

</small>

  <div class="list-group">
  <c:set var="price" value="0" scope="page"/>
    <c:forEach items="${drinckedCoffeeList}" var="coffee">
        <label class="list-group-item d-flex gap-2 stomach" >
            <p>${coffee.title}</p>
        </label>
        <c:set var="price" value="${price + coffee.price}" scope="page"/>

    </c:forEach>
    <fmt:formatNumber value="${price}"
                      type="currency"
                      pattern="##.##"
                      maxIntegerDigits="3"
                      minIntegerDigits="1"
                      maxFractionDigits="1"
                      minFractionDigits="1"
                      groupingUsed="true"
                      var="formattedPrice"
                      scope="request"/>
    <h6>Total price: <c:out value ="${formattedPrice}"/>  $</h6>
  </div>
