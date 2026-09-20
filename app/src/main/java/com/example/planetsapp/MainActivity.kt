package com.example.planetsapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ListView
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView :ListView = findViewById(R.id.listView)

        val planet1 = Planet("Mercury", "The smallest planet in the solar system and the closest to the sun.", R.drawable.mercury)
        val planet2 = Planet("Venus", "The second planet from the sun and the hottest planet in the solar system.", R.drawable.venus)
        val planet3 = Planet("Earth", "The third planet from the sun and the only known planet to support life.", R.drawable.earth)
        val planet4 = Planet("Mars", "The fourth planet from the sun and the second smallest planet in the solar system.", R.drawable.mars)
        val planet5 = Planet("Jupiter", "The largest planet in the solar system and the fifth planet from the sun.", R.drawable.jupiter)
        val planet6 = Planet("Saturn", "The sixth planet from the sun and the second largest planet in the solar system.", R.drawable.saturn)
        val planet7 = Planet("Uranus", "The seventh planet from the sun and the fourth largest planet in the solar system.", R.drawable.uranus)
        val planet8 = Planet("Neptune", "The eighth planet from the sun and the farthest known planet in the solar system.", R.drawable.neptune)

        var planetList = ArrayList<Planet>()
        planetList.add(planet1)
        planetList.add(planet2)
        planetList.add(planet3)
        planetList.add(planet4)
        planetList.add(planet5)
        planetList.add(planet6)
        planetList.add(planet7)
        planetList.add(planet8)


        var myAdapter = MyCustomAdapter(this, planetList)

        listView.adapter = myAdapter




        }
    }