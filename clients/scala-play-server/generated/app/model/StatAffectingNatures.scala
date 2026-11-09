package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for StatAffectingNatures.
  * @param increase A list of natures and how they change the referenced stat.
  * @param decrease A list of nature sand how they change the referenced stat.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class StatAffectingNatures(
  increase: List[NatureSummary],
  decrease: List[NatureSummary]
)

object StatAffectingNatures {
  implicit lazy val statAffectingNaturesJsonFormat: Format[StatAffectingNatures] = Json.format[StatAffectingNatures]
}

