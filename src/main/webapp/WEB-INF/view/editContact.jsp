<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page isELIgnored ="false" %>
<!doctype html>
                <html>
                <head>
                    <meta charset="utf-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                
                    <title>Phonebook</title>
                  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
                  <link rel="stylesheet" href="https://unpkg.com/purecss@1.0.1/build/pure-min.css" integrity="sha384-oAOxQR6DkCoMliIh8yFnu25d7Eq/PHS21PClpwjOTeU2jRSq11vu66rf90/cZr47" crossorigin="anonymous">
                  <link rel="stylesheet" href="https://unpkg.com/purecss@1.0.1/build/grids-responsive-min.css">
</head>
                
                <body>
                 <div class="container">
                   <form class="pure-form pure-form-stacked" action="./updateContact?id=${contact.id}" method="post">
    <fieldset>
        <legend>Edit Contact</legend>
        <div class="pure-g">
            <div class="pure-u-1 pure-u-md-1-3">
                <label for="first-name">First Name</label>
                <input id="first-name" class="pure-u-23-24" type="text" name="first_name" value="${contact.first_name}">
            </div>

            <div class="pure-u-1 pure-u-md-1-3">
                <label for="last-name">Last Name</label>
                <input id="last-name" class="pure-u-23-24" type="text" name="last_name" value="${contact.last_name}">
            </div>

            <div class="pure-u-1 pure-u-md-1-3">
                <label for="email">E-Mail</label>
                <input id="email" class="pure-u-23-24" type="email" name="email" value="${contact.email}" required>
            </div>

            <div class="pure-u-1 pure-u-md-1-3">
                <label for="phoneNumber">Phone Number</label>
                <input id="phoneNumber" class="pure-u-23-24" type="text" name="phonenumber" value="${contact.phonenumber}">
            </div>           
        </div>

  		<br>

        <button type="submit" class="pure-button pure-button-primary">Update</button>  <a href="./deleteContact?id=${contact.id}" class="pure-button pure-button-primary" role="button">Delete</a>
    </fieldset>
   
</form>
 </div>
                </body>
                </html>