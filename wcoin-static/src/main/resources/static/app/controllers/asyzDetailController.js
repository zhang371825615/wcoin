/**
 * 建立angular.module
 */
define([ 'app' ], function(app) {
	return app.controller("asyzDetailController",function($scope,$stateParams){
	
			alert($stateParams.id)
		
	});
});
