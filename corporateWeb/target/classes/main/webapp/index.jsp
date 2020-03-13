<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel ="stylesheet" href ="css/main.css">
    <link href="https://fonts.googleapis.com/css?family=DM+Serif+Display&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Karla&display=swap" rel="stylesheet">
    <title>Insure</title>
</head>
<body>
   <%@include file="header.jsp"%>

    <div id= "introduction">
        <img id="intro_image_people" src ="insure-landing-page-master/images/image-intro-desktop.jpg" />
        <img id="intro_image_right" src ="insure-landing-page-master/images/bg-pattern-intro-right-desktop.svg" />
        <img id="intro_image_left" src= "insure-landing-page-master/images/bg-pattern-intro-left-desktop.svg"/>
        <img id="intro_image_right_mobile" src ="insure-landing-page-master/images/bg-pattern-intro-right-mobile.svg" />
        <div id = "intro">
              <div id="text_content">
                <hr id = "top">
                <img id="intro_image_left_mobile" src ="insure-landing-page-master/images/bg-pattern-intro-left-mobile.svg" />
             <h1>Humanizing your insurance.</h1>
             <p>Get your life insurance coverage easier and faster. We 
                 blend our expertise and technology to help you find the 
                 plan that's right for you. Ensure you and your loved ones are protected.
             </p>
             <a href="#" class = "view_plans" id= "view_plans_section">VIEW PLANS</a>
            </div>
            </div>
           <hr id="bottom_hr">
        </div>



            <section id= "bio">
                <h1>We're Different</h1>
               <div id="bio_content">
                 <div >
                    <img src= "insure-landing-page-master/images/icon-snappy-process.svg"/>
                    <h2>Snappy Process</h2>
                   <p>Our application process can be completed in minutes, not hours. Don't get stuck filling tidious forms.
                   </p>
                </div>

                <div id = "affordable_prices">
                    <img src= "insure-landing-page-master/images/icon-affordable-prices.svg">
                    <h2>Affordable Prices</h2>
                   <p>We don't want you worrying about high monthly costs. Our price may be low, but we 
                       still offer the best coverage possible.
                   </p>
                </div>

                <div id = "peole_first">
                    <img src="insure-landing-page-master/images/icon-people-first.svg">
                    <h2>People First</h2>
                   <p>Our plans aren't full of conditions and clauses to prevent payouts. We make sure you're 
                       covered when you need it.
                   </p>
                </div>
               </div>
            </section>

            <section id="how_we_work">
              <div>
                <h1>Find out more about how we work</h1>
                <a id= "how_we_work_link" href= "#">HOW WE WORK</a>
              </div>
                <img id="how_we_work_pattern_desktop" src="insure-landing-page-master/images/bg-pattern-how-we-work-desktop.svg">
                <img id="how_we_work_pattern_mobile"  src= "insure-landing-page-master/images/bg-pattern-how-we-work-mobile.svg">
            </section>

            <%@include file="footer.jsp"%>
            <script src="js/main.js"></script>
</body>
</html>