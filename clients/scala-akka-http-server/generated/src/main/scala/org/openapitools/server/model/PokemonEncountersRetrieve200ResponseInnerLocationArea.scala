package org.openapitools.server.model

import java.net.URI

/**
 * @param name  for example: ''cerulean-city-area''
 * @param url  for example: ''https://pokeapi.co/api/v2/location-area/281/''
*/
final case class PokemonEncountersRetrieve200ResponseInnerLocationArea (
  name: String,
  url: URI
)

