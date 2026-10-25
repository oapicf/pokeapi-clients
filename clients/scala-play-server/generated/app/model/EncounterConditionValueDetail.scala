package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for EncounterConditionValueDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-25T05:53:17.467323765Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class EncounterConditionValueDetail(
  id: Int,
  name: String,
  condition: EncounterConditionSummary,
  names: List[EncounterConditionValueName]
)

object EncounterConditionValueDetail {
  implicit lazy val encounterConditionValueDetailJsonFormat: Format[EncounterConditionValueDetail] = Json.format[EncounterConditionValueDetail]
}

