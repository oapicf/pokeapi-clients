package org.openapitools.server.model


/**
 * @param item The item the referenced Pokémon holds. for example: ''null''
 * @param versionDetails The details of the different versions in which the item is held. for example: ''null''
*/
final case class PokemonHeldItemSummary (
  item: ItemSummary,
  versionDetails: Seq[PokemonHeldItemVersion]
)

