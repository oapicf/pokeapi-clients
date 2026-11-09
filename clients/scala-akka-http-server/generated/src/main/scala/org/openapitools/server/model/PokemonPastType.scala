package org.openapitools.server.model


/**
 * @param generation The last generation in which the referenced pokémon had the listed types. for example: ''null''
 * @param types The types the referenced pokémon had up to and including the listed generation. for example: ''null''
*/
final case class PokemonPastType (
  generation: GenerationSummary,
  types: Seq[PokemonType]
)

