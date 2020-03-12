let hamburger = document.querySelector('.hamburger-button');
let closebutton = document.querySelector('.close');
let navBar = document.querySelector('#header_nav_list_mobile');
hamburger.addEventListener('click', function() {
  hamburger.style.display = "none";
  closebutton.style.display="block"; 
  navBar.style.display= "block";
});

closebutton.addEventListener('click', function() {
  closebutton.style.display = "none";
  hamburger.style.display = "block";
  navBar.style.display= "none";
});