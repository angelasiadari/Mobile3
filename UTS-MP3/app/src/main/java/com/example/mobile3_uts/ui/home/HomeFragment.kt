package com.example.mobile3_uts.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.cc.utslabmp3.MealAdapter
import com.cc.utslabmp3.Meal
import com.example.mobile3_uts.R
import com.example.mobile3_uts.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var recyclerViewAdapter: MealAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val recyclerView = binding.recyclerView
        val layoutManager = LinearLayoutManager(requireContext())
        recyclerView.layoutManager = layoutManager

        recyclerViewAdapter = MealAdapter(createMealList())
        recyclerView.adapter = recyclerViewAdapter
    }

    private fun createMealList(): List<Meal> {
        val mealList = mutableListOf<Meal>()
        mealList.add(Meal(R.drawable.meal_1, "Greek Salad with Lettuce, Green Onion", "150 kcal"))
        mealList.add(Meal(R.drawable.meal_2, "Salad of Fresh Vegetables", "270 kcal"))
        mealList.add(Meal(R.drawable.meal_3, "Acai Bowl", "1 kcal"))
        mealList.add(Meal(R.drawable.meal_4, "Steak", "300 kcal"))


        return mealList
    }

}
