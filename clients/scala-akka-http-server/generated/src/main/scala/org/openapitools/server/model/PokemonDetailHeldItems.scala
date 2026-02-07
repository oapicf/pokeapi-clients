package org.openapitools.server.model


/**
 * @param item  for example: ''null''
 * @param versionDetails  for example: ''null''
*/
final case class PokemonDetailHeldItems (
  item: AbilityDetailPokemonInnerPokemon,
  versionDetails: Seq[ItemDetailHeldByPokemonInnerVersionDetailsInner]
)

