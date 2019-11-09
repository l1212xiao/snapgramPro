package eu.sollers.odata.snapgram.domain.argsrepo;

import org.apache.olingo.commons.api.edm.FullQualifiedName;

public class ArgsGenerator {

    // Service Namespace
    public static final String NAMESPACE = "OData.Demo";

    // EDM Container
    public static final String CONTAINER_NAME = "Container";
    public static final FullQualifiedName CONTAINER = new FullQualifiedName(NAMESPACE, CONTAINER_NAME);

    // Entity Types Names
    public static final String ET_PRODUCT_NAME = "Product";
    public static final FullQualifiedName ET_PRODUCT_FQN = new FullQualifiedName(NAMESPACE, ET_PRODUCT_NAME);

    public static final String ET_CATEGORY_NAME = "Category";
    public static final FullQualifiedName ET_CATEGORY_FQN = new FullQualifiedName(NAMESPACE, ET_CATEGORY_NAME);

    public static final String ET_ADVERTISEMENT_NAME = "Advertisement";
    public static final FullQualifiedName ET_ADVERTISEMENT_FQN = new FullQualifiedName(NAMESPACE, ET_ADVERTISEMENT_NAME);

    // Entity Set Names
    public static final String ES_PRODUCTS_NAME = "Products";
    public static final String ES_CATEGORIES_NAME = "Categories";
    public static final String ES_ADVERTISEMENTS_NAME = "Advertisements";
    public static final String NAV_TO_CATEGORY = "Category";
    public static final String NAV_TO_PRODUCTS = "Products";

    //Action
    public static final String ACTION_RESET = "Reset";
    public static final FullQualifiedName ACTION_RESET_FQN = new FullQualifiedName(NAMESPACE, ACTION_RESET);

    // Function
    public static final String FUNCTION_COUNT_CATEGORIES = "CountCategories";
    public static final FullQualifiedName FUNCTION_COUNT_CATEGORIES_FQN
            = new FullQualifiedName(NAMESPACE, FUNCTION_COUNT_CATEGORIES);

    // Function/Action Parameters
    public static final String PARAMETER_AMOUNT = "Amount";
}
