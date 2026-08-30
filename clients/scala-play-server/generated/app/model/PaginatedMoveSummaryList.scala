package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for PaginatedMoveSummaryList.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class PaginatedMoveSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[MoveSummary]]
)

object PaginatedMoveSummaryList {
  implicit lazy val paginatedMoveSummaryListJsonFormat: Format[PaginatedMoveSummaryList] = Json.format[PaginatedMoveSummaryList]
}

