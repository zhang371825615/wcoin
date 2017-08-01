/**
 * 建立angular.module
 */
define([ 'app' ], function(app) {
	return app.controller("dashboardController",function($scope){
//		  $scope.toggleLeft = function() {
//			    $ionicSideMenuDelegate.toggleLeft();
//			  };
		$scope.open=function (url) {  
		     window.open(url, '_blank', 'location=yes');  
		 }		  
			  $scope.playlists = [
			                      { title: 'Reggae', id: 1 },
			                      { title: 'Chill', id: 2 },
			                      { title: 'Dubstep', id: 3 },
			                      { title: 'Indie', id: 4 },
			                      { title: 'Rap', id: 5 },
			                      { title: 'Cowbell', id: 6 }
			                    ];	  
		
	});
});
