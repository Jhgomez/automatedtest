package com.example.tiptime

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTests {

    @Test
    fun calculateTip_20PercentNoRoundUp() {
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val amount = 10.0
        val tipPercent = 20.0

        val actualTip = calculateTip(amount, tipPercent, false)

        assertEquals(expectedTip, actualTip)
    }
}