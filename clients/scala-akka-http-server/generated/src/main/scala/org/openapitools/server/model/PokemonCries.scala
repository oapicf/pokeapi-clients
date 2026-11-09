package org.openapitools.server.model


/**
 * @param latest The latest depiction of this Pokémon's cry. for example: ''null''
 * @param legacy The legacy depiction of this Pokémon's cry. for example: ''null''
*/
final case class PokemonCries (
  latest: String,
  legacy: String
)

