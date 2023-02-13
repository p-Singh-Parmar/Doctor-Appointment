package com.example.doctordoctor

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView

class DepartmentAdapter(context: HomeScreen, departmentdoctorArrayList: ArrayList<Departments?>) :
    ArrayAdapter<Departments?>(context, 0, departmentdoctorArrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var listitemView = convertView
        if (listitemView == null) {
            // Layout Inflater inflates each item to be displayed in GridView.
            listitemView = LayoutInflater.from(context).inflate(R.layout.singlegrid, parent, false)
        }

        val departmentModel: Departments? = getItem(position)
        val departmentTV = listitemView!!.findViewById<TextView>(R.id.department_name)
        val departmentIV = listitemView.findViewById<ImageView>(R.id.gridelement)





        departmentTV.setText(departmentModel!!.getDepartment_name())
        departmentIV.setImageResource(departmentModel.getImage_id())
        return listitemView
    }

    }

