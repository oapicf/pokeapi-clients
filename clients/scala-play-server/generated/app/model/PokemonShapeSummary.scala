package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for PokemonShapeSummary.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PokemonShapeSummary(
  name: String,
  url: URI
)

object PokemonShapeSummary {
  implicit lazy val pokemonShapeSummaryJsonFormat: Format[PokemonShapeSummary] = Json.format[PokemonShapeSummary]
}

