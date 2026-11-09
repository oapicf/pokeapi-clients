package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ItemAttributeDescription;
import org.openapitools.model.ItemAttributeName;
import org.openapitools.model.ItemSummary;

@Canonical
class ItemAttributeDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* The description of this item attribute listed in different languages. */
    List<ItemAttributeDescription> descriptions = new ArrayList<>()
    /* A list of items that have this attribute. */
    List<ItemSummary> items = new ArrayList<>()
    /* The name of this item attribute listed in different languages. */
    List<ItemAttributeName> names = new ArrayList<>()
}
