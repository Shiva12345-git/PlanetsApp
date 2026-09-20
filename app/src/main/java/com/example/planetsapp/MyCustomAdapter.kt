package com.example.planetsapp
import android.content.Context
import android.view.View
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class MyCustomAdapter (val context:Context, val planets:List<Planet>): BaseAdapter(){

    override fun getCount(): Int {
        return planets.size
    }

    override fun getItem(position: Int): Any? {

        return planets[position]
    }

    override fun getItemId(position: Int): Long {

        return position.toLong()
    }

    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup?
    ): View? {

        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        val view: View
        if(convertView == null){
            view = inflater.inflate(R.layout.item_list_layout, parent, false)
        }else{
            view = convertView
        }
        // Bind data to view
        val item = getItem(position) as Planet

        //Initialize view
        val titleTextView = view.findViewById<TextView>(R.id.planet_name)
        val moonCountTeatView = view.findViewById<TextView>(R.id.moon_count_text)
        val moon_image = view.findViewById<ImageView>(R.id.imageView)

        titleTextView.text = item.title
        moonCountTeatView.text = item.moonCount
        moon_image.setImageResource(item.imagePlanet)

        // handling click event ON LIST ITEM
        view.setOnClickListener{
            Toast.makeText(context, "You clicked on: ${item.title}", Toast.LENGTH_SHORT).show()
        }

        return view

        }
}