package org.openapitools.server.api.model

import org.openapitools.server.api.model.PokeathlonStatAffectingNatures
import org.openapitools.server.api.model.PokeathlonStatName
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokeathlonStatDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** A detail of natures which affect this Pokéathlon stat positively or negatively. */
    val affectingNatures: PokeathlonStatAffectingNatures,
    /** The name of this resource listed in different languages. */
    val names: kotlin.collections.List<PokeathlonStatName>
)
