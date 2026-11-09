package org.openapitools.server.api.model

import org.openapitools.server.api.model.PokemonAbility
import org.openapitools.server.api.model.PokemonCries
import org.openapitools.server.api.model.PokemonFormSummary
import org.openapitools.server.api.model.PokemonGameIndex
import org.openapitools.server.api.model.PokemonHeldItemSummary
import org.openapitools.server.api.model.PokemonMove
import org.openapitools.server.api.model.PokemonPastAbility
import org.openapitools.server.api.model.PokemonPastStat
import org.openapitools.server.api.model.PokemonPastType
import org.openapitools.server.api.model.PokemonSpeciesSummary
import org.openapitools.server.api.model.PokemonSprites
import org.openapitools.server.api.model.PokemonStat
import org.openapitools.server.api.model.PokemonType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** A list of abilities this Pokémon could potentially have. */
    val abilities: kotlin.collections.List<PokemonAbility>,
    /** A list of details showing abilities this pokémon had in previous generations */
    val pastAbilities: kotlin.collections.List<PokemonPastAbility>,
    /** A list of forms this Pokémon can take on. */
    val forms: kotlin.collections.List<PokemonFormSummary>,
    /** A list of game indices relevent to Pokémon item by generation. */
    val gameIndices: kotlin.collections.List<PokemonGameIndex>,
    /** A list of items this Pokémon may be holding when encountered. */
    val heldItems: kotlin.collections.List<PokemonHeldItemSummary>,
    /** A link to a list of location areas, as well as encounter details pertaining to specific versions. */
    val locationAreaEncounters: kotlin.String,
    /** A list of moves along with learn methods and level details pertaining to specific version groups. */
    val moves: kotlin.collections.List<PokemonMove>,
    /** The species this Pokémon belongs to. */
    val species: PokemonSpeciesSummary,
    /** A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/sprites#sprites&#39;&gt;PokeAPI/sprites&lt;/a&gt; */
    val sprites: PokemonSprites,
    /** A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/cries#cries&#39;&gt;PokeAPI/cries&lt;/a&gt; */
    val cries: PokemonCries,
    /** A list of base stat values for this Pokémon. */
    val stats: kotlin.collections.List<PokemonStat>,
    /** A list of details showing stats this pokémon had in previous generations */
    val pastStats: kotlin.collections.List<PokemonPastStat>,
    /** A list of details showing types this Pokémon has. */
    val types: kotlin.collections.List<PokemonType>,
    /** A list of details showing types this pokémon had in previous generations */
    val pastTypes: kotlin.collections.List<PokemonPastType>,
    /** The base experience gained for defeating this Pokémon. */
    val baseExperience: kotlin.Int? = null,
    /** The height of this Pokémon in decimetres. */
    val height: kotlin.Int? = null,
    /** Set for exactly one Pokémon used as the default for each species. */
    val isDefault: kotlin.Boolean? = null,
    /** Order for sorting. Almost national order, except families are grouped together. */
    val order: kotlin.Int? = null,
    /** The weight of this Pokémon in hectograms. */
    val weight: kotlin.Int? = null
)
