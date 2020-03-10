let form = document.getElementById('contactUs');
let numbertag = document.querySelector('.numbertag');
let querytag = document.querySelector('.querytag');   
form.addEventListener('submit', function() {
    event.preventDefault();
    let res = validate();

    if(res == true){
        window.location.href = "index.html";
    }
});

function validate () {
    let phone = document.querySelector('.number').value;
    let name = document.querySelector('.name').value;
    let query = document.querySelector('.query').value;
    if(name==""){
        name.value = "anonymous";
     } 

     if(query==""){
        querytag.textContent="Please enter your query";
     }else 
     querytag.textContent="";
 

    if(phone == ""){
        numbertag.textContent = "phone number must not be empty";
        return false;
    }
    else if (phone.length!=10){
        numbertag.textContent = "phone number must be 10 digit";
        return false;
    }   
    let pattern = /[987][0-9]{9}/;

     if(phone.match(pattern)){
         numbertag.textContent="";
         return true;
     }
     else{
        numbertag.textContent = "please enter number";
        return false;
     }  
 }

   
   
 