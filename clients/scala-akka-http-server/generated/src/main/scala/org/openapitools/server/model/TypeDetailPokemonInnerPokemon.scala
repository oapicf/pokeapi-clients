package org.openapitools.server.model

import java.net.URI

/**
 * @param name The name of the pokemon for example: ''null''
 * @param url The URL to get more information about the pokemon for example: ''null''
*/
final case class TypeDetailPokemonInnerPokemon (
  name: Option[String] = None,
  url: Option[URI] = None
)

