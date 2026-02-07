package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for PaginatedMoveTargetSummaryList.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PaginatedMoveTargetSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[MoveTargetSummary]]
)

object PaginatedMoveTargetSummaryList {
  implicit lazy val paginatedMoveTargetSummaryListJsonFormat: Format[PaginatedMoveTargetSummaryList] = Json.format[PaginatedMoveTargetSummaryList]
}

