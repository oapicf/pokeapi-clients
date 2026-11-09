package org.openapitools.server.model


/**
 * @param abilities The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty. for example: ''null''
 * @param generation The last generation in which the referenced pokémon had the listed abilities. for example: ''null''
*/
final case class PokemonPastAbility (
  abilities: Seq[PokemonAbilityPast],
  generation: GenerationSummary
)

