package com.example.monapplication2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainScreenActivity : AppCompatActivity() {
   private lateinit var dateEditText: EditText
   private lateinit var morningScreenTimeEditText: EditText
   private lateinit var afternoonScreenTimeEditText: EditText
   private lateinit var activityNotesEditText: EditText
   private val dates = ArrayList<String>()
   private val morningScreenTimes = ArrayList<Int>()
   private val activityNotes = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_screen2)

        dateEditText = findViewById(R.id.dateEditText)
        morningScreenTimeEditText = findViewById(R.id.morningScreenTimeEditText)
        activityNotesEditText = findViewById(R.id.activityNotesEditText)

        val addButton: Button = findViewById(R.id.addButton)
        val clearButton: Button = findViewById(R.id.clearButton
        val detailedViewButton: Button = findViewById(R.id.detailedViewButton)

        addButton.setOnClickListener {
            addScreenTime()
        }

        clearButton.setOnClickListener {
            clearData()
        }

        detailedViewButton.setOnClicklistener
        val intent = Intent(this,DetailedViewScreenActivity::class.java)
        intent.putStringArrayListExtra('dates',dates)
        intent.putIntegerArrayListExtra(

        )
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}