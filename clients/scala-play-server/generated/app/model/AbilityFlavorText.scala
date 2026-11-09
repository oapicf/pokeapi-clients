package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AbilityFlavorText.
  * @param flavorText The localized name for an API resource in a specific language.
  * @param language The language this text resource is in.
  * @param versionGroup The version group that uses this flavor text.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AbilityFlavorText(
  flavorText: String,
  language: LanguageSummary,
  versionGroup: VersionGroupSummary
)

object AbilityFlavorText {
  implicit lazy val abilityFlavorTextJsonFormat: Format[AbilityFlavorText] = Json.format[AbilityFlavorText]
}

