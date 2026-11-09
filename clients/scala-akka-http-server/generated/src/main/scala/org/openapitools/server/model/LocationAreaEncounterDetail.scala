package org.openapitools.server.model


/**
 * @param minLevel The lowest level the Pokémon could be encountered at. for example: ''null''
 * @param maxLevel The highest level the Pokémon could be encountered at. for example: ''null''
 * @param chance Percent chance that this encounter will occur. for example: ''null''
 * @param method The method by which this encounter happens. for example: ''null''
 * @param conditionValues A list of condition values that must be in effect for this encounter to occur. for example: ''null''
 * @param pokemonDetails Additional properties of the encountered Pokémon, or null if unspecified. for example: ''null''
*/
final case class LocationAreaEncounterDetail (
  minLevel: Int,
  maxLevel: Int,
  chance: Option[Int] = None,
  method: Option[EncounterMethodSummary] = None,
  conditionValues: Seq[EncounterConditionValueSummary],
  pokemonDetails: EncounterPokemonDetail
)

