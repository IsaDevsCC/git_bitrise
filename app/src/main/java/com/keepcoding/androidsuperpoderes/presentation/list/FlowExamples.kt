package com.keepcoding.androidsuperpoderes.presentation.list

import android.util.Log
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.transform

class FlowExamples {

    // Operados funcionales: map, filter
    // Patrón observer
    // Corutinas
    suspend fun createFlowFromList() {
        val list = listOf("1", "2", "3")
        val flow = list
            .asFlow()
            .map {
                // No hay opción de devoler más tipos
                "Hello $it"
            }.transform {
                emit(it)
                emit(it)
            }



        flow.collect {
            Log.d("Test", it)
        }

    }
}