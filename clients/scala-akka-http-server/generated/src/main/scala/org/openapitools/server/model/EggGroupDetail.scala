package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param names The name of this resource listed in different languages. for example: ''null''
 * @param pokemonSpecies A list of all Pokémon species that are members of this egg group. for example: ''null''
*/
final case class EggGroupDetail (
  id: Int,
  name: String,
  names: Seq[EggGroupName],
  pokemonSpecies: Seq[PokemonSpeciesSummary]
)

