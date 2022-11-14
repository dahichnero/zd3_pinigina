package com.example.crimesb

import java.util.*

data class Crime (var id: UUID = UUID.randomUUID())  {
    var title:String = ""
    var date: Date? = null
    var isSolved: Boolean? = null
    var requiresPolice: Int?=0
    constructor(id: UUID, title: String, date: Date, isSolved:Boolean, requiresPolice:Int):this(id){
        this.title = title
        this.date = date
        this.id = id
        this.isSolved=isSolved
        this.requiresPolice=requiresPolice
    }
}
