package org.openapitools.server.model


/**
 * @param isDefault Whether this variety is the default variety. for example: ''null''
 * @param pokemon The Pokémon variety. for example: ''null''
*/
final case class PokemonSpeciesVariety (
  isDefault: Boolean,
  pokemon: PokemonSummary
)

