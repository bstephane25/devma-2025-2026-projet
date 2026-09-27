# EcoBudget --- Kotlin Multiplatform

Projet EcoBudget migré vers Kotlin Multiplatform (KMP) et Compose
Multiplatform.

## Architecture

-   `shared/commonMain` : modèles, repository de test, logique métier,
    état réactif, ressources textuelles et interface Compose.
-   `shared/iosMain` : point d'entrée iOS.
-   `androidApp` : hôte Android.
-   `iosApp` : hôte SwiftUI.


## Les API Android/Java (`ViewModel`, `Calendar`, `SimpleDateFormat`, `NumberFormat`, `UUID`, `R.string`) ont été retirées du code partagé.

## Dépendances multiplateformes

-   Kotlin Multiplatform
-   Compose Multiplatform
-   Kotlin Coroutines
-   kotlinx-datetime

## Vérification KMP

Le code de `commonMain` ne contient plus de dépendances `java.*`,
`javax.*`, `android.*`, `androidx.lifecycle.ViewModel` ou
`androidx.compose.ui.res.stringResource`.



## Pour la paartie IOS

Pour iOS, l'intégration finale et l'exécution nécessitent macOS + Xcode.
