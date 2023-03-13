package com.tochy.notesapp.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.tochy.notesapp.NoteDao.NoteDao;
import com.tochy.notesapp.entities.Note;

@Database(entities = Note.class, version = 1, exportSchema = false)
public abstract class DeleteDatabase extends RoomDatabase {

    protected static DeleteDatabase deleteDatabase;

    public static synchronized DeleteDatabase getNotesDatabase(Context context){
        if(deleteDatabase == null){
            deleteDatabase = Room.databaseBuilder(
                    context,
                    DeleteDatabase.class,
                    "delete_db"
            ).build();
        }
        return deleteDatabase;
    }

    public abstract NoteDao noteDao();
}
