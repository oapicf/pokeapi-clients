package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ItemCategoryName;
import org.openapitools.model.ItemPocketSummary;
import org.openapitools.model.ItemSummary;

@Canonical
class ItemCategoryDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* A list of items that are a part of this category. */
    List<ItemSummary> items = new ArrayList<>()
    /* The name of this item category listed in different languages. */
    List<ItemCategoryName> names = new ArrayList<>()
    /* The pocket items in this category would be put in. */
    ItemPocketSummary pocket
}
