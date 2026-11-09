package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ItemCategorySummary;
import org.openapitools.model.ItemPocketName;

@Canonical
class ItemPocketDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* A list of item categories that are relevant to this item pocket. */
    List<ItemCategorySummary> categories = new ArrayList<>()
    /* The name of this resource listed in different languages. */
    List<ItemPocketName> names = new ArrayList<>()
}
