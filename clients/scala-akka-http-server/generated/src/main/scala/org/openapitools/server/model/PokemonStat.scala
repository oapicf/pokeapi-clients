package org.openapitools.server.model


/**
 * @param baseStat  for example: ''null''
 * @param effort  for example: ''null''
 * @param stat  for example: ''null''
*/
final case class PokemonStat (
  baseStat: Int,
  effort: Int,
  stat: StatSummary
)

