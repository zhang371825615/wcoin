/**
 * 建立angular.module
 */
define([ 'app' ], function(app) {
	return app.controller("asyzRobController",function($scope,$ionicPopup,$timeout,$state){
	
		  $scope.devList = [
		                    { name: "zs2932",owner:'张三',checked: true, balance:1200,value:5},
		                    { name: "zs1123", owner:'张三',checked: false,balance:1500,value:7},
		                    { name: "zs9334", owner:'李四',checked: false,balance:6000,value:0}
		                  ];
		
	});
});
