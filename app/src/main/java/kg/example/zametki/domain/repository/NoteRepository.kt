package kg.example.zametki.domain.repository

import kg.example.zametki.domain.model.Note

interface NoteRepository{

fun addNote(note: Note)

fun getAllNotes()

fun editNote (note: Note)

fun deleteNote(note: Note)

}