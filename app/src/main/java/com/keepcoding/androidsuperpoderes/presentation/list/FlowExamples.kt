package com.keepcoding.androidsuperpoderes.presentation.list

import android.util.Log
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collectIndexed
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.transform

class FlowExamples {

    // Operados funcionales: map, filter
    // Patrón observer
    // Corutinas
    suspend fun createFlowFromList() {
        val list = listOf(
            "1",
            "2",
            "3"
        )
        val flow = list.asFlow()
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

    suspend fun exampleFold() {

    }

    suspend fun exercise1() {
        val flow = listOf(
            "Maestro Roshi",
            "Mr. Satán",
            "Krilin",
            "Goku",
            "Vegeta"
        ).asFlow()

        flow.collectIndexed { index, value ->
            Log.d("Test", "Hola, $value, estás en la posición $index")
        }
    }

    suspend fun exercise1Other(
        list: List<String>
    ) {
        val flow = listOf(
            "Maestro Roshi",
            "Mr. Satán",
            "Krilin",
            "Goku",
            "Vegeta"
        ).asFlow().map {
            "Hola, $it, estás en la posición"
        }

        flow.collectIndexed { index, value ->
            Log.d("Test", "$value $index")
        }
    }

    /**
     * Flow que emita sólo el número de letras de un listado de superhéroes que contienen un
     * número de letras impar.
     */
    suspend fun exercise2() {
        val flow = listOf(
            "Maestro Roshi",
            "Mr. Satán",
            "Krilin",
            "Goku",
            "Vegeta"
        ).asFlow()
            .filter {
                it.length % 2 == 1
            }

        flow.collect {
            Log.d("Ejercicio2", "$it | Número letras: ${it.length}")
        }

    }

    suspend fun exercise2Other() {
        val flow = listOf(
            "Maestro Roshi",
            "Mr. Satán",
            "Krilin",
            "Goku",
            "Vegeta"
        ).asFlow().map {
                it.length
            }.filter {
                it % 2 == 1
            }

        flow.collect {
            Log.d("Ejercicio2", "Número letras: $it")
        }

    }

}