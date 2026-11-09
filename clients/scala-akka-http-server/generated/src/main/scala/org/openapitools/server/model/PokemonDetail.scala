package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param baseExperience The base experience gained for defeating this Pokémon. for example: ''null''
 * @param height The height of this Pokémon in decimetres. for example: ''null''
 * @param isDefault Set for exactly one Pokémon used as the default for each species. for example: ''null''
 * @param order Order for sorting. Almost national order, except families are grouped together. for example: ''null''
 * @param weight The weight of this Pokémon in hectograms. for example: ''null''
 * @param abilities A list of abilities this Pokémon could potentially have. for example: ''null''
 * @param pastAbilities A list of details showing abilities this pokémon had in previous generations for example: ''null''
 * @param forms A list of forms this Pokémon can take on. for example: ''null''
 * @param gameIndices A list of game indices relevent to Pokémon item by generation. for example: ''null''
 * @param heldItems A list of items this Pokémon may be holding when encountered. for example: ''null''
 * @param locationAreaEncounters A link to a list of location areas, as well as encounter details pertaining to specific versions. for example: ''null''
 * @param moves A list of moves along with learn methods and level details pertaining to specific version groups. for example: ''null''
 * @param species The species this Pokémon belongs to. for example: ''null''
 * @param sprites A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at <a href='https://github.com/PokeAPI/sprites#sprites'>PokeAPI/sprites</a> for example: ''null''
 * @param cries A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at <a href='https://github.com/PokeAPI/cries#cries'>PokeAPI/cries</a> for example: ''null''
 * @param stats A list of base stat values for this Pokémon. for example: ''null''
 * @param pastStats A list of details showing stats this pokémon had in previous generations for example: ''null''
 * @param types A list of details showing types this Pokémon has. for example: ''null''
 * @param pastTypes A list of details showing types this pokémon had in previous generations for example: ''null''
*/
final case class PokemonDetail (
  id: Int,
  name: String,
  baseExperience: Option[Int] = None,
  height: Option[Int] = None,
  isDefault: Option[Boolean] = None,
  order: Option[Int] = None,
  weight: Option[Int] = None,
  abilities: Seq[PokemonAbility],
  pastAbilities: Seq[PokemonPastAbility],
  forms: Seq[PokemonFormSummary],
  gameIndices: Seq[PokemonGameIndex],
  heldItems: Seq[PokemonHeldItemSummary],
  locationAreaEncounters: String,
  moves: Seq[PokemonMove],
  species: PokemonSpeciesSummary,
  sprites: PokemonSprites,
  cries: PokemonCries,
  stats: Seq[PokemonStat],
  pastStats: Seq[PokemonPastStat],
  types: Seq[PokemonType],
  pastTypes: Seq[PokemonPastType]
)

