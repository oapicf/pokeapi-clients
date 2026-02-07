package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param official  for example: ''null''
 * @param iso639  for example: ''null''
 * @param iso3166  for example: ''null''
 * @param names  for example: ''null''
*/
final case class LanguageDetail (
  id: Int,
  name: String,
  official: Option[Boolean] = None,
  iso639: String,
  iso3166: String,
  names: Seq[LanguageName]
)

