# EcoBudget --- Kotlin Multiplatform

Projet EcoBudget migré vers Kotlin Multiplatform (KMP) et Compose
Multiplatform.

## Architecture

-   `shared/commonMain` : modèles, repository de test, logique métier,
    état réactif, ressources textuelles et interface Compose.
-   `shared/iosMain` : point d'entrée iOS.
-   `androidApp` : hôte Android.
-   `iosApp` : hôte SwiftUI.

## Dépendances multiplateformes

-   Kotlin Multiplatform
-   Compose Multiplatform
-   Kotlin Coroutines
-   kotlinx-datetime

## Vérification KMP

Le code de `commonMain` ne contient plus de dépendances `java.*`,
`javax.*`, `android.*`, `androidx.lifecycle.ViewModel` ou
`androidx.compose.ui.res.stringResource`.

## Compilation Android

``` bash
./gradlew :shared:compileKotlinAndroid
./gradlew :androidApp:assembleDebug
```

Puis :

``` bash
./gradlew :androidApp:installDebug
```

La compilation doit être exécutée sur un poste disposant d'un accès
réseau permettant au wrapper Gradle de récupérer sa distribution et les
dépendances.

## Fonctionnalités à vérifier

-   tableau de bord ;
-   calcul du budget restant ;
-   calcul du total dépensé ;
-   navigation précédent/suivant ;
-   retour au mois courant ;
-   filtres par catégorie ;
-   multi-sélection des catégories ;
-   ajout, modification et suppression d'une dépense.

## Documentation

Voir `Rapport_Technique_EcoBudget_KMP.pdf` pour l'analyse détaillée des
migrations, les problèmes rencontrés, les solutions techniques, les
justifications multiplateformes et la procédure de validation.

## Git

L'historique préparé suit les étapes de migration :

1.  initialisation KMP ;
2.  module `shared` ;
3.  migration du domaine ;
4.  migration repository/ViewModel ;
5.  centralisation des textes ;
6.  suppression des dépendances Java/Android ;
7.  documentation et validation.

Avant publication, remplacer l'identité Git locale par celle de
l'étudiant et ajouter le dépôt GitHub personnel.
