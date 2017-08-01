/**
 * 入口文件
 * 2014-11-30 mon
 */
require.config({
    baseUrl: "app/",
    paths: {
      "jquery": "libs/jquery-2.2.3.min",
      "ionic" : "libs/ionic.bundle",
      "app" : "controllers/app",
      "indexController" : "controllers/indexController",
      "dashboardController" : "controllers/dashboardController",
      "menuController" : "controllers/menuController",
      "asyzRobController" : "controllers/asyzRobController",
      "asyzController" : "controllers/asyzController",
      "angular" : "libs/angular/angular",
      "angular-route" : "libs/angular-route.min",
      "angular-sanitize" : "libs/angular/angular-sanitize.min",
      "route" : "routes/appRoute"

    },
    shim: {
       'angular': {
          exports: 'angular'
       },
       'angular-route':{
          deps: ["angular"],
          exports: 'angular-route'
       },
       'angular-sanitize':{
          deps: ["angular"],
          exports: 'angular-sanitize'
       },
       'ionic':['angular'],
       deps:['bootstrap']
    
    }
});


require(['angular','angular-route','angular-sanitize','route','app','ionic','menuController','indexController','dashboardController','asyzController','asyzRobController'],function (angular){

            angular.bootstrap(document,["wcoinApp"]);
      

});