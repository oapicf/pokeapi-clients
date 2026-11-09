package org.openapitools.server.model


/**
 * @param chance Percent chance that this encounter will occur. for example: ''null''
 * @param conditionValues A list of condition values that must be in effect for this encounter to occur. for example: ''null''
 * @param maxLevel The highest level the Pokémon could be encountered at. for example: ''null''
 * @param method The method by which this encounter happens. for example: ''null''
 * @param minLevel The lowest level the Pokémon could be encountered at. for example: ''null''
*/
final case class PokemonEncounterDetailResponse (
  chance: Int,
  conditionValues: Seq[EncounterConditionValueSummary],
  maxLevel: Int,
  method: EncounterMethodSummary,
  minLevel: Int
)

