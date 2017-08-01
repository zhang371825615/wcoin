/**
 * 路由
 */
define(['app'], function(app){
  
   return app.config(function($stateProvider, $urlRouterProvider) {
	      $stateProvider.state('main', {
	          url: "/main",
	          cache:false,
	          templateUrl: "app/views/main.html",
       //       controller: 'AppCtrl'
	        }).state('asyzDetail', {
		          url: "/asyzDetail/:id",
		          cache:false,
		          templateUrl: "app/views/asyzDetail.html",
		          controller:'asyzDetailController',
		          
		        })  
		      
	        .state('menu', {
		          url: "/menu",
		          abstract: true,
		          cache:false,
		          templateUrl: "app/views/menu.html",
		          controller:"menuController"
		        }).
		        state('menu.dashboard', {
			          url: "/dashboard",
			          cache:false,
			          views: {
			              'menuContent' :{
			            	  templateUrl: "app/views/dashboard.html",
			                   controller:'dashboardController',
			              }
			            }
			        })
			        .state('menu.asyz', {
				          url: "/asyz",
				          cache:false,
				          views: {
				              'menuContent' :{
				            	  templateUrl: "app/views/asyz.html",
				                   controller:'asyzController',
				              }
				            }
				     
				        }) 
					    .state('menu.asyzRob', {
						          url: "/asyzRob",
						          cache:false,
						          views: {
						              'menuContent' :{
						            	  templateUrl: "app/views/asyzRob.html",
								          controller:'asyzRobController',
						              }
						            }
						        })  
				      
	    	  
	      // if none of the above states are matched, use this as the fallback
	      $urlRouterProvider.otherwise('/menu/dashboard');
	    })
   
  
})