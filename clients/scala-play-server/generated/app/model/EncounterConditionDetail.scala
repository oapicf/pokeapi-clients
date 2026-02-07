package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for EncounterConditionDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class EncounterConditionDetail(
  id: Int,
  name: String,
  values: List[EncounterConditionValueSummary],
  names: List[EncounterConditionName]
)

object EncounterConditionDetail {
  implicit lazy val encounterConditionDetailJsonFormat: Format[EncounterConditionDetail] = Json.format[EncounterConditionDetail]
}

