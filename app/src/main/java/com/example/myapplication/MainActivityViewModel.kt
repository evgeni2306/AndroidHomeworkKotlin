package com.example.myapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    val employees = MutableLiveData(Employee.getMockEmployees())

    fun likeEmployee(position: Int) {
        employees.value = employees.value?.toMutableList()?.apply {
            (filter { it.id == position }).forEach { it.isLiked = !it.isLiked }

        }
    }
}