package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param formula The formula used to calculate the rate at which the Pokémon species gains level. for example: ''null''
 * @param descriptions The descriptions of this characteristic listed in different languages. for example: ''null''
 * @param levels A list of levels and the amount of experienced needed to atain them based on this growth rate. for example: ''null''
 * @param pokemonSpecies A list of Pokémon species that gain levels at this growth rate. for example: ''null''
*/
final case class GrowthRateDetail (
  id: Int,
  name: String,
  formula: String,
  descriptions: Seq[GrowthRateDescription],
  levels: Seq[Experience],
  pokemonSpecies: Seq[PokemonSpeciesSummary]
)

