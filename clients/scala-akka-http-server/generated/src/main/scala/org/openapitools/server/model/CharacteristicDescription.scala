package org.openapitools.server.model


/**
 * @param description  for example: ''null''
 * @param language  for example: ''null''
*/
final case class CharacteristicDescription (
  description: Option[String] = None,
  language: LanguageSummary
)

