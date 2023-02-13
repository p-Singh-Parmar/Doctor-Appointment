package com.example.doctordoctor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.core.view.MenuItemCompat

class Searchscreen : AppCompatActivity() {
    lateinit var listView: ListView

    // Define array adapter for ListView
    lateinit var adapter: ArrayAdapter<String>

    // Define array List for List View data
    lateinit var mylist: ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.listview)



        // initialise ListView with id
        listView = findViewById(R.id.listView) as ListView

        // Add items to Array List
        mylist = ArrayList()
        mylist.add("Gynocologist")
        mylist.add("Cardiologist")
        mylist.add("Neurologist")
        mylist.add("Orthopedic")
        mylist.add("Dermatologist")
        mylist.add("ENT")
        mylist.add("Dentist")
        mylist.add("Paediatrician")
        mylist.add("Rehabilitation")

        // Set adapter to ListView
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, mylist)
        listView.adapter = adapter}


        override fun onCreateOptionsMenu(menu: Menu): Boolean {
            // Inflate menu with items using MenuInflator
            val inflater = menuInflater
            inflater.inflate(R.menu.menu, menu)

            // Initialise menu item search bar
            // with id and take its object
            val searchViewItem = menu.findItem(R.id.search_bar)
            val searchView = MenuItemCompat.getActionView(searchViewItem) as SearchView
            // attach setOnQueryTextListener
            // to search view defined above
            searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
                // Override onQueryTextSubmit method which is call when submit query is searched
                override fun onQueryTextSubmit(query: String): Boolean {
                    // If the list contains the search query than filter the adapter
                    // using the filter method with the query as its argument
                    if (mylist.contains(query)) {
                        adapter.filter.filter(query)
                    } else {
                        // Search query not found in List View
                        Toast.makeText(this@Searchscreen, "Not found", Toast.LENGTH_LONG).show()
                    }
                    return false
                }

                // This method is overridden to filter the adapter according
                // to a search query when the user is typing search
                override fun onQueryTextChange(newText: String): Boolean {
                    adapter.filter.filter(newText)
                    return false
                }
            })
            return super.onCreateOptionsMenu(menu)
        }
    }

