package org.openapitools.server.model


/**
 * @param generation The last generation in which the referenced pokémon had the listed stats. for example: ''null''
 * @param stats The stat the Pokémon had up to and including the listed generation. for example: ''null''
*/
final case class PokemonPastStat (
  generation: GenerationSummary,
  stats: Seq[PokemonStat]
)

