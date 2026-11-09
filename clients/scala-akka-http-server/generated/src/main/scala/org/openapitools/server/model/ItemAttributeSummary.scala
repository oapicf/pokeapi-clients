package org.openapitools.server.model

import java.net.URI

/**
 * @param name The name of the referenced resource. for example: ''null''
 * @param url The URL of the referenced resource. for example: ''null''
*/
final case class ItemAttributeSummary (
  name: String,
  url: URI
)

