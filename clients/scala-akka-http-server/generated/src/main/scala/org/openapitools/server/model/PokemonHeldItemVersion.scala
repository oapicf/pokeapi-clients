package org.openapitools.server.model


/**
 * @param rarity How often the item is held. for example: ''null''
 * @param version The version in which the item is held. for example: ''null''
*/
final case class PokemonHeldItemVersion (
  rarity: Int,
  version: VersionSummary
)

