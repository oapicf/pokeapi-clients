package org.openapitools.server.model


/**
 * @param version The game version this encounter happens in. for example: ''null''
 * @param maxChance The total percentage of all encounter potential. for example: ''null''
 * @param encounterDetails A list of encounters and their specifics. for example: ''null''
*/
final case class LocationAreaPokemonEncounterVersion (
  version: VersionSummary,
  maxChance: Int,
  encounterDetails: Seq[LocationAreaEncounterDetail]
)

