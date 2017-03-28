(function (sbaModules, angular) {
    'use strict';
//Neues modul erzeugen und instanziieren
    var module = angular.module('sba-applications-currentTime', ['sba-applications']);
    sbaModules.push(module.name);

//Die neue Seite registrieren
    module.run(['ApplicationViews', '$http', function (ApplicationViews, $http) {
        ApplicationViews.register({
            order: 50,
            title: 'Current Time',
            state: 'applications.currentTime'
        });
    }]);

//Den Router-State beschreiben
    module.config(['$stateProvider', function ($stateProvider) {
        $stateProvider.state('applications.currentTime', {
            url: '/currentTime',
            templateUrl: 'applications-currentTime/currentTime.html',
            controller: 'currentTimeCtrl'
        });
    }]);

//Den Controller für die Seite anlegen
    module.controller('currentTimeCtrl', ['$scope', '$http', 'application', function ($scope, $http, application) {
        //Den Endpoint auslesen
        $http.get('api/applications/' + application.id + '/currentTime').then(function (response) {
            $scope.currentTime = response.data.currentTime;
        })
    }]);
}(sbaModules, angular));
