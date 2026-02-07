package org.openapitools.server.model

import java.net.URI

/**
 * @param name The name of the berry for example: ''null''
 * @param url The URL to get more information about the berry for example: ''null''
*/
final case class BerryFlavorDetailBerriesInnerBerry (
  name: Option[String] = None,
  url: Option[URI] = None
)

