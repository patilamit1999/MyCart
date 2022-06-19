package amit.mycart.common

import amit.mycart.model.Category

/**
 * Shows List of available categories in MyCart
 */
class ShowCategoriesActivity {

    fun show(categoryList: List<Category>) {
        print(
            """
                ------------------------------------------------------------
                ID      CATEGORY
                ------------------------------------------------------------
            
        """.trimIndent()
        )

        if (categoryList.isEmpty()) {
            print("\n ++ EMPTY ++")
        }

        categoryList.forEach { category ->
            println("${category.id}\t\t${category.name}")
        }

        println("------------------------------------------------------------")
    }
}