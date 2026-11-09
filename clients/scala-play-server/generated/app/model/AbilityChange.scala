package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AbilityChange.
  * @param versionGroup The version group in which the previous effect of this ability originated.
  * @param effectEntries The previous effect of this ability listed in different languages.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AbilityChange(
  versionGroup: VersionGroupSummary,
  effectEntries: List[AbilityChangeEffectText]
)

object AbilityChange {
  implicit lazy val abilityChangeJsonFormat: Format[AbilityChange] = Json.format[AbilityChange]
}

