package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BerryFirmnessSummary;
import org.openapitools.model.BerryFlavorMap;
import org.openapitools.model.ItemSummary;
import org.openapitools.model.TypeSummary;

@Canonical
class BerryDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked. */
    Integer growthTime
    /* The maximum number of these berries that can grow on one tree in Generation IV. */
    Integer maxHarvest
    /* The power of the move \"Natural Gift\" when used with this Berry. */
    Integer naturalGiftPower
    /* The size of this Berry, in millimeters. */
    Integer size
    /* The smoothness of this Berry, used in making Pokéblocks or Poffins. */
    Integer smoothness
    /* The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly. */
    Integer soilDryness
    /* The firmness of this berry, used in making Pokéblocks or Poffins. */
    BerryFirmnessSummary firmness
    /* A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry. */
    List<BerryFlavorMap> flavors = new ArrayList<>()
    /* Berries are actually items. This is a reference to the item specific data for this berry. */
    ItemSummary item
    /* The type inherited by \"Natural Gift\" when used with this Berry. */
    TypeSummary naturalGiftType
}
