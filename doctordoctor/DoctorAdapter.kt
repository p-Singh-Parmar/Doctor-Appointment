package com.example.doctordoctor
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class DoctorAdapter(context: Context, alldoctorArrayList: ArrayList<doctorsavailable?>) :
    ArrayAdapter<doctorsavailable?>(context, 0, alldoctorArrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var listitemView = convertView
        if (listitemView == null) {
            // Layout Inflater inflates each item to be displayed in GridView.
            listitemView = LayoutInflater.from(context).inflate(R.layout.singlelistadmin, parent, false)
        }

        val doctorModel: doctorsavailable? = getItem(position)
        val doctor_image = listitemView!!.findViewById<ImageView>(R.id.imageofdoctor)
        val doctor_name = listitemView.findViewById<TextView>(R.id.Nameofdoctor)
        val doctor_degree= listitemView.findViewById<TextView>(R.id.Degreeofdoctor)
        val doctor_experience=listitemView.findViewById<TextView>(R.id.Experienceofdoctor)
        val doctor_fees=listitemView.findViewById<TextView>(R.id.Feesofdoctor)
        val doctor_rating=listitemView.findViewById<TextView>(R.id.Ratingofdoctor)
        val doctor_contact=listitemView.findViewById<TextView>(R.id.Contactofdoctor)


       /* departmentIV.setOnClickListener {

        }*/

        doctor_name.setText(doctorModel!!.getname())
        doctor_image.setImageResource(doctorModel.getdoctorimage())
        doctor_degree.setText(doctorModel.getdegree())
        doctor_experience.setText(doctorModel.getexperience())
        doctor_fees.setText(doctorModel.getfees())
        doctor_rating.setText(doctorModel.getrating())
        doctor_contact.setText(doctorModel.getcontact())

        return listitemView
    }
}

