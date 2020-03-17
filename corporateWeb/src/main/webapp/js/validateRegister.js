function validate() {
    event.preventDefault();
   let form = document.querySelector("#registerForm");
   let name = document.getElementById("name").value;
   let email = document.getElementById("email").value;
   let password = document.getElementById("password").value;
   let repassword = document.getElementById("repassword").value;
   let namePtag = document.querySelector(".namePtag");
   let emailPtag = document.querySelector(".emailPtag");
   let passwordPtag = document.querySelector(".passwordPtag");
   let repasswordPtag = document.querySelector(".repasswordPtag");

   nametag.textContent= "";
   emailPtag.textContent = "";
   passwordPtag.textContent = "";
   repasswordPtag.textContent= "";

   if(name == ""){
       namePtag.textContent = "Enter your name";
       return false;
   }

   let patternEmail = /^[a-z0-9]*\@[a-zA-Z0-9]+\.[a-zA-Z]+/ 
   if(email==""){
       emailPtag.textContent = "Enter email";
       return false;
   }
   if(!(email.match(patternEmail))){
       emailPtag.textContent  = "Invalid Email";
       return false;
   }


   if(password==""){
       passwordPtag.textContent = "password field empty";
       return false;
   }
   if(password.length < 8) {
       passwordPtag.textContent = "please enter atleast 8 character";
       return false;
   }
   

   if(repassword!=password) {
       repasswordPtag.textContent = "password mismatch";
       return false;
   }

   form.submit();

}