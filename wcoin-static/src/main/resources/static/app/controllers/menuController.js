/**
 * 建立angular.module
 */
define([ 'app' ], function(app) {
	return app.controller("menuController",function($scope,$state){
//		  $scope.toggleLeft = function() {
//			    $ionicSideMenuDelegate.toggleLeft();
//			  };
		
			$scope.changeContet=function(v){
				
				
				//("ion-nav-view").remove();
				$state.go(v)
				
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
