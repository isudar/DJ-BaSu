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

// Authentification
//Auth::routes();

Route::name('auth.login')->get('/login', function() {
    return view('auth.login');
});

Route::name('auth.login')->post('/login', 'Auth\LoginController@login');

Route::name('auth.logout')->get('/logout', 'Auth\LoginController@logout');

Route::name('auth.register')->get('/register', function() {
    return view('auth.register');
});

Route::name('auth.register')->post('/register', 'Auth\RegisterController@register');

Route::name('dashboard')->get('/dashboard', 'DashboardController@');