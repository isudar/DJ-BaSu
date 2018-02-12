package com.example.sudo.basu.utils;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.sudo.basu.models.Music;
import com.example.sudo.basu.models.Playlist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sudo on 8.2.2018..
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    private  static DatabaseHelper databaseHelper;
    private List<Music> musics;


    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    public static synchronized DatabaseHelper getInstance(Context context){
        if(databaseHelper == null){
            databaseHelper = new DatabaseHelper(context, DATABASE_NAME, null, DATABASE_VERSION);
        }
        return databaseHelper;
    }

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "BASU";

    private static final String TABLE_HOUSE = "house";
    private static final String TABLE_PLAYLIST = "playlist";
    private static final String TABLE_MUSIC = "music";

    /**
     * General types
     */
    private static final String COLUMN_ID = "Id";

    /**
     * House table
     */
    private static final String COLUMN_NAME = "name";
    private static final String COLUMN_MEMBERS = "members";
    private static final String COLUMN_ADDRESS = "address";
    private static final String COLUMN_CITY = "city";

    /**
     * House table
     */
    private static final String COLUMN_LIST_NAME = "list name";
    private static final String COLUMN_HOUSE_ID = "house_id";

    /**
     * pjesme table
     */
    private static final String COLUMN_MUSIC_NAME = "music_name";
    private static final String COLUMN_ARTIST = "artist";
    private static final String COLUMN_DURATION = "duration";
    private static final String COLUMN_PLAYLIST_ID = "playlist_id";

    /**
     * SQL for creating tables
     */
    private static final String CREATE_TABLE_HOUSE = "CREATE TABLE " + TABLE_HOUSE + "( "
            + COLUMN_ID + " INTEGER PRIMARY KEY,"
            + COLUMN_NAME + " TEXT,"
            + COLUMN_MEMBERS + " TEXT,"
            + COLUMN_ADDRESS + " TEXT,"
            + COLUMN_CITY + " TEXT)";

    private static final String CREATE_TABLE_PLAYLIST = "CREATE TABLE " + TABLE_PLAYLIST + "( "
            + COLUMN_ID + " INTEGER PRIMARY KEY,"
            + COLUMN_LIST_NAME + " TEXT,"
            + COLUMN_HOUSE_ID + " INTEGER)";

    private static final String CREATE_TABLE_MUSIC = "CREATE TABLE " + TABLE_MUSIC + "( "
            + COLUMN_ID + " INTEGER PRIMARY KEY,"
            + COLUMN_MUSIC_NAME + " TEXT,"
            + COLUMN_ARTIST + " TEXT,"
            + COLUMN_DURATION + " TEXT,"
            + COLUMN_PLAYLIST_ID + " INTEGER)";


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_HOUSE);
        db.execSQL(CREATE_TABLE_PLAYLIST);
        db.execSQL(CREATE_TABLE_MUSIC);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXIST" + TABLE_HOUSE);
        db.execSQL("DROP TABLE IF EXIST" + TABLE_PLAYLIST);
        db.execSQL("DROP TABLE IF EXIST" + TABLE_MUSIC);

        onCreate(db);
    }

    public List<Playlist> getPlaylists() {
        List<Playlist> playlists = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        String selectQuery = "SELECT * FROM " + TABLE_PLAYLIST;
        Cursor cursor = sqLiteDatabase.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()){
            do {
                Playlist playlist = new Playlist(
                        Long.valueOf(cursor.getString(0)),
                        cursor.getString(1)
                );
                playlists.add(playlist);
            }while (cursor.moveToNext());
        }
        cursor.close();
        databaseHelper.close();
        return playlists;
    }

    public List<Music> getMusics() {
        List<Music> musics = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        String selectQuery = "SELECT * FROM " + TABLE_MUSIC;
        Cursor cursor = sqLiteDatabase.rawQuery(selectQuery, null);
        if (cursor.moveToFirst()){
            do {
                Music music = new Music(
                        Long.valueOf(cursor.getString(0)),
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getString(3)

                );
            }while (cursor.moveToNext());
        }
        cursor.close();
        databaseHelper.close();
        return musics;
    }
}
