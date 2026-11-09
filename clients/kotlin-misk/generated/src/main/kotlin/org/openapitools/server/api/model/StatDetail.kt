package org.openapitools.server.api.model

import org.openapitools.server.api.model.CharacteristicSummary
import org.openapitools.server.api.model.ItemSummary
import org.openapitools.server.api.model.MoveDamageClassSummary
import org.openapitools.server.api.model.StatAffectingMoves
import org.openapitools.server.api.model.StatAffectingNatures
import org.openapitools.server.api.model.StatName
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class StatDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** ID the games use for this stat. */
    val gameIndex: kotlin.Int,
    /** A detail of moves which affect this stat positively or negatively. */
    val affectingMoves: StatAffectingMoves,
    /** A detail of natures which affect this stat positively or negatively. */
    val affectingNatures: StatAffectingNatures,
    /** Items that affect this stat, such as vitamins and battle items. */
    val affectingItems: kotlin.collections.List<ItemSummary>,
    /** A list of characteristics that are set on a Pokémon when its highest base stat is this stat. */
    val characteristics: kotlin.collections.List<CharacteristicSummary>,
    /** The class of damage this stat is directly related to. */
    val moveDamageClass: MoveDamageClassSummary,
    /** The name of this resource listed in different languages. */
    val names: kotlin.collections.List<StatName>,
    /** Whether this stat only exists within a battle. */
    val isBattleOnly: kotlin.Boolean? = null
)
