package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for EncounterConditionValueSummary.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class EncounterConditionValueSummary(
  name: String,
  url: URI
)

object EncounterConditionValueSummary {
  implicit lazy val encounterConditionValueSummaryJsonFormat: Format[EncounterConditionValueSummary] = Json.format[EncounterConditionValueSummary]
}

