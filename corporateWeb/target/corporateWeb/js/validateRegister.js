function registration() {
    event.preventDefault();
   let namevalue = document.getElementById("name").value;
   let emailvalue = document.getElementById("email").value;
   let passwordvalue = document.getElementById("password").value;
   let repasswordvalue = document.getElementById("repassword").value;
   let namePtag = document.querySelector(".namePtag");
   let emailPtag = document.querySelector(".emailPtag");
   let passwordPtag = document.querySelector(".passwordPtag");
   let repasswordPtag = document.querySelector(".repasswordPtag");

   namePtag.textContent= "";
   emailPtag.textContent = "";
   passwordPtag.textContent = "";
   repasswordPtag.textContent= "";

   if(namevalue == ""){
       namePtag.textContent = "Enter your name";
       return false;
   }

   let patternEmail = /^[a-z0-9]*\@[a-zA-Z0-9]+\.[a-zA-Z]+/ 
   if(emailvalue==""){
       emailPtag.textContent = "Enter email";
       return false;
   }
   if(!(emailvalue.match(patternEmail))){
       emailPtag.textContent  = "Invalid Email";
       return false;
   }


   if(passwordvalue==""){
       passwordPtag.textContent = "password field empty";
       return false;
   }
   if(passwordvalue.length < 8) {
       passwordPtag.textContent = "please enter atleast 8 character";
       return false;
   }
   

   if(repasswordvalue!=passwordvalue) {
       repasswordPtag.textContent = "password mismatch";
       return false;
   }

   let adminDetails = {
       name : namevalue,
       email : emailvalue,
       password : passwordvalue
   }

   let xhttp =new XMLHttpRequest();

   xhttp.onreadystatechange = function (){
       if(this.readyState==4 && this.status==200) {
           window.alert("registration successful");
           window.location.href="adminLogin.jsp";
       }
        if(this.status==403){
           window.alert("email already exist");
       }
   }
   xhttp.open("POST","register", false);
   xhttp.setRequestHeader("Content-Type", "application/json");
   xhttp.send(JSON.stringify(adminDetails));
}