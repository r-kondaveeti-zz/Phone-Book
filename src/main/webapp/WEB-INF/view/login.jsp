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
    <br>
    <div class="container">
      <nav>
        <div class="nav nav-tabs" id="nav-tab" role="tablist">
          <a class="nav-item nav-link" id="nav-home-tab" data-toggle="tab" href="./" role="tab" aria-controls="nav-home" aria-selected="true">Registration</a>
          <a class="nav-item nav-link active" id="nav-profile-tab" data-toggle="tab" href="./login" role="tab" aria-controls="nav-profile" aria-selected="false">Login</a>
        </div>
      </nav>
      <form class="pure-form pure-form-stacked" action="./loginUser" method="post">
        <fieldset>
          <legend>Login</legend>
          <label for="email">Email</label>
          <input id="email" type="email" placeholder="Email" name="email">
          <span class="pure-form-message">This is a required field.</span>
          <label for="password">Password</label>
          <input id="password" type="password" placeholder="Password" name="password">
          <label for="remember" class="pure-checkbox">
          <input id="remember" type="checkbox"> Remember me
          </label>
          <button type="submit" class="pure-button pure-button-primary">Sign in</button>
        </fieldset>
      </form>
    </div>
  </body>
</html>
