 function validateLogin () {
     event.preventDefault();
     let form = document.getElementById("loginForm");
     let usernamePTag = document.getElementById("usernamePtag");
     let passwordPTag = document.getElementById("passwordPtag");
     passwordPTag.textContent="";
     usernamePTag.textContent="";
     let username = document.getElementById("username").value;
     let password = document.getElementById("password").value;

     if(username==""){
         usernamePTag.textContent = "username invalid";
         return false;
     }
     
     if(password == ""){
         passwordPTag.textContent = "password empty";
         return false;
     }
    

      form.submit();
 }