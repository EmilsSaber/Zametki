package kg.example.zametki.domain.use_case

import kg.example.zametki.domain.model.Note
import kg.example.zametki.domain.repository.NoteRepository


class GetAllNoteUseCase(private val noteRepository: NoteRepository) {
    fun getAllNote() = noteRepository.getAllNotes()
}