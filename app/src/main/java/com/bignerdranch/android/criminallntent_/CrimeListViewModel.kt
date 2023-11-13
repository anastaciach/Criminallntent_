package com.bignerdranch.android.criminallntent_
import androidx.lifecycle.ViewModel

class CrimeListViewModel : ViewModel(){
    private val crimeRepository = CrimeRepository.get()
    val crimeListLiveData = crimeRepository.getCrimes()

}
