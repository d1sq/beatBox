package com.isgneuro.android.beatbox

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Before

import org.junit.Assert.assertEquals
import org.junit.Test

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.Is.`is`
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify


class SoundViewModelTest {
    private lateinit var sound: Sound
    private lateinit var subject: SoundViewModel
    private lateinit var beatBox: BeatBox

    @Before
    fun setUp() {
        beatBox = mock(BeatBox::class.java)
        sound = Sound("assetPath")
        subject = SoundViewModel(beatBox)
        subject.sound = sound
    }

    @Test
    fun exposesSoundNameAsTitle() {
        assertThat(subject.title, `is`(sound.name))
        //assertThat(subject.title, `is`(sound.name))
        //assertEquals(subject.title, sound.name)
    }

    @Test
    fun callsBeatBoxPlayOnButtonClicked() {
        subject.onButtonClicked()
        verify(beatBox).play(sound)
    }
}