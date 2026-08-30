package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LanguageDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

