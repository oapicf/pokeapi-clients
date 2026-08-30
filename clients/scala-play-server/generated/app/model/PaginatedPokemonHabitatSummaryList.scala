package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for PaginatedPokemonHabitatSummaryList.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class PaginatedPokemonHabitatSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[PokemonHabitatSummary]]
)

object PaginatedPokemonHabitatSummaryList {
  implicit lazy val paginatedPokemonHabitatSummaryListJsonFormat: Format[PaginatedPokemonHabitatSummaryList] = Json.format[PaginatedPokemonHabitatSummaryList]
}

