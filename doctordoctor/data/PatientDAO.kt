package com.example.doctordoctor.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface PatientDAO {

    // suspend: follow coroutine structure

    @Insert
    suspend fun insertPatient(patient: Patient)

    @Update
    suspend fun updatePatient(patient: Patient)

    @Delete
    suspend fun deletePatient(patient: Patient)

    @Query("SELECT * FROM Patient")
    fun getAllPatient(): LiveData<List<Patient>>

}