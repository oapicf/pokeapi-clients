package org.openapitools.server.model


/**
 * @param pokemon  for example: ''null''
 * @param versionDetails  for example: ''null''
*/
final case class ItemDetailHeldByPokemonInner (
  pokemon: AbilityDetailPokemonInnerPokemon,
  versionDetails: Seq[ItemDetailHeldByPokemonInnerVersionDetailsInner]
)

