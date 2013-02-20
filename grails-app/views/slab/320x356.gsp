<html>
   <head>
      <meta name="layout" conent="main" />
      <title>Slab</title>
      <r:require modules="jqueryjs, underscore, slabText, optimizeSwipe" />
      <r:script dispositon="head">
         $(window).load(function(){
            var queryString = getQueryString('eventName');
            console.log("queryString: " + queryString);
            $('<li>'+queryString+'</li>').appendTo('#slider ul');
            optimizeSwipe('slider');
         });
      </r:script>
      <r:layoutResources />
   </head>
   <body>
      <h1>Slabbing With Grails!!!!</h1>
      <div id="slider" style="width: 320; height: 356">
         <ul>
         </ul>
      </div>
      <div class="offscreen">
         <ul>
         </ul>
      </div>
      <r:layoutResources />
   </body>
</html>

