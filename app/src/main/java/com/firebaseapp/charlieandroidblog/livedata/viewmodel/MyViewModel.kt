package com.firebaseapp.charlieandroidblog.livedata.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel:ViewModel() {

     val _cont = MutableLiveData<Int>(0)
    //val cont : LiveData<Int> = _cont

    fun increaseCont(){
        _cont.value = _cont.value!! + 1
    }

}