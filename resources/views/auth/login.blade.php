@extends('templates.index')

@section('content')

    <form action="{{ route('auth.login') }}" method="POST">
        {{ csrf_field() }}

        <div class="form-group">
            <label for="email">Email address</label>
            <input type="email" class="form-control" id="email" aria-describedby="emailHelp" placeholder="Enter email">
            <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
        </div>

        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" class="form-control" id="password" placeholder="Password">
        </div>

        <div class="form-check">
            <input type="checkbox" class="form-check-input" id="remember_me">
            <label class="form-check-label" for="remember_me">Remember me</label>
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>

    </form>

@endsection