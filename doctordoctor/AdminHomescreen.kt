package com.example.doctordoctor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class AdminHomescreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.adminhomescreen)

        val listofalldoctors=findViewById<ListView>(R.id.listofalldoctors)
        val alldoctorArrayList: ArrayList<doctorsavailable?> = ArrayList<doctorsavailable?>()

        alldoctorArrayList.add(doctorsavailable(R.drawable.userimage,"Dr Prakhar","Physician","10 years","637373737","700","4.5"))
        alldoctorArrayList.add(doctorsavailable(R.drawable.userimage,"Dr Ashish","Physician","11 years","637373537","750","4.1"))
        alldoctorArrayList.add(doctorsavailable(R.drawable.userimage,"Dr Manish","Physician","15 years","937373737","800","4.5"))
        alldoctorArrayList.add(doctorsavailable(R.drawable.userimage,"Dr Akash","Orthopaedic","10 years","638373737","700","4.0"))
        alldoctorArrayList.add(doctorsavailable(R.drawable.userimage,"Dr Daksh","Orthopaedic","9 years","637373737","700","3.5"))
        alldoctorArrayList.add(doctorsavailable(R.drawable.userimage,"Dr Naman","Orthopaedic","12 years","687373737","600","4.8"))
        alldoctorArrayList.add(doctorsavailable(R.drawable.userimage,"Dr Anurag","Cardiologist","16 years","837373537","850","4.0"))
        alldoctorArrayList.add(doctorsavailable(R.drawable.userimage,"Dr Zuhair","Cardiologist","6 years","937373737","1000","3.9"))
        alldoctorArrayList.add(doctorsavailable(R.drawable.userimage,"Dr Soumyadeep","Cardiologist","8 years","638373735","900","4.1"))
        alldoctorArrayList.add(doctorsavailable(R.drawable.userimage,"Dr Prakhar","Physician","10 years","637373737","700","4.5"))
        alldoctorArrayList.add(doctorsavailable(R.drawable.userimage,"Dr Ashish","Physician","11 years","637373537","750","4.1"))
        alldoctorArrayList.add(doctorsavailable(R.drawable.userimage,"Dr Manish","Physician","15 years","937373737","800","4.5"))
        alldoctorArrayList.add(doctorsavailable(R.drawable.userimage,"Dr Akash","Orthopaedic","10 years","638373737","700","4.0"))
        alldoctorArrayList.add(doctorsavailable(R.drawable.userimage,"Dr Daksh","Orthopaedic","9 years","637373737","700","3.5"))
        alldoctorArrayList.add(doctorsavailable(R.drawable.userimage,"Dr Naman","Orthopaedic","12 years","687373737","600","4.8"))
        alldoctorArrayList.add(doctorsavailable(R.drawable.userimage,"Dr Anurag","Cardiologist","16 years","837373537","850","4.0"))
        alldoctorArrayList.add(doctorsavailable(R.drawable.userimage,"Dr Zuhair","Cardiologist","6 years","937373737","1000","3.9"))
        alldoctorArrayList.add(doctorsavailable(R.drawable.userimage,"Dr Soumyadeep","Cardiologist","8 years","638373735","900","4.1"))
        alldoctorArrayList.add(doctorsavailable(R.drawable.userimage,"Dr Prakhar","Physician","10 years","637373737","700","4.5"))
        alldoctorArrayList.add(doctorsavailable(R.drawable.userimage,"Dr Ashish","Physician","11 years","637373537","750","4.1"))
        alldoctorArrayList.add(doctorsavailable(R.drawable.userimage,"Dr Manish","Physician","15 years","937373737","800","4.5"))
        alldoctorArrayList.add(doctorsavailable(R.drawable.userimage,"Dr Akash","Orthopaedic","10 years","638373737","700","4.0"))
        alldoctorArrayList.add(doctorsavailable(R.drawable.userimage,"Dr Daksh","Orthopaedic","9 years","637373737","700","3.5"))
        alldoctorArrayList.add(doctorsavailable(R.drawable.userimage,"Dr Naman","Orthopaedic","12 years","687373737","600","4.8"))
        alldoctorArrayList.add(doctorsavailable(R.drawable.userimage,"Dr Anurag","Cardiologist","16 years","837373537","850","4.0"))
        alldoctorArrayList.add(doctorsavailable(R.drawable.userimage,"Dr Zuhair","Cardiologist","6 years","937373737","1000","3.9"))
        alldoctorArrayList.add(doctorsavailable(R.drawable.userimage,"Dr Soumyadeep","Cardiologist","8 years","638373735","900","4.1"))

        val adapter = DoctorAdapter(this, alldoctorArrayList)
        listofalldoctors.adapter = adapter





    }
}