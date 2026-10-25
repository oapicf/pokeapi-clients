package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for EvolutionChainSummary.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-25T05:53:17.467323765Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class EvolutionChainSummary(
  url: URI
)

object EvolutionChainSummary {
  implicit lazy val evolutionChainSummaryJsonFormat: Format[EvolutionChainSummary] = Json.format[EvolutionChainSummary]
}

