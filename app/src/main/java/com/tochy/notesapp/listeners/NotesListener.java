package com.tochy.notesapp.listeners;

import com.tochy.notesapp.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
