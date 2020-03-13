let form = document.getElementById('contactUs');
let numbertag = document.querySelector('.numbertag');
let querytag = document.querySelector('.querytag'); 
let emailtag = document.querySelector('.emailtag');
let nametag = document.querySelector('.nametag');  
form.addEventListener('submit', function() {
    event.preventDefault();
    let res = validate();

    if(res == true){
       return true;
        
    }
});

function validate () {
    let phone = document.querySelector('.number').value;
    let name = document.querySelector('.name').value;
    let query = document.querySelector('.query').value;
    let email = document.querySelector('.email').value;


    if(name == ""){
         nametag.textContent = "Enter your name";
         return false;
     }
     else nametag.textContent= "";

     
     if(query==""){
        querytag.textContent="Please enter your query";
        return false;
     }else 
     querytag.textContent="";
 

     let patternEmail = /^[a-z0-9]*\@{1}[a-zA-Z0-9]+\.[a-zA-Z]+/
     if(email == ""){
         emailtag.textContent = "email must not be empty";
         return false;
     }
     else if(!(email.match(patternEmail))){
         emailtag.textContent = "invalid email format";
         return false;
     }
     else emailtag.textContent = "";

     let pattern = /[987][0-9]{9}/;
     if(phone.match(pattern)){
         numbertag.textContent="";
     }
     else{
        numbertag.textContent = "please enter correct phone number";
        return false;
     } 

     return true; 
 }

 