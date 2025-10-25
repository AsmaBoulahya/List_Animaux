# 🐶 Animaux Interactifs

Une application Android simple et interactive développée en **Kotlin**, permettant d’afficher une liste d’animaux avec images, détails et options de suppression ou de sélection multiple.  
L’utilisateur peut afficher les détails d’un animal, supprimer un ou plusieurs animaux, et même changer le mode d’affichage entre **liste** et **grille**.

---

## 📱 Fonctionnalités principales

✅ **Affichage dynamique**  
- Liste ou grille des animaux avec leurs noms, espèces et images.  
- Adaptateur personnalisé avec `RecyclerView`.

✅ **Interactions utilisateur**  
- Boutons *Détails* pour chaque animal (affiche les informations dans un message).  
- Boutons *Supprimer* pour enlever un animal de la liste.  
- **Checkboxes** pour sélectionner plusieurs animaux à la fois.

✅ **Barre de sélection intelligente**  
- Lorsqu’un ou plusieurs animaux sont cochés, une barre colorée apparaît en haut.  
- Elle affiche :
  - 🗑️ Supprimer  
  - 👁️ Détails  
  - ✅ Sélectionner tout  
  - Et un texte indiquant la position des éléments sélectionnés.  
- Une **alerte de confirmation** s’affiche avant toute suppression.

✅ **Changement de mise en page**
- L’utilisateur peut basculer entre :
  - **Affichage linéaire**  
  - **Affichage en grille**

---

## 🧩 Architecture du projet

```
app/
├── java/com/example/animal/
│   ├── MainActivity.kt
│   ├── AdapterAnimaux.kt
│   ├── Animal.kt
├── res/
│   ├── layout/
│   │   ├── activity_main.xml
│   │   ├── animal_item.xml
│   ├── drawable/ (images des animaux et icônes)
│   ├── values/
│   │   ├── colors.xml
│   │   ├── strings.xml
│   │   ├── themes.xml
```

---

## 🖼️ Aperçu de l’application
![4db2c8b6-cd84-4605-996a-014d61976d18](https://github.com/user-attachments/assets/c66abb03-3871-44ad-b1f4-74f0514a79c4)![2fd2d95e-f8c3-40f4-a97f-a921670c4e93](https://github.com/user-attachments/assets/bb024cda-bbf7-4060-b052-45acd738909e)

![e8b54289-6d53-4537-9270-a1eea2e22046](https://github.com/user-attachments/assets/d3d57272-ebdf-4064-be6e-13cf02feaa2d)

---

## ⚙️ Technologies utilisées
- **Langage :** Kotlin  
- **Interface :** XML Layouts  
- **Composants Android :**
  - RecyclerView  
  - Adapter personnalisé  
  - AlertDialog  
  - RadioButton  
  - CheckBox  

---

## 💡 Améliorations possibles
- Ajouter un **mode sombre / clair** automatique  
- Sauvegarder la liste d’animaux avec **Room** (base de données locale)  
- Ajouter une **fiche détaillée** (page dédiée à chaque animal)  
- Utiliser **Material Design 3** pour moderniser l’interface  

---

## 👩‍💻 Auteur
**Asma Boulahya**  
Étudiante en développement mobile 📱  
💬 Passionnée par la création d’applications interactives et l’apprentissage du développement Android.

---
