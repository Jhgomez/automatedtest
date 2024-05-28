package com.example.tiptime

import android.icu.text.NumberFormat
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextInput
import com.example.tiptime.ui.theme.TipTimeTheme
import org.junit.Rule
import org.junit.Test

class TipUITests {

    @get:Rule
    val composeTestRule = createComposeRule()

    // you always have to set content similar to how UI is set in "onCreate" method in an Activity
    // as instrumented tests test an actual instance of the app and its UI. Remember all instrumented
    // tests are built into its own "APK" which is then installed in an Emulator or device along
    // with the regular app APK and then the "test APK" runs its tests against the "app APK"
    @Test
    fun calculate_20_percent_tip() {
        // As you can see this sets the UI content of the compose test rule, you need to do this
        // so you can interact with the UI through your compose rule
        composeTestRule.setContent {
            TipTimeTheme {
                TipTimeLayout()
            }
        }

        composeTestRule.onNodeWithText("Bill Amount").performTextInput("10")
        composeTestRule.onNodeWithText("Tip Percentage").performTextInput("20")

        val expectedTip = NumberFormat.getCurrencyInstance().format(2)

        composeTestRule
            .onNodeWithText("Tip Amount: $expectedTip")
            .assertExists("No node with this text was found")
    }
}