<html>
   <head>
      <meta name="layout" conent="main" />
      <title>Slab</title>
      <r:require modules="jqueryjs, underscore, slabText, optimizeSwipe" />
      <r:script dispositon="head">
         $(window).load(function(){
            var queryString = getQueryString('eventName');
            console.log("queryString: " + queryString);
            $('<span>'+queryString+'</span>').appendTo('#slider');
            $('<span>'+queryString+'</span>').appendTo('#480x208');
            $('<span>'+queryString+'</span>').appendTo('#320x356');
            optimizeSwipe('slider');
            optimizeSwipe('480x208');
            optimizeSwipe('320x356');
         });
      </r:script>
      <r:layoutResources />
   </head>
   <body>
      <h1>Hello params: ${params}</h1>
      <div style="width: 800; height: 400">
         <div id="slider">
         </div>
      </div>
      <div style="width: 480; height: 208">
         <div id="480x208">
         </div>
      </div>
      <div style="width: 320; height: 356">
         <div id="320x356">
         </div>
      </div>
      <div class="offscreen">
         <span>
         </span>
      </div>
      <r:layoutResources />
   </body>
</html>
