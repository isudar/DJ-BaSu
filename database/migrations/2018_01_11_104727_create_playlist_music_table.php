<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class CreatePlaylistMusicTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('playlist_music', function (Blueprint $table) {
            $table->integer('playlist_id')->unsigned();
            $table->integer('music_id')->unsigned();
        });

        Schema::table('playlist_music', function($table) {
           $table->foreign('playlist_id')->references('id')->on('playlist');
           $table->foreign('music_id')->references('id')->on('music');
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('playlist_music');
    }
}
