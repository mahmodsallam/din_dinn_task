package com.task.dindinn.base.data

sealed class NetworkingViewState {
    class Loading : NetworkingViewState()
    class Success<T>(val item: T) : NetworkingViewState()
    class SuccessCombination<T>(val first: T, val second: T) : NetworkingViewState()
    class Error(val error: Throwable) : NetworkingViewState()
}