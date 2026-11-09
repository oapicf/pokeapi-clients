package org.openapitools.server.api.model

import org.openapitools.server.api.model.PalParkAreaName
import org.openapitools.server.api.model.PalParkEncounter
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PalParkAreaDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** The name of this resource listed in different languages. */
    val names: kotlin.collections.List<PalParkAreaName>,
    /** A list of Pokémon encountered in thi pal park area along with details. */
    val pokemonEncounters: kotlin.collections.List<PalParkEncounter>
)
