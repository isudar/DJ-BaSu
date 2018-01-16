<?php

namespace App\Http\Controllers\Auth;

use App\Http\Controllers\Controller;
use Illuminate\Foundation\Auth\AuthenticatesUsers;
use Illuminate\Http\Request;
use Validator;
use Auth;

class LoginController extends Controller
{
    /*
    |--------------------------------------------------------------------------
    | Login Controller
    |--------------------------------------------------------------------------
    |
    | This controller handles authenticating users for the application and
    | redirecting them to your home screen. The controller uses a trait
    | to conveniently provide its functionality to your applications.
    |
    */

    use AuthenticatesUsers;

    /**
     * Where to redirect users after login.
     *
     * @var string
     */
    protected $redirectTo = 'user/dashboard/';

    /**
     * Create a new controller instance.
     *
     * @return void
     */
    public function __construct()
    {
        $this->middleware('guest')->except('logout');
    }

//    public function login(Request $request)
//    {
//        $rules = [
//            'email' => 'required|email',
//            'password' => 'required|alphaNum'
//        ];
//
//        $validator = Validator::make($request->all(), $rules);
//        if($validator->passes()) {
//            if(Auth::attempt(['email' => $request->get('email'),
//                'password' => $request->get('password')], $request->get('remember_me'))) {
//                return redirect()->route('welcome');
//            } else {
//                return redirect()
//                    ->back()
//                    ->withInput()
//                    ->with('message', 'The email and password you entered don\'t match.');
//            }
//        } else {
//            return redirect()->route('auth.login');
//        }
//    }

    public function logout()
    {
        Auth::logout();
        return redirect()->route('login');
    }
}