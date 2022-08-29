package kg.example.zametki.presentaition

import androidx.lifecycle.ViewModel
import kg.example.zametki.data.repository.NoteRepositoryImp
import kg.example.zametki.domain.use_case.AddNoteUseCase
import kg.example.zametki.domain.use_case.DeliteNoteUseCase
import kg.example.zametki.domain.use_case.EditNoteUseCase
import kg.example.zametki.domain.use_case.GetAllNoteUseCase

class MainViewModel(
    private val addNoteUseCase: AddNoteUseCase,
    private val deliteNoteUseCase: DeliteNoteUseCase,
    private val editNoteUseCase: EditNoteUseCase,
    private val getAllNoteUseCase: GetAllNoteUseCase
):ViewModel() {

}