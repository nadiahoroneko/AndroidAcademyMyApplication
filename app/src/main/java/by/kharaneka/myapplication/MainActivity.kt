package by.kharaneka.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView:TextView = findViewById(R.id.first_activity_text_view)
        textView.setOnClickListener { moveToNextScreen() }
    }

    private fun moveToNextScreen() {
        val intent = Intent(this, SecondActivity::class.java)

        val transmittedString = "string to transmit"
        intent.putExtra("transmittedString", transmittedString)

        val transmittedInt = 12
        intent.putExtra("transmittedInt", transmittedInt)

        val transmittedBoolean = false
        intent.putExtra("transmittedBoolean", transmittedBoolean)

        startActivity(intent)
    }
}