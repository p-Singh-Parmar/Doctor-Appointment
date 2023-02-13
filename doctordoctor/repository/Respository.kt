package com.example.doctordoctor.repository

import androidx.lifecycle.LiveData
import com.example.doctordoctor.data.Patient
import com.example.doctordoctor.data.PatientDAO

class Respository(val patient: PatientDAO) {
    // in abv constructor we get the instance of the data source(DB and API)

    fun getPatients():LiveData<List<Patient>> {
        return patient.getAllPatient()
    }

    suspend fun insertPatient(pat: Patient){
        patient.insertPatient(pat)
    }

    // data taken by api will also be written here: encapsulation
}