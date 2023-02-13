package com.example.doctordoctor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.ListView
import java.lang.reflect.Array.get

class specificdepartment : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.specificdepartment)
        val specificdepartment = intent.getStringExtra("Departmentofdoctor").toString()
       val listofspecificdoctors = findViewById<ListView>(R.id.listviewofspecificdoctors)


        when(specificdepartment){
            "Physician"->{
                val specificdoctorArrayList: ArrayList<specificdoctorsavailable?> = ArrayList<specificdoctorsavailable?>()
                specificdoctorArrayList.add(specificdoctorsavailable(R.drawable.userimage,"Dr Prakhar","Physician","10 years","637373737","700","4.5"))
                specificdoctorArrayList.add(specificdoctorsavailable(R.drawable.userimage,"Dr Ashish","Physician","11 years","637373537","750","4.1"))
                specificdoctorArrayList.add(specificdoctorsavailable(R.drawable.userimage,"Dr Manish","Physician","15 years","937373737","800","4.5"))

                val adapter = specificdoctoradapter(this, specificdoctorArrayList)
                listofspecificdoctors.adapter = adapter




                listofspecificdoctors.setOnItemClickListener { parent, view, position, id ->

                        var intent = Intent(this@specificdepartment, Doc_Detail::class.java)
                        intent.putExtra("specific", specificdoctorArrayList)
                        intent.putExtra("position", position)
                        startActivity(intent)



                }
            }




            "Dentist"->

            {    val specificdoctorArrayList: ArrayList<specificdoctorsavailable?> = ArrayList<specificdoctorsavailable?>()
                specificdoctorArrayList.add(specificdoctorsavailable(R.drawable.userimage,"Dr Akash","Dentist","10 years","638373737","700","4.0"))
                specificdoctorArrayList.add(specificdoctorsavailable(R.drawable.userimage,"Dr Daksh","Dentist","9 years","637373737","700","3.5"))
                specificdoctorArrayList.add(specificdoctorsavailable(R.drawable.userimage,"Dr Naman","Dentist","12 years","687373737","600","4.8"))
                val adapter = specificdoctoradapter(this, specificdoctorArrayList)
                listofspecificdoctors.adapter = adapter
            }
            "ENT"->
            {val specificdoctorArrayList: ArrayList<specificdoctorsavailable?> = ArrayList<specificdoctorsavailable?>()
                specificdoctorArrayList.add(specificdoctorsavailable(R.drawable.userimage,"Dr Akash","ENT","10 years","638373737","700","4.0"))
                specificdoctorArrayList.add(specificdoctorsavailable(R.drawable.userimage,"Dr Daksh","ENT","9 years","637373737","700","3.5"))
                specificdoctorArrayList.add(specificdoctorsavailable(R.drawable.userimage,"Dr Naman","ENT","12 years","687373737","600","4.8"))
                val adapter = specificdoctoradapter(this, specificdoctorArrayList)
                listofspecificdoctors.adapter = adapter

            }
            "Rehabilitation"->
            {
                val specificdoctorArrayList: ArrayList<specificdoctorsavailable?> = ArrayList<specificdoctorsavailable?>()
                specificdoctorArrayList.add(specificdoctorsavailable(R.drawable.userimage,"Dr Akash","Physiotherapist","10 years","638373737","700","4.0"))
                specificdoctorArrayList.add(specificdoctorsavailable(R.drawable.userimage,"Dr Daksh","Physiotherapist","9 years","637373737","700","3.5"))
                specificdoctorArrayList.add(specificdoctorsavailable(R.drawable.userimage,"Dr Naman","Physiotherapist","12 years","687373737","600","4.8"))
                val adapter = specificdoctoradapter(this, specificdoctorArrayList)
                listofspecificdoctors.adapter = adapter
            }
            "Cardiologist"->
            {
                val specificdoctorArrayList: ArrayList<specificdoctorsavailable?> = ArrayList<specificdoctorsavailable?>()
            specificdoctorArrayList.add(specificdoctorsavailable(R.drawable.userimage,"Dr Akash","Cardiologist","10 years","638373737","700","4.0"))
                    specificdoctorArrayList.add(specificdoctorsavailable(R.drawable.userimage,"Dr Daksh","Cardiologist","9 years","637373737","700","3.5"))
                    specificdoctorArrayList.add(specificdoctorsavailable(R.drawable.userimage,"Dr Naman","Cardiologist","12 years","687373737","600","4.8"))
                val adapter = specificdoctoradapter(this, specificdoctorArrayList)
                listofspecificdoctors.adapter = adapter}
            "Gyaenocologist"->
             {
                  val specificdoctorArrayList: ArrayList<specificdoctorsavailable?> = ArrayList<specificdoctorsavailable?>()
                 specificdoctorArrayList.add(specificdoctorsavailable(R.drawable.userimage,"Dr Akash","Gynaecologist","10 years","638373737","700","4.0"))
                 specificdoctorArrayList.add(specificdoctorsavailable(R.drawable.userimage,"Dr Daksh","Gyaenocologist","9 years","637373737","700","3.5"))
                 specificdoctorArrayList.add(specificdoctorsavailable(R.drawable.userimage,"Dr Naman","Gyaenocologist","12 years","687373737","600","4.8"))
                 val adapter = specificdoctoradapter(this, specificdoctorArrayList)
                 listofspecificdoctors.adapter = adapter
             }
            "Neurologist"->
            {

                val specificdoctorArrayList: ArrayList<specificdoctorsavailable?> = ArrayList<specificdoctorsavailable?>()
            specificdoctorArrayList.add(specificdoctorsavailable(R.drawable.userimage,"Dr Akash","Neurologist","10 years","638373737","700","4.0"))
                    specificdoctorArrayList.add(specificdoctorsavailable(R.drawable.userimage,"Dr Daksh","Neurologist","9 years","637373737","700","3.5"))
                    specificdoctorArrayList.add(specificdoctorsavailable(R.drawable.userimage,"Dr Naman","Neurologist","12 years","687373737","600","4.8"))
                val adapter = specificdoctoradapter(this, specificdoctorArrayList)
                listofspecificdoctors.adapter = adapter
        }
            "Orthopaedic"->
            {
                val specificdoctorArrayList: ArrayList<specificdoctorsavailable?> = ArrayList<specificdoctorsavailable?>()
                specificdoctorArrayList.add(specificdoctorsavailable(R.drawable.userimage,"Dr Akash","Orthopaedic","10 years","638373737","700","4.0"))
                specificdoctorArrayList.add(specificdoctorsavailable(R.drawable.userimage,"Dr Daksh","Orthopaedic","9 years","637373737","700","3.5"))
                specificdoctorArrayList.add(specificdoctorsavailable(R.drawable.userimage,"Dr Naman","Orthopaedic","12 years","687373737","600","4.8"))
                val adapter = specificdoctoradapter(this, specificdoctorArrayList)
                listofspecificdoctors.adapter = adapter
            }
            "Paediatrician"->
            { val specificdoctorArrayList: ArrayList<specificdoctorsavailable?> = ArrayList<specificdoctorsavailable?>()
                specificdoctorArrayList.add(specificdoctorsavailable(R.drawable.userimage,"Dr Akash","Paediatrician","10 years","638373737","700","4.0"))
                specificdoctorArrayList.add(specificdoctorsavailable(R.drawable.userimage,"Dr Daksh","Paediatrician","9 years","637373737","700","3.5"))
                specificdoctorArrayList.add(specificdoctorsavailable(R.drawable.userimage,"Dr Naman","Paediatrician","12 years","687373737","600","4.8"))
                val adapter = specificdoctoradapter(this, specificdoctorArrayList)
                listofspecificdoctors.adapter = adapter
            }



        }


    }
}