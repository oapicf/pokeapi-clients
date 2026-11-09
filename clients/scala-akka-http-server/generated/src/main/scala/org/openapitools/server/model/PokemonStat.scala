package org.openapitools.server.model


/**
 * @param baseStat The base value of the stat. for example: ''null''
 * @param effort The effort points (EV) the Pokémon has in the stat. for example: ''null''
 * @param stat The stat the Pokémon has. for example: ''null''
*/
final case class PokemonStat (
  baseStat: Int,
  effort: Int,
  stat: StatSummary
)

