package org.openapitools.server.model


/**
 * @param rate The chance of an encounter to occur. for example: ''null''
 * @param version The version of the game in which the encounter can occur with the given chance. for example: ''null''
*/
final case class LocationAreaEncounterVersionDetail (
  rate: Int,
  version: VersionSummary
)

