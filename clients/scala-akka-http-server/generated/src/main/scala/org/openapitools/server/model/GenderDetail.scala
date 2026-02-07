package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param pokemonSpeciesDetails  for example: ''null''
 * @param requiredForEvolution  for example: ''null''
*/
final case class GenderDetail (
  id: Int,
  name: String,
  pokemonSpeciesDetails: Seq[GenderDetailPokemonSpeciesDetailsInner],
  requiredForEvolution: Seq[AbilityDetailPokemonInnerPokemon]
)

