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

| Liste | Sélection | Grille |
|:-----:|:----------:|:------:|
| ![Liste](https://via.placeholder.com/200x350.png?text=Liste) | ![Sélection](https://via.placeholder.com/200x350.png?text=Sélection) | ![Grille](https://via.placeholder.com/200x350.png?text=Grille) |

*(Remplace ces images par des captures réelles de ton app)*

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

## 🐾 Licence
Ce projet est open-source et libre d’utilisation pour l’apprentissage et la pratique du développement Android.
