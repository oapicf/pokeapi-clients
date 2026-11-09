package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param official Whether or not the games are published in this language. for example: ''null''
 * @param iso639 The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code. for example: ''null''
 * @param iso3166 The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code. for example: ''null''
 * @param names The name of this resource listed in different languages. for example: ''null''
*/
final case class LanguageDetail (
  id: Int,
  name: String,
  official: Option[Boolean] = None,
  iso639: String,
  iso3166: String,
  names: Seq[LanguageName]
)

