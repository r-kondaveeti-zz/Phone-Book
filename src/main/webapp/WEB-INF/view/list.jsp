<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page isELIgnored ="false" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="https://unpkg.com/purecss@1.0.1/build/pure-min.css" integrity="sha384-oAOxQR6DkCoMliIh8yFnu25d7Eq/PHS21PClpwjOTeU2jRSq11vu66rf90/cZr47" crossorigin="anonymous">
    <link rel="stylesheet" href="https://unpkg.com/purecss@1.0.1/build/grids-responsive-min.css">
    <title>Phonebook</title>
  </head>
  <body>
  <br>
    <div class="container">
    <nav>
        <div class="nav nav-tabs" id="nav-tab" role="tablist">
          <a class="nav-item nav-link" id="nav-home-tab" data-toggle="tab" href="./addContact" role="tab" aria-controls="nav-home" aria-selected="true">Add Contact</a>
          <a class="nav-item nav-link active" id="nav-profile-tab" data-toggle="tab" href="./listAllContacts" role="tab" aria-controls="nav-profile" aria-selected="false">All Contacts</a>
        </div>
      </nav>
<!--       <fieldset>
 -->        
        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
       
        <c:forEach items="${contacts}" var="contact">
          <!--     <input id="first-name" class="pure-u-23-24" type="text" name="id" value=${contact.id} hidden>
            -->	
          <ul class="list-group list-group-flush">
            <li class="list-group-item d-flex justify-content-between align-items-center">
              <h6>${contact.first_name}, ${contact.last_name}</h6>
              <small class="text-muted text-center">${contact.email}, ${contact.phonenumber}</small>
              <a href="./viewContact?id=${contact.id}" class="badge badge-primary badge-pill">View Contact</a>
            </li>
          </ul>
        </c:forEach>
<!--       </fieldset>
 -->    </div>
  </body>
</html>