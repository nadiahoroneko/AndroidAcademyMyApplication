package by.kharaneka.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textView: TextView = findViewById(R.id.second_activity_text_view)

        val transmittedString: String? = intent.getStringExtra(TRANSMITTED_STRING)
        val transmittedInt: Int = intent.getIntExtra(TRANSMITTED_INT, -1)
        val transmittedBoolean: Boolean = intent.getBooleanExtra(TRANSMITTED_BOOLEAN, false)
        textView.text = "These values were passed from previous screen: transmittedString: $transmittedString, transmittedInt: $transmittedInt, transmittedBoolean: $transmittedBoolean"
    }

    companion object{
        const val TRANSMITTED_STRING = "transmittedString"
        const val TRANSMITTED_INT = "transmittedInt"
        const val TRANSMITTED_BOOLEAN = "transmittedBollean"
    }
}