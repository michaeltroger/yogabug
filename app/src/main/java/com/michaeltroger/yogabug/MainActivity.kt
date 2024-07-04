package com.michaeltroger.yogabug

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.lifecycle.lifecycleScope
import com.facebook.yoga.YogaConfigFactory
import com.facebook.yoga.YogaNode
import com.facebook.yoga.YogaNodeFactory
import kotlin.time.Duration.Companion.milliseconds
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lifecycleScope.launch {
            var i = 0
            val root: YogaNode = YogaNodeFactory.create(YogaConfigFactory.create())
            while(true) {
                Log.d("YogaBug", "i: ${i++}")

                root.reset()

                root.setWidth(200f)
                root.setHeight(200f)

                root.calculateLayout(1000f, 1000f)

                if (root.layoutWidth == 0f && root.layoutHeight == 0f) {
                    error("0 values detected!")
                }
                delay(100.milliseconds)
            }
        }
    }
}
