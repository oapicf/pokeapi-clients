package org.openapitools.server.model


/**
 * @param pokemon The Pokémon that holds this item. for example: ''null''
 * @param versionDetails The details for the version that this item is held in by the Pokémon. for example: ''null''
*/
final case class PokemonHeldItem (
  pokemon: PokemonSummary,
  versionDetails: Seq[PokemonHeldItemVersion]
)

