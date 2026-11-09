package org.openapitools.server.api.model

import org.openapitools.server.api.model.LanguageSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonSpeciesGenus(
    /** The localized genus for the referenced Pokémon species */
    val genus: kotlin.String,
    /** The language this genus is in. */
    val language: LanguageSummary
)
