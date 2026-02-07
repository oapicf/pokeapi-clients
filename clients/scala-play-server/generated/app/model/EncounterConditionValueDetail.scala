package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for EncounterConditionValueDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class EncounterConditionValueDetail(
  id: Int,
  name: String,
  condition: EncounterConditionSummary,
  names: List[EncounterConditionValueName]
)

object EncounterConditionValueDetail {
  implicit lazy val encounterConditionValueDetailJsonFormat: Format[EncounterConditionValueDetail] = Json.format[EncounterConditionValueDetail]
}

