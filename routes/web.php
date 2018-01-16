<?php

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::name('welcome')->get('/', function () {
    return view('welcome');
});

//// Authentification
//
//Route::middleware('guest')->namespace('Auth')->group(function () {
//
//    Route::name('auth.login')->get('/login', function() {
//        return view('auth.login');
//    });
//
//    Route::name('auth.login')->post('/login', 'LoginController@login');
//
//    Route::name('auth.register')->get('/register', function() {
//        return view('auth.register');
//    });
//
//    Route::name('auth.register')->post('/register', 'RegisterController@register');
//});

Route::name('my.logout')->get('/logout', 'Auth\LoginController@logout');

Route::prefix('user')->group(function () {

    Route::middleware('auth')->group( function () {

        Route::name('user.dashboard')->get('/dashboard', 'DashboardController@index');
    });
});

Auth::routes();

Route::get('/home', 'HomeController@index')->name('home');
