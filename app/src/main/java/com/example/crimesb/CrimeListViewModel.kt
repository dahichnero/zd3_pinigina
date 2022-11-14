package com.example.crimesb


import androidx.lifecycle.ViewModel
import java.util.*

class CrimeListViewModel : ViewModel() {
    val crimes= mutableListOf<Crime>()
    var i:Int=1
    val dateN = Date()
    init{
        while (i<=100){
            val criminal=Crime()
            criminal.title="Crime #$i"
            criminal.date=dateN
            criminal.isSolved=i%2==0
            criminal.requiresPolice=i%2
            crimes.add(criminal)
            i++
        }
    }
}