package com. example.doctordoctor

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.icu.util.Calendar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
//import com.example.doctordoctor.Finaldataclass.Companion.finaldataArrayList
import java.util.logging.Logger.global


class Doc_Detail : AppCompatActivity() {

    lateinit var pickDateBtn: Button
    lateinit var selectedDateTV: TextView

    lateinit var finalDate: CharSequence
    lateinit var finalTime:String



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doc_detail)


        // on below line we are initializing our variables.
        pickDateBtn = findViewById(R.id.idBtnPickDate)
        selectedDateTV = findViewById(R.id.idTVSelectedDate)

        lateinit var previewSelectedTimeTextView: TextView

        // on below line we are adding
        // click listener for our button
        pickDateBtn.setOnClickListener {
            // on below line we are getting
            // the instance of our calendar.
            val c = Calendar.getInstance()

            // on below line we are getting
            // our day, month and year.
            val year = c.get(Calendar.YEAR)
            val month = c.get(Calendar.MONTH)
            val day = c.get(Calendar.DAY_OF_MONTH)

            // on below line we are creating a
            // variable for date picker dialog.
            val datePickerDialog = DatePickerDialog(
                // on below line we are passing context.
                this,
                { view, year, monthOfYear, dayOfMonth ->
                    // on below line we are setting
                    // date to our text view.
                    selectedDateTV.text =
                        (dayOfMonth.toString() + "-" + (monthOfYear + 1) + "-" + year)

                    finalDate=selectedDateTV.text
                },
                // on below line we are passing year, month
                // and day for the selected date in our date picker.
                year,
                month,
                day
            )
            // at last we are calling show
            // to display our date picker dialog.
            datePickerDialog.show()
        }

        // listener which is triggered when the
        // time is picked from the time picker dialog
        val timePickerDialogListener: TimePickerDialog.OnTimeSetListener =
            TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute -> // logic to properly handle
                // the picked timings by user
                val formattedTime: String = when {
                    hourOfDay == 0 -> {
                        if (minute < 10) {
                            "${hourOfDay + 12}:0${minute} am"
                        } else {
                            "${hourOfDay + 12}:${minute} am"
                        }
                    }
                    hourOfDay > 12 -> {
                        if (minute < 10) {
                            "${hourOfDay - 12}:0${minute} pm"
                        } else {
                            "${hourOfDay - 12}:${minute} pm"
                        }
                    }
                    hourOfDay == 12 -> {
                        if (minute < 10) {
                            "${hourOfDay}:0${minute} pm"
                        } else {
                            "${hourOfDay}:${minute} pm"
                        }
                    }
                    else -> {
                        if (minute < 10) {
                            "${hourOfDay}:${minute} am"
                        } else {
                            "${hourOfDay}:${minute} am"
                        }
                    }
                }

                previewSelectedTimeTextView.text = formattedTime
                finalTime=formattedTime
                //picktime(finalTime)
            }

        // instance of the UI elements
        val buttonPickTime: Button = findViewById<Button>(R.id.pick_time_button)
        previewSelectedTimeTextView = findViewById<TextView>(R.id.idBtnPickDate)

        // handle the pick time button to
        // open the TimePickerDialog
        buttonPickTime.setOnClickListener {
            val timePicker: TimePickerDialog = TimePickerDialog(
                // pass the Context
                this,
                // listener to perform task
                // when time is picked
                timePickerDialogListener,
                // default hour when the time picker
                // dialog is opened
                12,
                // default minute when the time picker
                // dialog is opened
                10,
                // 24 hours time picker is
                // false (varies according to the region)
                false
            )

            // then after building the timepicker
            // dialog show the dialog to user
            timePicker.show()
        }

        val doctorList=intent.getSerializableExtra("specific") as ArrayList<specificdoctorsavailable>

        val pos=intent.getIntExtra("position",0)

        val docNameobject=findViewById<TextView>(R.id.mainName)
        val txDegobject=findViewById<TextView>(R.id.textDeg)
        val vlDegobject=findViewById<TextView>(R.id.valueDeg)
        val txNumobject=findViewById<TextView>(R.id.textNum)
        val vlNumobject=findViewById<TextView>(R.id.valueNum)
        val txExpoobject=findViewById<TextView>(R.id.textExp)
        val vlExpobject=findViewById<TextView>(R.id.valueExp)
        val txRatobject=findViewById<TextView>(R.id.textRat)
        val vlRatobject=findViewById<TextView>(R.id.valueRat)
        val feeobject=findViewById<TextView>(R.id.valueFees)

        docNameobject.setText(doctorList[pos].name)
        vlDegobject.setText(doctorList[pos].degree)
        vlNumobject.setText(doctorList[pos].Contact)
        vlExpobject.setText(doctorList[pos].Experience)
        vlRatobject.setText(doctorList[pos].rating)
        feeobject.setText(doctorList[pos].fees)




    }
/*
    private fun picktime(finalTime: String) {
        finaldataArrayList.add(finalTime)

    }*/









  //  fun appointed(view: View) {
   //     Toast.makeText(applicationContext, "Your appointment has been booked with Doctor", Toast.LENGTH_LONG).show()
        //    }
}