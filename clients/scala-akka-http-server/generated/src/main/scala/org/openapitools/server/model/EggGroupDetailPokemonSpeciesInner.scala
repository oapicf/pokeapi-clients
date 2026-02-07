package org.openapitools.server.model

import java.net.URI

/**
 * @param name Pokemon species name. for example: ''null''
 * @param url The URL to get more information about the species for example: ''null''
*/
final case class EggGroupDetailPokemonSpeciesInner (
  name: Option[String] = None,
  url: Option[URI] = None
)

