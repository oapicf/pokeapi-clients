package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for EncounterConditionValueDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class EncounterConditionValueDetail(
  id: Int,
  name: String,
  condition: EncounterConditionSummary,
  names: List[EncounterConditionValueName]
)

object EncounterConditionValueDetail {
  implicit lazy val encounterConditionValueDetailJsonFormat: Format[EncounterConditionValueDetail] = Json.format[EncounterConditionValueDetail]
}

