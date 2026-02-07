package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LanguageDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

