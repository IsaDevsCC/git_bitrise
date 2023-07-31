package com.keepcoding.androidsuperpoderes.components

/**
 * Delegado que gestiona los estados de un componente RangeSelector
 */
class RangeSelectorDelegate(
    private val minValue: Int,
    private val maxValue: Int
) {
    var currentBottom = minValue
    var currentTop = maxValue

    fun moveTop(newValue: Int) {

    }

    fun moveBottom(newValue: Int) {

    }
}