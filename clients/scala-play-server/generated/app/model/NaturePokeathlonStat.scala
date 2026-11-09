package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for NaturePokeathlonStat.
  * @param maxChange The amount of change.
  * @param pokeathlonStat The stat being affected.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class NaturePokeathlonStat(
  maxChange: Int,
  pokeathlonStat: PokeathlonStatSummary
)

object NaturePokeathlonStat {
  implicit lazy val naturePokeathlonStatJsonFormat: Format[NaturePokeathlonStat] = Json.format[NaturePokeathlonStat]
}

