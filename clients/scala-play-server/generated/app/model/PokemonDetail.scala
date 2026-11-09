package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonDetail.
  * @param id The identifier for this resource.
  * @param name The name for this resource.
  * @param baseExperience The base experience gained for defeating this Pokémon.
  * @param height The height of this Pokémon in decimetres.
  * @param isDefault Set for exactly one Pokémon used as the default for each species.
  * @param order Order for sorting. Almost national order, except families are grouped together.
  * @param weight The weight of this Pokémon in hectograms.
  * @param abilities A list of abilities this Pokémon could potentially have.
  * @param pastAbilities A list of details showing abilities this pokémon had in previous generations
  * @param forms A list of forms this Pokémon can take on.
  * @param gameIndices A list of game indices relevent to Pokémon item by generation.
  * @param heldItems A list of items this Pokémon may be holding when encountered.
  * @param locationAreaEncounters A link to a list of location areas, as well as encounter details pertaining to specific versions.
  * @param moves A list of moves along with learn methods and level details pertaining to specific version groups.
  * @param species The species this Pokémon belongs to.
  * @param sprites A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at <a href='https://github.com/PokeAPI/sprites#sprites'>PokeAPI/sprites</a>
  * @param cries A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at <a href='https://github.com/PokeAPI/cries#cries'>PokeAPI/cries</a>
  * @param stats A list of base stat values for this Pokémon.
  * @param pastStats A list of details showing stats this pokémon had in previous generations
  * @param types A list of details showing types this Pokémon has.
  * @param pastTypes A list of details showing types this pokémon had in previous generations
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonDetail(
  id: Int,
  name: String,
  baseExperience: Option[Int],
  height: Option[Int],
  isDefault: Option[Boolean],
  order: Option[Int],
  weight: Option[Int],
  abilities: List[PokemonAbility],
  pastAbilities: List[PokemonPastAbility],
  forms: List[PokemonFormSummary],
  gameIndices: List[PokemonGameIndex],
  heldItems: List[PokemonHeldItemSummary],
  locationAreaEncounters: String,
  moves: List[PokemonMove],
  species: PokemonSpeciesSummary,
  sprites: PokemonSprites,
  cries: PokemonCries,
  stats: List[PokemonStat],
  pastStats: List[PokemonPastStat],
  types: List[PokemonType],
  pastTypes: List[PokemonPastType]
)

object PokemonDetail {
  implicit lazy val pokemonDetailJsonFormat: Format[PokemonDetail] = Json.format[PokemonDetail]
}

