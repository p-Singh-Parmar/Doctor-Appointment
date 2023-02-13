package com.example.doctordoctor.data

import android.provider.ContactsContract.Data
import androidx.room.TypeConverter
import java.util.*
import com.example.doctordoctor.R




class Converter {
    @TypeConverter
    fun fromDatatoLong(value:Data):Long{
        //return value.time
        return 1
    }
    @TypeConverter
    fun fromLongToData(value:Long): Date {
        return Date(value)
    }
}