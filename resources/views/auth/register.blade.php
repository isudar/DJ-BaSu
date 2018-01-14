@extends('templates.index')

@section('content')

    <form action="{{ route('auth.register') }}" method="POST">
        {{ csrf_field() }}

        <div class="form-group">
            <label for="First name">First name</label>
            <input type="first_name" class="form-control" name="first_name" />
            @if ($errors->has('first_name'))
                @component('components.error')
                    {{ $errors->first('first_name') }}
                @endcomponent
            @endif
        </div>

        <div class="form-group">
            <label for="Last name">Last name</label>
            <input type="last_name" class="form-control" name="last_name" />
            @if ($errors->has('last_name'))
                @component('components.error')
                    {{ $errors->first('last_name') }}
                @endcomponent
            @endif
        </div>

        <div class="form-group">
            <label for="email">Email address</label>
            <input type="email" class="form-control" name="email" aria-describedby="emailHelp" placeholder="Enter email" />
            <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
            @if ($errors->has('email'))
                @component('components.error')
                    {{ $errors->first('email') }}
                @endcomponent
            @endif
        </div>

        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" class="form-control" name="password" placeholder="Password" />
            @if ($errors->has('password'))
                @component('components.error')
                    {{ $errors->first('password') }}
                @endcomponent
            @endif
        </div>

        <div class="form-group">
            <label for="password_confirm">Confirm password</label>
            <input type="password" class="form-control" name="password_confirmation" placeholder="Password" />
            @if ($errors->has('password_confirmation'))
                @component('components.error')
                    {{ $errors->first('password_confirmation') }}
                @endcomponent
            @endif
        </div>

        <button class="btn btn-primary">Submit</button>

    </form>

@endsection