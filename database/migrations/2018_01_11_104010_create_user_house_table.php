<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class CreateUserHouseTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('user_house', function (Blueprint $table) {
            $table->integer('user_id')->unsigned();
            $table->integer('house_id')->unsigned();
        });

        Schema::table('user_house', function($table) {
            $table->foreign('user_id')->references('id')->on('users');
            $table->foreign('house_id')->references('id')->on('house');
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('user_house');
    }
}
