package com.example.animal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView

class AdapterAnimaux(
    private val animaux: MutableList<Animal>,
    private val onSelectionChanged: (selectedCount: Int, selectedPositions: List<Int>) -> Unit
) : RecyclerView.Adapter<AdapterAnimaux.AnimalViewHolder>() {

    class AnimalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val checkSelect: CheckBox = itemView.findViewById(R.id.checkSelect)
        val image: ImageView = itemView.findViewById(R.id.imgAnimal)
        val nom: TextView = itemView.findViewById(R.id.tvNomAnimal)
        val espece: TextView = itemView.findViewById(R.id.tvEspece)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.animal_item, parent, false)
        return AnimalViewHolder(view)
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        val animal = animaux[position]

        holder.image.setImageResource(animal.image)
        holder.nom.text = animal.nom
        holder.espece.text = animal.espece
        holder.checkSelect.isChecked = animal.isSelected

        holder.checkSelect.setOnCheckedChangeListener(null)
        holder.checkSelect.isChecked = animal.isSelected

        // ✅ Quand on coche/décoche un élément
        holder.checkSelect.setOnCheckedChangeListener { _, isChecked ->
            animal.isSelected = isChecked
            val selectedPositions = animaux
                .mapIndexedNotNull { index, a -> if (a.isSelected) index else null }
            onSelectionChanged(selectedPositions.size, selectedPositions)
        }
    }

    override fun getItemCount() = animaux.size

    fun supprimerSelection() {
        animaux.removeAll { it.isSelected }
        notifyDataSetChanged()
    }

    fun selectAll(isChecked: Boolean) {
        animaux.forEach { it.isSelected = isChecked }
        notifyDataSetChanged()
        val selectedPositions = animaux
            .mapIndexedNotNull { index, a -> if (a.isSelected) index else null }
        onSelectionChanged(selectedPositions.size, selectedPositions)
    }

    fun getSelected(): List<Animal> = animaux.filter { it.isSelected }
}
