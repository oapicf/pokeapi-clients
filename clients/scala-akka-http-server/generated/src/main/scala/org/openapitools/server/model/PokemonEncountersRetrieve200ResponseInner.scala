package org.openapitools.server.model


/**
 * @param locationArea  for example: ''null''
 * @param versionDetails  for example: ''null''
*/
final case class PokemonEncountersRetrieve200ResponseInner (
  locationArea: PokemonEncountersRetrieve200ResponseInnerLocationArea,
  versionDetails: Seq[PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner]
)

