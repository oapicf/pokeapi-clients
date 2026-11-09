package org.openapitools.server.api.model

import org.openapitools.server.api.model.PokedexDescription
import org.openapitools.server.api.model.PokedexName
import org.openapitools.server.api.model.PokemonDexNumber
import org.openapitools.server.api.model.RegionSummary
import org.openapitools.server.api.model.VersionGroupSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokedexDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** The description of this resource listed in different languages. */
    val descriptions: kotlin.collections.List<PokedexDescription>,
    /** The name of this resource listed in different languages. */
    val names: kotlin.collections.List<PokedexName>,
    /** A list of Pokémon catalogued in this Pokédex and their indexes. */
    val pokemonEntries: kotlin.collections.List<PokemonDexNumber>,
    /** The region this Pokédex catalogues Pokémon for. */
    val region: RegionSummary,
    /** A list of version groups this Pokédex is relevant to. */
    val versionGroups: kotlin.collections.List<VersionGroupSummary>,
    /** Whether or not this Pokédex originated in the main series of the video games. */
    val isMainSeries: kotlin.Boolean? = null
)
