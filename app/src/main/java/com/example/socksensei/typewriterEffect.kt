package com.example.socksensei

import android.widget.TextView
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun TextView.typewriterEffect(
    text: String,
    intervalMs: Long = 50L,
    lifecycleOwner: LifecycleOwner
) {
    this.text = ""
    lifecycleOwner.lifecycleScope.launch {
        text.forEach { char ->
            delay(intervalMs)
            this@typewriterEffect.append(char.toString())
        }
    }
}
