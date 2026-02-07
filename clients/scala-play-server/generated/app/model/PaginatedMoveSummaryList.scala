package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for PaginatedMoveSummaryList.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PaginatedMoveSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[MoveSummary]]
)

object PaginatedMoveSummaryList {
  implicit lazy val paginatedMoveSummaryListJsonFormat: Format[PaginatedMoveSummaryList] = Json.format[PaginatedMoveSummaryList]
}

