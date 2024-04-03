package com.emp.adv160420095week6.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.emp.adv160420095week6.databinding.SuperheroListItemBinding
import com.emp.adv160420095week6.model.Superhero

class SuperheroLitsAdapter(val superherolist:ArrayList<Superhero>)
    :RecyclerView.Adapter<SuperheroLitsAdapter.SuperHeroViewHolder>()

{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):SuperHeroViewHolder{
        val binding = SuperheroListItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)
        return SuperHeroViewHolder(binding)

    }
    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
        holder.binding.txtId.text = superherolist[position].id.toString()
        holder.binding.txtNama.text = superherolist[position].nama

        holder.binding.btnDetail.setOnClickListener {
            val action = SuperheroListFragmentDirections.actionSuperheroDetailFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }
    override fun getItemCount(): Int {	return superherolist.size}

    fun updateSuperheroList(newStudentList: ArrayList<Superhero>) {
        superherolist.clear()
        superherolist.addAll(newStudentList)
        notifyDataSetChanged()
    }




    class SuperHeroViewHolder(var binding: SuperheroListItemBinding)
        : RecyclerView.ViewHolder(binding.root)

}