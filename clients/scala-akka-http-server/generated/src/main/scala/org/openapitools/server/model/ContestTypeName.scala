package org.openapitools.server.model


/**
 * @param name The name for this contest. for example: ''null''
 * @param color The color associated with this contest's name. for example: ''null''
 * @param language The language that this name is in. for example: ''null''
*/
final case class ContestTypeName (
  name: String,
  color: String,
  language: LanguageSummary
)

