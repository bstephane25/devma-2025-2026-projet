package com.example

object R {
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
        R.string.content_desc_add_transaction->"Ajouter une dépense"; R.string.nav_prev_month->"Mois précédent"; R.string.nav_next_month->"Mois suivant"; R.string.current_month_badge->"En cours"
        R.string.budget_remaining_title->"BUDGET RESTANT DISPONIBLE"; R.string.currency_fcfa->"FCFA"; R.string.total_spent_format->"Total dépensé : %s FCFA"; R.string.budget_usage_percent_format->"%d%% consommé"
        R.string.filter_all->"Tous"; R.string.all_categories_summary->"✨ Toutes les catégories"; R.string.multiple_categories_selected_format->"%s %d catégories sélectionnées"; R.string.expense_count_month_format->"%d dépense(s) en %s"
        R.string.transactions_detail_title_format->"Détail des dépenses (%s)"; R.string.content_desc_selected->"Sélectionné"; R.string.empty_expenses_month_format->"Aucune dépense en %s"
        R.string.empty_expenses_filtered_format->"Aucune dépense dans les catégories sélectionnées pour %s"; R.string.empty_expenses_hint->"Cliquez sur '+' pour ajouter une dépense pour ce mois"
        R.string.content_desc_edit->"Modifier"; R.string.content_desc_delete_format->"Supprimer la transaction %s"; R.string.date_today->"Aujourd'hui"; R.string.date_yesterday->"Hier"
        R.string.dialog_title_new->"Nouvelle dépense"; R.string.dialog_title_edit->"Modifier la dépense"; R.string.label_transaction_title->"Titre de la dépense"; R.string.placeholder_transaction_title->"Ex: Supermarché, Métro..."
        R.string.label_transaction_amount->"Montant (FCFA)"; R.string.placeholder_transaction_amount->"Ex: 5000"; R.string.label_category->"Catégorie"; R.string.btn_save->"Enregistrer"; R.string.btn_add->"Ajouter"; R.string.btn_cancel->"Annuler"
        R.string.category_transport->"Transport"; R.string.category_alimentation->"Alimentation"; R.string.category_loisirs->"Loisirs"; R.string.category_logement->"Logement"; R.string.app_name->"EcoBudget"; R.string.app_subtitle->"GESTION BUDGÉTAIRE"; else->""
    }
    return args.fold(t){acc,a->acc.replaceFirst(Regex("%[sd]"),a.toString())}
}
