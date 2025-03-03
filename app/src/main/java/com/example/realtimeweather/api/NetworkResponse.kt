package com.example.realtimeweather.api

// T refers to weather model
sealed class NetworkResponse<out T> {
data class Success<out T>(val data: T) : NetworkResponse<T>()
    data class Error(val errorMessage: String) : NetworkResponse<Nothing>()
    object Loading : NetworkResponse<Nothing>()
}