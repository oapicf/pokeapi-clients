package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for EncounterConditionDetail.
  * @param id The identifier for this resource.
  * @param name The name for this resource.
  * @param values A list of possible values for this encounter condition.
  * @param names The name of this resource listed in different languages.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class EncounterConditionDetail(
  id: Int,
  name: String,
  values: List[EncounterConditionValueSummary],
  names: List[EncounterConditionName]
)

object EncounterConditionDetail {
  implicit lazy val encounterConditionDetailJsonFormat: Format[EncounterConditionDetail] = Json.format[EncounterConditionDetail]
}

