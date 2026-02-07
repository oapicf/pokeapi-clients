package org.openapitools.server.model

import java.net.URI

/**
 * @param latest  for example: ''null''
 * @param legacy  for example: ''null''
*/
final case class PokemonDetailCries (
  latest: URI,
  legacy: URI
)

