package org.openapitools.server.model


/**
 * @param slot The order the Pokémon's types are listed in. for example: ''null''
 * @param `type` The type the referenced Form has. for example: ''null''
*/
final case class PokemonFormType (
  slot: Int,
  `type`: TypeSummary
)

