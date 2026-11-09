package org.openapitools.server.api.model

import org.openapitools.server.api.model.BerryFirmnessSummary
import org.openapitools.server.api.model.BerryFlavorMap
import org.openapitools.server.api.model.ItemSummary
import org.openapitools.server.api.model.TypeSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BerryDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** The firmness of this berry, used in making Pokéblocks or Poffins. */
    val firmness: BerryFirmnessSummary,
    /** A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry. */
    val flavors: kotlin.collections.List<BerryFlavorMap>,
    /** Berries are actually items. This is a reference to the item specific data for this berry. */
    val item: ItemSummary,
    /** The type inherited by \&quot;Natural Gift\&quot; when used with this Berry. */
    val naturalGiftType: TypeSummary,
    /** Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked. */
    val growthTime: kotlin.Int? = null,
    /** The maximum number of these berries that can grow on one tree in Generation IV. */
    val maxHarvest: kotlin.Int? = null,
    /** The power of the move \&quot;Natural Gift\&quot; when used with this Berry. */
    val naturalGiftPower: kotlin.Int? = null,
    /** The size of this Berry, in millimeters. */
    val propertySize: kotlin.Int? = null,
    /** The smoothness of this Berry, used in making Pokéblocks or Poffins. */
    val smoothness: kotlin.Int? = null,
    /** The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly. */
    val soilDryness: kotlin.Int? = null
)
