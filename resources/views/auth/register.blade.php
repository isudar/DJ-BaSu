@extends('templates.index')

@section('content')

    <form action="{{ route('auth.register') }}" method="POST">
        {{ csrf_field() }}

        <div class="form-group">
            <label for="First name">First name</label>
            <input type="first_name" class="form-control" id="first_name" name="first_name" />
        </div>

        <div class="form-group">
            <label for="Last name">Last name</label>
            <input type="last_name" class="form-control" id="last_name" name="last_name" />
        </div>

        <div class="form-group">
            <label for="email">Email address</label>
            <input type="email" class="form-control" id="email" name="email" aria-describedby="emailHelp" placeholder="Enter email" />
            <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
        </div>

        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" class="form-control" id="password" name="password" placeholder="Password" />
        </div>

        <div class="form-group">
            <label for="password_confirm">Confirm password</label>
            <input type="password" class="form-control" id="password_confirm" name="password_confirm" placeholder="Password" />
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>

    </form>

@endsection