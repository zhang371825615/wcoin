/**
 * 路由
 */
define(['app'], function(app){
  
   return app.config(['$routeProvider',function($routeProvider) {
            $routeProvider
              .when('/main', {
                templateUrl: 'app/views/main.html',
              })
              .when('/test', {
                  templateUrl: 'app/views/test.html',
                })
//              .when('/wdxq', {
//                templateUrl: 'js/views/wd/xq.html',
//                controller: 'wdxqCtrl'
//              })
//              .when('/sh', {
//                templateUrl: 'js/views/sh/list.html',
//                controller: 'shListCtrl'
//              })
//              .when('/shxq', {
//                templateUrl: 'js/views/sh/xq.html',
//                controller: 'shxqCtrl'
//              })
//              .when('/listimg', {
//                templateUrl: 'js/views/sh/listimg.html',
//                controller: 'listimgCtrl'
//              })
//              .when('/jr', {
//                templateUrl: 'js/views/jr/list.html',
//                controller: 'jrListCtrl'
//              })
//              .when('/lcxq', {
//                templateUrl: 'js/views/jr/lcxq.html',
//                controller: 'lcxqCtrl'
//              })
//              .when('/jjxq', {
//                templateUrl: 'js/views/jr/jjxq.html',
//                controller: 'jjxqCtrl'
//              })
              .otherwise({ redirectTo: 'main' });

            //  $locationProvider.html5Mode(true).hashPrefix('');

   }])
   
  
})