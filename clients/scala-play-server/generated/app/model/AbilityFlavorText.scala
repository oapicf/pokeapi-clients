package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AbilityFlavorText.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AbilityFlavorText(
  flavorText: String,
  language: LanguageSummary,
  versionGroup: VersionGroupSummary
)

object AbilityFlavorText {
  implicit lazy val abilityFlavorTextJsonFormat: Format[AbilityFlavorText] = Json.format[AbilityFlavorText]
}

