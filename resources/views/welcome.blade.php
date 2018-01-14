@extends('templates.index')

@section('content')

    <div class="jumbotron">
        <h1 class="display-4">@lang('main.app.name')</h1>
        <p class="lead">@lang('main.app.description')</p>
        <hr class="my-4">
        <p>@lang('main.app.description-short')</p>
        <p class="lead">
            <a class="btn btn-primary btn-lg" href="#">@lang('main.app.more')</a>
        </p>
    </div>

@endsection