# EcoBudget — Kotlin Multiplatform

Projet converti vers Compose Multiplatform pour Android et iOS.

- `shared/commonMain`: logique métier + UI Compose + modèles.
- `shared/iosMain`: point d'entrée iOS.
- `androidApp`: application Android minimale.
- `iosApp`: hôte SwiftUI de la vue Compose.

Les API Android/Java (`ViewModel`, `Calendar`, `SimpleDateFormat`, `NumberFormat`, `UUID`, `R.string`) ont été retirées du code partagé.

Pour iOS, l'intégration finale et l'exécution nécessitent macOS + Xcode.
