package ru.gb.dz17

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import ru.gb.dz17.data.PhotoFromMars
import ru.gb.dz17.data.PhotoRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MainViewModel private constructor(
    private val repository: PhotoRepository) : ViewModel() {
    constructor():this(PhotoRepository())
    private val _photos = MutableStateFlow<List<PhotoFromMars>>(emptyList())
    val photos = _photos.asStateFlow()

    init {
        loadPhoto()
    }

    private fun loadPhoto() {
        viewModelScope.launch(Dispatchers.IO) {
            kotlin.runCatching { repository.getPhoto() }
                .fold(
                    onSuccess = { _photos.value = it },
                    onFailure = { Log.d("ViewModel", it.message ?: "") }
                )
        }
    }
}