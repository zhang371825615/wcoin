/**
 * 建立angular.module
 */
define(['angular'], function (angular) {
    var app = angular.module('wcoinApp', ['ngRoute','ngSanitize']);
    
    return app;

});
