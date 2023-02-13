package com.example.doctordoctor

 class specificdoctorsavailable(var imageid:Int,var name: String,var degree: String, var Experience: String,var Contact:String,var fees:String,var rating:String) {

    fun getdoctorimage(): Int{
        return imageid
    }

    fun setname(name: String) {
        this.name = name
    }

    fun getname(): String {
        return name
    }

    fun setdoctor(imageid: Int) {
        this.imageid = imageid
    }
    fun getdegree(): String{
        return degree
    }

    fun setdegree(degree: String) {
        this.degree = degree
    }
    fun getexperience(): String{
        return Experience
    }

    fun setexperience(experience: String) {
        this.Experience = experience
    }
    fun getcontact(): String{
        return Contact
    }

    fun setcontact(contact: String) {
        this.Contact = contact
    }
    fun getfees(): String{
        return fees
    }

    fun setfees(fees: String) {
        this.fees = fees
    }
    fun getrating(): String{
        return rating
    }

    fun setrating(rating: String) {
        this.rating = rating
    }}
