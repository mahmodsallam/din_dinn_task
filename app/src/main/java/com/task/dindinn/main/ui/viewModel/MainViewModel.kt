package com.task.dindinn.main.ui.viewModel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.task.dindinn.base.data.NetworkingViewState
import com.task.dindinn.main.domain.MainRepo
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel @ViewModelInject constructor(private val mainRepo: MainRepo) : ViewModel() {
    var mainResponse = MutableLiveData<NetworkingViewState>()

    fun getProducts() {
        CoroutineScope(Dispatchers.IO).launch {
            try {
                mainResponse.postValue(NetworkingViewState.Loading())
                mainResponse.postValue(
                    NetworkingViewState.Success(
                        mainRepo.getProducts()
                    )
                )
            } catch (e: Exception) {
                mainResponse.postValue(NetworkingViewState.Error(e))
            }
        }
    }
}