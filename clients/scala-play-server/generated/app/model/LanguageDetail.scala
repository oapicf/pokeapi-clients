package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LanguageDetail.
  * @param id The identifier for this resource.
  * @param name The name for this resource.
  * @param official Whether or not the games are published in this language.
  * @param iso639 The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code.
  * @param iso3166 The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code.
  * @param names The name of this resource listed in different languages.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class LanguageDetail(
  id: Int,
  name: String,
  official: Option[Boolean],
  iso639: String,
  iso3166: String,
  names: List[LanguageName]
)

object LanguageDetail {
  implicit lazy val languageDetailJsonFormat: Format[LanguageDetail] = Json.format[LanguageDetail]
}

