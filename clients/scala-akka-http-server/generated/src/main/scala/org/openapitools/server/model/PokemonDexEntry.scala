package org.openapitools.server.model


/**
 * @param entryNumber  for example: ''null''
 * @param pokedex  for example: ''null''
*/
final case class PokemonDexEntry (
  entryNumber: Int,
  pokedex: PokedexSummary
)

