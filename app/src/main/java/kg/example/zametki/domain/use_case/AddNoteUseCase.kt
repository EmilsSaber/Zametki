package kg.example.zametki.domain.use_case

import kg.example.zametki.domain.model.Note
import kg.example.zametki.domain.repository.NoteRepository


class AddNoteUseCase(private val noteRepository: NoteRepository) {
    fun addNote(note: Note) = noteRepository.addNote(note)
}