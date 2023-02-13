package com.example.doctordoctor

class Departments(var departmentname: String, var imageid: Int) {

    fun getDepartment_name(): String {
        return departmentname
    }

    fun setDepartment_name(department_name: String) {
        this.departmentname = department_name
    }

    fun getImage_id(): Int {
        return imageid
    }

    fun setImage_id(imageid: Int) {
        this.imageid = imageid
    }
}