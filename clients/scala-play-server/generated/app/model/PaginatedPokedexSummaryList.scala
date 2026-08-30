package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for PaginatedPokedexSummaryList.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class PaginatedPokedexSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[PokedexSummary]]
)

object PaginatedPokedexSummaryList {
  implicit lazy val paginatedPokedexSummaryListJsonFormat: Format[PaginatedPokedexSummaryList] = Json.format[PaginatedPokedexSummaryList]
}

