package org.openapitools.server.api.model

import org.openapitools.server.api.model.CharacteristicDescription
import org.openapitools.server.api.model.StatSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CharacteristicDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The remainder of the highest stat/IV divided by 5. */
    val geneModulo: kotlin.Int,
    /** The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5. */
    val possibleValues: kotlin.collections.List<kotlin.Int>,
    /** The stat which results in this characteristic. */
    val highestStat: StatSummary,
    /** The descriptions of this characteristic listed in different languages. */
    val descriptions: kotlin.collections.List<CharacteristicDescription>
)
