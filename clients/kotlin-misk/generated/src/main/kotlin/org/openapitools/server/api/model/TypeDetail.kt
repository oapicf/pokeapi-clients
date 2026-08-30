package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityName
import org.openapitools.server.api.model.GenerationSummary
import org.openapitools.server.api.model.MoveDamageClassSummary
import org.openapitools.server.api.model.MoveSummary
import org.openapitools.server.api.model.TypeDetailDamageRelations
import org.openapitools.server.api.model.TypeDetailPastDamageRelationsInner
import org.openapitools.server.api.model.TypeDetailPokemonInner
import org.openapitools.server.api.model.TypeDetailSpritesValueValue
import org.openapitools.server.api.model.TypeGameIndex
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TypeDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val damageRelations: TypeDetailDamageRelations,
    val pastDamageRelations: kotlin.collections.List<TypeDetailPastDamageRelationsInner>,
    val gameIndices: kotlin.collections.List<TypeGameIndex>,
    val generation: GenerationSummary,
    val moveDamageClass: MoveDamageClassSummary,
    val names: kotlin.collections.List<AbilityName>,
    val pokemon: kotlin.collections.List<TypeDetailPokemonInner>,
    val moves: kotlin.collections.List<MoveSummary>,
    val sprites: kotlin.collections.Map<kotlin.String, kotlin.collections.Map<kotlin.String, TypeDetailSpritesValueValue>>
)
