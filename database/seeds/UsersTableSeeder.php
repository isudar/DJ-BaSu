<?php

use App\User;
use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;

class UsersTableSeeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
        DB::table('users')->delete();
        User::create(array(
           'first_name' => 'Test',
           'last_name' => 'Testić',
           'email' => 'test@mail.com',
            'password' => \Illuminate\Support\Facades\Hash::make('test')
        ));
    }
}
