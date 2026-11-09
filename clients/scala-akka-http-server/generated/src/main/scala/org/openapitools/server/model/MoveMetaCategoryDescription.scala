package org.openapitools.server.model


/**
 * @param description The localized description for an API resource in a specific language. for example: ''null''
 * @param language The language this name is in. for example: ''null''
*/
final case class MoveMetaCategoryDescription (
  description: Option[String] = None,
  language: LanguageSummary
)

