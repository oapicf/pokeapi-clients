package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AbilityChange.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AbilityChange(
  versionGroup: VersionGroupSummary,
  effectEntries: List[AbilityChangeEffectText]
)

object AbilityChange {
  implicit lazy val abilityChangeJsonFormat: Format[AbilityChange] = Json.format[AbilityChange]
}

