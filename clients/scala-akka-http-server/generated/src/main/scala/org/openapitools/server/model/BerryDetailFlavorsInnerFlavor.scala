package org.openapitools.server.model

import java.net.URI

/**
 * @param name The name of the flavor for example: ''null''
 * @param url The URL to get more information about the flavor for example: ''null''
*/
final case class BerryDetailFlavorsInnerFlavor (
  name: Option[String] = None,
  url: Option[URI] = None
)

