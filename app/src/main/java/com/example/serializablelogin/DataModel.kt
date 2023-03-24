package com.example.serializablelogin

data class DataModel(val name : String, val email: String,
                     val phone : String, val address : String, val age : Int):java.io.Serializable {
}

