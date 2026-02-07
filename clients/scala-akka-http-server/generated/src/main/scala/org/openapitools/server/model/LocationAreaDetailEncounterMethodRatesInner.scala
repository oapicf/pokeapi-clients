package org.openapitools.server.model


/**
 * @param encounterMethod  for example: ''null''
 * @param versionDetails  for example: ''null''
*/
final case class LocationAreaDetailEncounterMethodRatesInner (
  encounterMethod: AbilityDetailPokemonInnerPokemon,
  versionDetails: Seq[LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner]
)

