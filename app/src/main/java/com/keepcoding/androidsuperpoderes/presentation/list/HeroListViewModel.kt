package com.keepcoding.androidsuperpoderes.presentation.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.keepcoding.androidsuperpoderes.domain.model.HeroModel
import com.keepcoding.androidsuperpoderes.domain.usecase.GetHeroListUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class HeroListViewModel(
    private val getHeroListUseCase: GetHeroListUseCase
) : ViewModel() {

    private val _heroList = MutableLiveData<List<HeroModel>>()
    val heroList: LiveData<List<HeroModel>> get() = _heroList

    init {
        getData()
    }

    private fun getData() {
        viewModelScope.launch {
            try {
                val result = withContext(Dispatchers.IO) {
                    getHeroListUseCase.invoke()
                }
                _heroList.value = result
            } catch (t: Throwable) {/* TODO */}
        }
    }
}
