package com.TodoApp.sanatan.Data;


import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.TodoApp.sanatan.Model.User;

@Database(entities = {User.class}, version = 1, exportSchema = false)
public abstract class UserDataBase extends RoomDatabase {

    public abstract UserDao getUserDao();

}

