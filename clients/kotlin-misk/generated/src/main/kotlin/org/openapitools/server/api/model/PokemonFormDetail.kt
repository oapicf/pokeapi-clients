package org.openapitools.server.api.model

import org.openapitools.server.api.model.PokemonDetailTypesInner
import org.openapitools.server.api.model.PokemonFormDetailFormNamesInner
import org.openapitools.server.api.model.PokemonFormDetailSprites
import org.openapitools.server.api.model.PokemonSummary
import org.openapitools.server.api.model.VersionGroupSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonFormDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val formName: kotlin.String,
    val pokemon: PokemonSummary,
    val sprites: PokemonFormDetailSprites,
    val versionGroup: VersionGroupSummary,
    val formNames: kotlin.collections.List<PokemonFormDetailFormNamesInner>,
    val names: kotlin.collections.List<PokemonFormDetailFormNamesInner>,
    val types: kotlin.collections.List<PokemonDetailTypesInner>,
    val order: kotlin.Int? = null,
    val formOrder: kotlin.Int? = null,
    val isDefault: kotlin.Boolean? = null,
    val isBattleOnly: kotlin.Boolean? = null,
    val isMega: kotlin.Boolean? = null
)
