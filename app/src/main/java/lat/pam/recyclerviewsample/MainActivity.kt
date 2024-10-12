package lat.pam.recyclerviewsample

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // getting the recyclerview by its id
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)

        // this creates a vertical layout manager
        recyclerView.layoutManager = LinearLayoutManager(this)

        // arraylist of class ItemsViewModel
        val data = ArrayList<ItemsViewModel>()

        // loop will create 20 views containing
        // the image with the count of view
        for (i in 1..20) data.add(ItemsViewModel("Item " + i))

        // this will pass the arraylist to our adapter
        val adapter = CustomAdapter(data)
        Log.d("Test string", "Jumlah data: " + data.size)

        recyclerView.adapter = adapter

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
    }
}