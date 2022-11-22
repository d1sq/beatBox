package com.isgneuro.android.beatbox

import android.util.Log
import android.view.View
import android.widget.SeekBar
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable


private const val TAG = "SoundViewModel"

class SoundViewModel(private val beatBox: BeatBox) : BaseObservable() {
    //val title: MutableLiveData<String?> = MutableLiveData()
//    @Bindable
//    var speed: Int = 100
////        set(value) {
////            field = value //.get().toString())
////            notifyChange()
////        }
//
//    init {
//        speed = 100
//        notifyChange()
//    }

//    @Bindable
//    fun getProgressValue(): Int {
//        return progressValue
//    }
//
//    fun setProgressValue(value: Int) {
//        // Avoids infinite loops.
//        if (progressValue != value) {
//            progressValue = value
//
//            // Notify observers of a new value.
//            notifyPropertyChanged(BR.progressValue)
//        }
//    }

//    @Bindable
//    var progressValue = ObservableField("") //: Int = 100
//        get() {
//            return field
//        }
//        set(value) {
//            field = value
//            notifyChange()
//        }

//    @BindingAdapter("app:isGone")
//    fun bindIsGone(view: View, isGone: Boolean ) {
//        view.visibility = if (isGone) View.GONE else View.VISIBLE
//    }

    //var seekBarValue = ObservableField("")

    //@BindingAdapter
//    fun onValueChanged(seekBar: SeekBar?, progresValue: Int, fromUser: Boolean) {
//        //progressValue.set(progresValue.toString() + "")
//    }

//    @Bindable
//    fun getSeekValue(): Int {
//        return mSeekValue
//    }
//
//    fun setSeekValue(progress: Int) {
//        mSeekValue = progress
//        notifyPropertyChanged(BR.seekValue)
//        setSeekDisplay(progress)
//    }

    var sound: Sound? = null
        set(sound) {
            field = sound //.get().toString())
            notifyChange()
            //title.postValue(sound?.name)
        }

    @get:Bindable
    val title: String?
        get() = sound?.name

//    @Bindable
//    var playbackSpeed: String = "Playback speed 100%" //null // ObservableField<String> = ObservableField("") //: String = "Playback speed 100%"
//        set(playbackSpeed) {
//            field = playbackSpeed
//            Log.d(TAG, playbackSpeed)
//            notifyChange()
//        }

//    fun onValueChanged() {
//        Log.d(TAG, "onProgressChanged()")
//    }

    fun onButtonClicked() {
        sound?.let {
            beatBox.play(it)
        }
    }
}