package org.openapitools.server.model

import java.net.URI

/**
 * @param name  for example: ''gift''
 * @param url  for example: ''https://pokeapi.co/api/v2/encounter-method/18/''
*/
final case class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod (
  name: String,
  url: URI
)

