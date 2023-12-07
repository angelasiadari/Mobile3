package com.cc.utslabmp3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mobile3_uts.R

class MealAdapter(private val mealList: List<Meal>) :
    RecyclerView.Adapter<MealAdapter.MealListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MealListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.meal_list, parent, false)
        return MealListViewHolder(view)
    }

    override fun onBindViewHolder(holder: MealListViewHolder, position: Int) {
        val meal = mealList[position]
        holder.imageView.setImageResource(meal.imageResource)
        holder.titleTextView.text = meal.text
        holder.calorieTextView.text = meal.calorie
    }

    override fun getItemCount(): Int = mealList.size

    class MealListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
        val calorieTextView: TextView = itemView.findViewById(R.id.calorieTextView)

    }
}
