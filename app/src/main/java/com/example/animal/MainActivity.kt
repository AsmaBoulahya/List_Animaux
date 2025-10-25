package com.example.animal

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: AdapterAnimaux

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val toolbar = findViewById<LinearLayout>(R.id.selectionToolbar)
        val textInfo = findViewById<TextView>(R.id.textSelectionInfo)
        val iconDelete = findViewById<ImageView>(R.id.iconDelete)
        val iconDetail = findViewById<ImageView>(R.id.iconDetail)
        val iconSelectAll = findViewById<ImageView>(R.id.iconSelectAll)

        val animaux = mutableListOf(
            Animal("Chat", "Mammifère", R.drawable.cat),
            Animal("Chien", "Mammifère", R.drawable.dog),
            Animal("Lion", "Mammifère", R.drawable.lion),
            Animal("Perroquet", "Oiseau", R.drawable.parrot),
            Animal("Tortue", "Reptile", R.drawable.turtle)
        )

        adapter = AdapterAnimaux(animaux) { count, positions ->
            if (count > 0) {
                toolbar.visibility = View.VISIBLE
                textInfo.text = "Vous avez sélectionné l’élément de position : ${positions.joinToString(", ")}"
            } else {
                toolbar.visibility = View.GONE
            }
        }

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

// 🗑️ Supprimer les éléments sélectionnés (avec confirmation)
        iconDelete.setOnClickListener {
            val selected = adapter.getSelected()

            if (selected.isEmpty()) {
                Toast.makeText(this, "Aucun élément sélectionné", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // ✅ Création de l'alerte de confirmation
            androidx.appcompat.app.AlertDialog.Builder(this)
                .setTitle("Confirmation de suppression")
                .setMessage("Voulez-vous vraiment supprimer ${selected.size} élément(s) ?")
                .setPositiveButton("Oui") { dialog, _ ->
                    adapter.supprimerSelection()
                    toolbar.visibility = View.GONE
                    Toast.makeText(this, "Éléments supprimés", Toast.LENGTH_SHORT).show()
                    dialog.dismiss()
                }
                .setNegativeButton("Annuler") { dialog, _ ->
                    dialog.dismiss()
                }
                .setCancelable(true)
                .show()
        }


        // 👁️ Afficher les détails
        iconDetail.setOnClickListener {
            val selected = adapter.getSelected()
            if (selected.isNotEmpty()) {
                val noms = selected.joinToString(", ") { it.nom }
                Toast.makeText(this, "Détails : $noms", Toast.LENGTH_SHORT).show()
            }
        }

        // ✅ Tout sélectionner
        iconSelectAll.setOnClickListener {
            adapter.selectAll(true)
        }
    }
}
