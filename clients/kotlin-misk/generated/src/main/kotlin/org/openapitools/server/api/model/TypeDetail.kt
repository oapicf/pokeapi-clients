package org.openapitools.server.api.model

import org.openapitools.server.api.model.GenerationSummary
import org.openapitools.server.api.model.MoveDamageClassSummary
import org.openapitools.server.api.model.MoveSummary
import org.openapitools.server.api.model.TypeGameIndex
import org.openapitools.server.api.model.TypeGameSprite
import org.openapitools.server.api.model.TypeName
import org.openapitools.server.api.model.TypePastRelationships
import org.openapitools.server.api.model.TypePokemon
import org.openapitools.server.api.model.TypeRelationships
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TypeDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** A detail of how effective this type is toward others and vice versa. */
    val damageRelations: TypeRelationships,
    /** A list of details of how effective this type was toward others and vice versa in previous generations */
    val pastDamageRelations: kotlin.collections.List<TypePastRelationships>,
    /** A list of game indices relevent to this item by generation. */
    val gameIndices: kotlin.collections.List<TypeGameIndex>,
    /** The generation this type was introduced in. */
    val generation: GenerationSummary,
    /** The class of damage inflicted by this type. */
    val moveDamageClass: MoveDamageClassSummary,
    /** The name of this resource listed in different languages. */
    val names: kotlin.collections.List<TypeName>,
    /** A list of details of Pokémon that have this type. */
    val pokemon: kotlin.collections.List<TypePokemon>,
    /** A list of moves that have this type. */
    val moves: kotlin.collections.List<MoveSummary>,
    /** Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null. */
    val sprites: kotlin.collections.Map<kotlin.String, kotlin.collections.Map<kotlin.String, TypeGameSprite>>
)
