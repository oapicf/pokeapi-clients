package org.openapitools.server.model


/**
 * @param encounterMethod The method in which Pokémon may be encountered in an area.. for example: ''null''
 * @param versionDetails The chance of the encounter to occur on a version of the game. for example: ''null''
*/
final case class LocationAreaEncounterRate (
  encounterMethod: EncounterMethodSummary,
  versionDetails: Seq[LocationAreaEncounterVersionDetail]
)

