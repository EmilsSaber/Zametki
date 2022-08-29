package kg.example.zametki.domain.use_case

import kg.example.zametki.domain.model.Note
import kg.example.zametki.domain.repository.NoteRepository

class EditNoteUseCase(private val noteRepository: NoteRepository) {
    fun editNote(note: Note) = noteRepository.editNote(note)
}