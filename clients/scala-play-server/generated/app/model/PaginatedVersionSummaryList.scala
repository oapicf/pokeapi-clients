package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for PaginatedVersionSummaryList.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class PaginatedVersionSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[VersionSummary]]
)

object PaginatedVersionSummaryList {
  implicit lazy val paginatedVersionSummaryListJsonFormat: Format[PaginatedVersionSummaryList] = Json.format[PaginatedVersionSummaryList]
}

