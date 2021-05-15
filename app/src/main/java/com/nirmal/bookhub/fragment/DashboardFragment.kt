package com.nirmal.bookhub.fragment
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nirmal.bookhub.R
import layout.DashboardRecyclerAdapter


class DashboardFragment : Fragment() {
    lateinit var recyclerDashboard: RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager

    val booklist = arrayListOf(
        "P.S I love you",
        "The Great Gateby",
        "Anna Karenina",
        "The Kite Runner by Khaled Hosseini",
        "Harry Potter and the Philosopher’s Stone",
        "Slaughterhouse-Five",
        "To Kill a Mockingbird",
        "The Book Thief",
        "Wuthering Heights",
        "The Catcher in the Rye"
    )
    lateinit var recyclerAdapter: DashboardRecyclerAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view =inflater.inflate(R.layout.fragment_dashboard, container, false) //here no return value
        recyclerDashboard = view.findViewById(R.id.recyclerDashboard)
        layoutManager = LinearLayoutManager(activity)
        recyclerAdapter = DashboardRecyclerAdapter(activity as Context, booklist)
        recyclerDashboard.adapter = recyclerAdapter
        recyclerDashboard.layoutManager = layoutManager

        return view
    }

}