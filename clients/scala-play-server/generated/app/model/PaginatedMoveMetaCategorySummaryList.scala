package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for PaginatedMoveMetaCategorySummaryList.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class PaginatedMoveMetaCategorySummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[MoveMetaCategorySummary]]
)

object PaginatedMoveMetaCategorySummaryList {
  implicit lazy val paginatedMoveMetaCategorySummaryListJsonFormat: Format[PaginatedMoveMetaCategorySummaryList] = Json.format[PaginatedMoveMetaCategorySummaryList]
}

