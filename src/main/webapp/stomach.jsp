<%@ page contentType="text/html;charset=UTF-8" language="Java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<h2>Your stomach</h2>
<c:set var="numberDrinkedCofeeCups" value="${drinckedCoffeeList.size()}"/>
<c:set var="description" value="" scope="page"/>
<c:set var="color" value="" scope="page"/>
<c:choose>
    <c:when test="${ numberDrinkedCofeeCups == 1 }" >
        <c:set var="description" value="feels good"/>
        <c:set var="color" value="text-success"/>
    </c:when>
    <c:when test="${ numberDrinkedCofeeCups == 2 }" >
        <c:set var="description" value="a bit nerveus"/>
        <c:set var="color" value="text-dark"/>
    </c:when>
    <c:when test="${ numberDrinkedCofeeCups == 3 }" >
        <c:set var="description" value="nerveus"/>
        <c:set var="color" value="text-warning"/>
    </c:when>
    <c:when test="${ numberDrinkedCofeeCups > 3 }" >
        <c:set var="description" value="no more.."/>
        <c:set var="color" value="text-danger"/>
    </c:when>
    <c:otherwise>
        <c:set var="description" value="coffee please..."/>
        <c:set var="color" value="text-primary"/>
    </c:otherwise>
</c:choose>
<small class="d-block text-body-secondary">( Be careful, do not drink too much )</small>
<p class="${color}">${description}</p>

<div class="list-group">
    <c:set var="price" value="0" scope="page"/>
    <c:forEach items="${drinckedCoffeeList}" var="coffee">
        <label class="list-group-item d-flex gap-2 stomach">
            <span>${coffee.title}</span>
        </label>
        <c:set var="price" value="${price + coffee.price}" scope="page"/>

    </c:forEach>
    <fmt:setLocale value="ru-RU"/>
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
    <h5 class="gap-2">Total price: <c:out value="${formattedPrice}"/> $</h5>
</div>
