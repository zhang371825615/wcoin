/**
 * 建立angular.module
 */
define([ 'app' ], function(app) {
	return app.controller("asyzController",function($scope,$ionicPopup,$timeout,$state){
	
			  $scope.playlists = [
			                      { title: 'Reggae', id: 1 },
			                      { title: 'Chill', id: 2 },
			                      { title: 'Dubstep', id: 3 },
			                      { title: 'Indie', id: 4 },
			                      { title: 'Rap', id: 5 },
			                      { title: 'Cowbell', id: 6 }
			                      ];
			  $scope.add=function(){
				  $scope.user = {}
				 var myPopup= $ionicPopup.show({
			             template: '<div class="list list-inset"><label class="item item-input"> <input type="text" name="phone" ng-model="user.phone" placeholder="账号"> </label> <label class="item item-input"> <input type="password" ng-model="user.password" placeholder="密码"> </label> </div>',
			             title: '爱尚养猪账号新增',
			             subTitle: '请输入正确地的账号密码',
			             scope: $scope,
			             buttons: [
			               { text: '取消' },
			               {
			                 text: '<b>新增</b>',
			                 type: 'button-positive',
			                 onTap: function(e) {
			                   if (!($scope.user.phone&&$scope.user.password)) {
			                     // 不允许用户关闭，除非输入 wifi 密码
			                     e.preventDefault();
			                   } else {
			                     return $scope.user;
			                   }
			                 }
			               },
			             ]
			           });
				  
			  }	
			  
			  
			  $scope.asyzDetail=function(id){
				  
				  $state.go("asyzDetail/"+id);
			  }
			
//			  myPopup.then(function(res) {
//				     console.log('Tapped!', res);
//				   });
//			  
//				   $timeout(function() {
//				      myPopup.close(); // 3秒后关闭弹窗
//				   }, 3000);
//		       
		
	});
});
