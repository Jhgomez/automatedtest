package com.example.tiptime

import androidx.compose.ui.test.junit4.createComposeRule
import org.junit.Rule
import org.junit.Test

class TipUITests {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun calculate_20_percent_tip() {
        // you always have to set content similar to how UI is set in "onCreate" method in an Activity
        // as instrumented tests test an actual instance of the app and its UI. Remember all instrumented
        // tests are built into its own "APK" which is then installed in an Emulator or device along
        // with the regular app APK and then the "test APK" runs its tests against the "app APK"
        composeTestRule.setContent {

        }
    }
}