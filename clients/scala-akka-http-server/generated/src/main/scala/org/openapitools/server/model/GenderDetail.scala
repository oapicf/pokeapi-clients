package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param pokemonSpeciesDetails A list of Pokémon species that can be this gender and how likely it is that they will be. for example: ''null''
 * @param requiredForEvolution A list of Pokémon species that required this gender in order for a Pokémon to evolve into them. for example: ''null''
*/
final case class GenderDetail (
  id: Int,
  name: String,
  pokemonSpeciesDetails: Seq[GenderPokemonSpecies],
  requiredForEvolution: Seq[PokemonSpeciesSummary]
)

