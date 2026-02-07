package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for EncounterMethodSummary.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class EncounterMethodSummary(
  name: String,
  url: URI
)

object EncounterMethodSummary {
  implicit lazy val encounterMethodSummaryJsonFormat: Format[EncounterMethodSummary] = Json.format[EncounterMethodSummary]
}

