function dataToJson() {
    event.preventDefault();
  
    let phonevalue = document.querySelector('.number').value;
    let namevalue = document.querySelector('.name').value;
    let queryvalue = document.querySelector('.query').value;
    let emailvalue = document.querySelector('.email').value;
  
    let numbertag = document.querySelector('.numbertag');
    let querytag = document.querySelector('.querytag');
    let emailtag = document.querySelector('.emailtag');
    let nametag = document.querySelector('.nametag');
  
    nametag.textContent = "";
    querytag.textContent = "";
    emailtag.textContent = "";
    numbertag.textContent = "";
  
        if(namevalue == "") {
        nametag.textContent = "Enter your name";
        return false;
      }
  
      let patternEmail = /^[a-z0-9]*\@{1}[a-zA-Z0-9]+\.[a-zA-Z]+/
      if (emailvalue == "") {
        emailtag.textContent = "email must not be empty";
        return false;
      }
      else if (!(emailvalue.match(patternEmail))) {
        emailtag.textContent = "invalid email format";
        return false;
      }
  
      let pattern = /[987][0-9]{9}/;
      if (!(phonevalue.match(pattern))) {
        numbertag.textContent = "please enter correct phone number";
        return false;
      }
  
      if (queryvalue == "") {
        querytag.textContent = "Please enter your query";
        return false;
      }
  
    let contactMessage = {
      name: namevalue,
      email: emailvalue,
      phone: phonevalue,
      query: queryvalue
    }
    console.log(contactMessage);
  
    let xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
      if (this.readyState == 4 && this.status == 200) {
        window.alert("message send successfully");
      }
      else {
        window.alert("error occured");
      }
    }
    xhttp.open("POST", "serve", false);
    xhttp.setRequestHeader("Content-type", "application/json");
    xhttp.send(JSON.stringify(contactMessage));
  }
  