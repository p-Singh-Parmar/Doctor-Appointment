package com.example.doctordoctor.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="patient")
data class Patient(
    @PrimaryKey(autoGenerate=false)
    val id:Long,
    val number:Long,
    val username:String,
    val password:String,
    val email:String
)