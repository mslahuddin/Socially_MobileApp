package com.muhammadsalahuddin.i220969

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent
import org.junit.*
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    var activityRule: ActivityScenarioRule<Home> =
        ActivityScenarioRule(Home::class.java)

    @Before
    fun setup() {
        Intents.init()
    }

    @After
    fun tearDown() {
        Intents.release()
    }


    @Test
    fun testSearchOpensMainSearch() {
        onView(withId(R.id.search)).perform(click())
        Intents.intended(hasComponent(mainSearch::class.java.name))
    }


    @Test
    fun testProfileOpensProfile2() {
        onView(withId(R.id.profile)).perform(click())
        Intents.intended(hasComponent(Profile2::class.java.name))
    }
}
