package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for PaginatedPokemonShapeSummaryList.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PaginatedPokemonShapeSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[PokemonShapeSummary]]
)

object PaginatedPokemonShapeSummaryList {
  implicit lazy val paginatedPokemonShapeSummaryListJsonFormat: Format[PaginatedPokemonShapeSummaryList] = Json.format[PaginatedPokemonShapeSummaryList]
}

