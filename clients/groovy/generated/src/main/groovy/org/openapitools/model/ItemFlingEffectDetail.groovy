package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ItemFlingEffectEffectText;
import org.openapitools.model.ItemSummary;

@Canonical
class ItemFlingEffectDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* The result of this fling effect listed in different languages. */
    List<ItemFlingEffectEffectText> effectEntries = new ArrayList<>()
    /* A list of items that have this fling effect. */
    List<ItemSummary> items = new ArrayList<>()
}
