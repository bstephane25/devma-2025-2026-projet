package com.example.model

/**
 * Représente les catégories obligatoires pour la classification des dépenses dans EcoBudget.
 * Le libellé est une donnée métier simple et ne dépend d'aucune API de plateforme.
 */
enum class Category(
    val label: String,
    val emoji: String
) {
    TRANSPORT("Transport", "🚌"),
    ALIMENTATION("Alimentation", "🍱"),
    LOISIRS("Loisirs", "🎾"),
    LOGEMENT("Logement", "🏠")
}
