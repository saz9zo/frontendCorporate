document.getElementById("show").addEventListener('onload', function () {
   
    fetch('../java/org/mountblue/DisplayContactData')
    .then(res=> 
        {return res.json();})
    .then(data=> {
        console.log(data);
    })
     .catch(error => console.log("error"));
});