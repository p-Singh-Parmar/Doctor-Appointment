package com.example.doctordoctor.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities=[Patient::class], version=1)
abstract class PatientDatabase:RoomDatabase() {

    abstract fun patientDao(): PatientDAO

    companion object {
        // this approach is Thread safe and Singleton( only one instance of our DB is created)

        @Volatile   // volatile annotation makes all threads know  that value has been assigned to the Instance object nd will be common for all threads
        private var Instance: PatientDatabase? = null

        fun getDataBase(context: Context): PatientDatabase {
            if (Instance == null) {
                // this Locks our database instance that multiple threads will try to access
                synchronized(this){

                    Instance = Room.databaseBuilder(context.applicationContext, PatientDatabase::class.java,
                        "PatientDB").build()
                }
            }
            return Instance!!
        }
    }

}