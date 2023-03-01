package com.example.example1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class LiveDataString {

    val model: LiveData<String>
        get() {
            return _model
        }
    private val _model = MutableLiveData<String>()

    fun changedValue(newValue: String) {
        _model.value = newValue
    }

}