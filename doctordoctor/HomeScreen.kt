package com.example.doctordoctor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.GridView
import android.widget.ImageView

class HomeScreen : AppCompatActivity() {
    private lateinit var department: GridView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homescreen)

        department = findViewById(R.id.gridofdoctor)
        val departmentdoctorArrayList: ArrayList<Departments?> = ArrayList<Departments?>()

        departmentdoctorArrayList.add(Departments("Physician", R.drawable.physician))
        departmentdoctorArrayList.add(Departments("Dentist", R.drawable.dentist))
        departmentdoctorArrayList.add(Departments("ENT", R.drawable.ent))
        departmentdoctorArrayList.add(Departments("Rehabilitation", R.drawable.rehabilition))
        departmentdoctorArrayList.add(Departments("Cardiologist", R.drawable.cardiologist))
        departmentdoctorArrayList.add(Departments("Gynaecologist", R.drawable.gynaecologist))
        departmentdoctorArrayList.add(Departments("Neurologist", R.drawable.neurologist))
        departmentdoctorArrayList.add(Departments("Orthopaedic", R.drawable.orthopaedic))
        departmentdoctorArrayList.add(Departments("Paediatrician", R.drawable.paediatrician))


        val adapter = DepartmentAdapter(this, departmentdoctorArrayList)
        department.adapter = adapter

        val searchBar = findViewById<ImageView>(R.id.search)
        searchBar.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val intent = Intent(this@HomeScreen, Searchscreen::class.java)
                startActivity(intent)
            }
        }
        )

        val clickobject = findViewById<GridView>(R.id.gridofdoctor)


        clickobject.setOnItemClickListener { parent, view, position, id ->
            get(position)

        }
    }

    fun get(i: Int) {
        when(i) {
             0 -> {val intent:Intent= Intent(this@HomeScreen, specificdepartment::class.java)
                intent.putExtra("Departmentofdoctor", "Physician")
                startActivity(intent)

        }
            1 -> {val intent:Intent= Intent(this@HomeScreen, specificdepartment::class.java)
                intent.putExtra("Departmentofdoctor", "Dentist")
                startActivity(intent)}
            2 -> {val intent:Intent= Intent(this@HomeScreen, specificdepartment::class.java)
                intent.putExtra("Departmentofdoctor", "ENT")
                startActivity(intent)}
            3 -> { val intent:Intent= Intent(this@HomeScreen, specificdepartment::class.java)
                intent.putExtra("Departmentofdoctor", "Rehabilitation")
                startActivity(intent)}
            4 -> { val intent:Intent= Intent(this@HomeScreen, specificdepartment::class.java)
                intent.putExtra("Departmentofdoctor", "Cardiologist")
                startActivity(intent)}
            5 -> { val intent:Intent= Intent(this@HomeScreen, specificdepartment::class.java)
                intent.putExtra("Departmentofdoctor", "Gyaenocologist")
                startActivity(intent)}
            6 -> { val intent:Intent= Intent(this@HomeScreen, specificdepartment::class.java)
                intent.putExtra("Departmentofdoctor", "Neurologist")
                startActivity(intent)}
            7 -> { val intent:Intent= Intent(this@HomeScreen, specificdepartment::class.java)
                intent.putExtra("Departmentofdoctor", "Orthopaedic")
                startActivity(intent)}
            8 -> { val intent:Intent= Intent(this@HomeScreen, specificdepartment::class.java)
                intent.putExtra("Departmentofdoctor", "Paediatrician")
                startActivity(intent)}

            }
        }


    }





