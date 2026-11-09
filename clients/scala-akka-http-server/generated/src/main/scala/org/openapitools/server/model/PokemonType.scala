package org.openapitools.server.model


/**
 * @param slot The order the Pokémon's types are listed in. for example: ''null''
 * @param `type` The type the referenced Pokémon has. for example: ''null''
*/
final case class PokemonType (
  slot: Int,
  `type`: TypeSummary
)

