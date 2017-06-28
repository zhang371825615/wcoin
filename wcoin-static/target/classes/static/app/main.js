/**
 * 入口文件
 * 2014-11-30 mon
 */
require.config({
    baseUrl: "app/",
    paths: {
      "jquery": "libs/jquery-2.2.3.min",
      "fastclick" : "libs/fastclick",
      "blocksit" : "libs/blocksit",
      "idTabs" : "libs/idTabs",
      "stickUp" : "libs/stickUp",
      "app" : "controllers/app",
      "angular" : "libs/angular.min",
      "angular-route" : "libs/angular-route.min",
      "angular-sanitize" : "libs/angular-sanitize.min",
      "bootstrap":"libs/bootstrap.min",
      "adminApp":"libs/adminApp.min",
      "route" : "routes/appRoute",
     
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
       'bootstrap':['jquery'],
       'adminApp':['bootstrap']
    }
});


require(['jquery','angular','angular-route','angular-sanitize','route','app','bootstrap','adminApp'],function ($,angular){

      $(function () {

            angular.bootstrap(document,["wcoinApp"]);

      })

});