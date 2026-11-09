package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param names The name of this resource listed in different languages. for example: ''null''
 * @param pokemonSpecies A list of pokemon species that result from this evolution trigger. for example: ''null''
*/
final case class EvolutionTriggerDetail (
  id: Int,
  name: String,
  names: Seq[EvolutionTriggerName],
  pokemonSpecies: Seq[PokemonSpeciesSummary]
)

