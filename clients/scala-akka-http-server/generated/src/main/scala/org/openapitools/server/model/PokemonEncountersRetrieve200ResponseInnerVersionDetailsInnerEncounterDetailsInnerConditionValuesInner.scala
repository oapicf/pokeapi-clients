package org.openapitools.server.model

import java.net.URI

/**
 * @param name  for example: ''story-progress-beat-red''
 * @param url  for example: ''https://pokeapi.co/api/v2/encounter-condition-value/55/''
*/
final case class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner (
  name: String,
  url: URI
)

