package org.openapitools.server.model

import java.net.URI

/**
 * @param name  for example: ''red''
 * @param url  for example: ''https://pokeapi.co/api/v2/version/1/''
*/
final case class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion (
  name: String,
  url: URI
)

