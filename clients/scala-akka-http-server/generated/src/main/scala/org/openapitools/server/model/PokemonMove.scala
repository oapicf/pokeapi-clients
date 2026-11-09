package org.openapitools.server.model


/**
 * @param move The move the Pokémon can learn. for example: ''null''
 * @param versionGroupDetails The details of the version in which the Pokémon can learn the move. for example: ''null''
*/
final case class PokemonMove (
  move: MoveSummary,
  versionGroupDetails: Seq[PokemonMoveVersionGroup]
)

