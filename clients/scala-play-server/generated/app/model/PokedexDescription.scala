package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokedexDescription.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PokedexDescription(
  description: Option[String],
  language: LanguageSummary
)

object PokedexDescription {
  implicit lazy val pokedexDescriptionJsonFormat: Format[PokedexDescription] = Json.format[PokedexDescription]
}

