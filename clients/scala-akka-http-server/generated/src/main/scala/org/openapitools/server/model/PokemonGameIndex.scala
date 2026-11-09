package org.openapitools.server.model


/**
 * @param gameIndex The internal id of an API resource within game data. for example: ''null''
 * @param version The version relevent to this game index. for example: ''null''
*/
final case class PokemonGameIndex (
  gameIndex: Int,
  version: VersionSummary
)

