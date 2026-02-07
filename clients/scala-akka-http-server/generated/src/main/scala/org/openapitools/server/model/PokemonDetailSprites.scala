package org.openapitools.server.model

import java.net.URI

/**
 * @param frontDefault  for example: ''null''
*/
final case class PokemonDetailSprites (
  frontDefault: Option[URI] = None
)

