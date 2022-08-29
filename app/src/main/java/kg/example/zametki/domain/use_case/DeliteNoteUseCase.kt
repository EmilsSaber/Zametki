package kg.example.zametki.domain.use_case

import kg.example.zametki.domain.model.Note
import kg.example.zametki.domain.repository.NoteRepository


class DeliteNoteUseCase(private val noteRepository: NoteRepository) {
    fun delite(note: Note) = noteRepository.deleteNote(note)
}