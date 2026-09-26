package com.example

object SharedStrings {
    object string {
        const val content_desc_add_transaction=1; const val nav_prev_month=2; const val nav_next_month=3; const val current_month_badge=4
        const val budget_remaining_title=5; const val currency_fcfa=6; const val total_spent_format=7; const val budget_usage_percent_format=8
        const val filter_all=9; const val all_categories_summary=10; const val multiple_categories_selected_format=11; const val expense_count_month_format=12
        const val transactions_detail_title_format=13; const val content_desc_selected=14; const val empty_expenses_month_format=15; const val empty_expenses_filtered_format=16
        const val empty_expenses_hint=17; const val content_desc_edit=18; const val content_desc_delete_format=19; const val date_today=20; const val date_yesterday=21
        const val dialog_title_new=22; const val dialog_title_edit=23; const val label_transaction_title=24; const val placeholder_transaction_title=25
        const val label_transaction_amount=26; const val placeholder_transaction_amount=27; const val label_category=28; const val btn_save=29; const val btn_add=30; const val btn_cancel=31
        const val category_transport=32; const val category_alimentation=33; const val category_loisirs=34; const val category_logement=35; const val app_name=36; const val app_subtitle=37
    }
}
fun stringResource(id: Int, vararg args: Any): String {
    val t=when(id){
        SharedStrings.string.content_desc_add_transaction->"Ajouter une dépense"; SharedStrings.string.nav_prev_month->"Mois précédent"; SharedStrings.string.nav_next_month->"Mois suivant"; SharedStrings.string.current_month_badge->"En cours"
        SharedStrings.string.budget_remaining_title->"BUDGET RESTANT DISPONIBLE"; SharedStrings.string.currency_fcfa->"FCFA"; SharedStrings.string.total_spent_format->"Total dépensé : %s FCFA"; SharedStrings.string.budget_usage_percent_format->"%d%% consommé"
        SharedStrings.string.filter_all->"Tous"; SharedStrings.string.all_categories_summary->"✨ Toutes les catégories"; SharedStrings.string.multiple_categories_selected_format->"%s %d catégories sélectionnées"; SharedStrings.string.expense_count_month_format->"%d dépense(s) en %s"
        SharedStrings.string.transactions_detail_title_format->"Détail des dépenses (%s)"; SharedStrings.string.content_desc_selected->"Sélectionné"; SharedStrings.string.empty_expenses_month_format->"Aucune dépense en %s"
        SharedStrings.string.empty_expenses_filtered_format->"Aucune dépense dans les catégories sélectionnées pour %s"; SharedStrings.string.empty_expenses_hint->"Cliquez sur '+' pour ajouter une dépense pour ce mois"
        SharedStrings.string.content_desc_edit->"Modifier"; SharedStrings.string.content_desc_delete_format->"Supprimer la transaction %s"; SharedStrings.string.date_today->"Aujourd'hui"; SharedStrings.string.date_yesterday->"Hier"
        SharedStrings.string.dialog_title_new->"Nouvelle dépense"; SharedStrings.string.dialog_title_edit->"Modifier la dépense"; SharedStrings.string.label_transaction_title->"Titre de la dépense"; SharedStrings.string.placeholder_transaction_title->"Ex: Supermarché, Métro..."
        SharedStrings.string.label_transaction_amount->"Montant (FCFA)"; SharedStrings.string.placeholder_transaction_amount->"Ex: 5000"; SharedStrings.string.label_category->"Catégorie"; SharedStrings.string.btn_save->"Enregistrer"; SharedStrings.string.btn_add->"Ajouter"; SharedStrings.string.btn_cancel->"Annuler"
        SharedStrings.string.category_transport->"Transport"; SharedStrings.string.category_alimentation->"Alimentation"; SharedStrings.string.category_loisirs->"Loisirs"; SharedStrings.string.category_logement->"Logement"; SharedStrings.string.app_name->"EcoBudget"; SharedStrings.string.app_subtitle->"GESTION BUDGÉTAIRE"; else->""
    }
    return args.fold(t){acc,a->acc.replaceFirst(Regex("%[sd]"),a.toString())}
}
