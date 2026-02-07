package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for PaginatedVersionSummaryList.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PaginatedVersionSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[VersionSummary]]
)

object PaginatedVersionSummaryList {
  implicit lazy val paginatedVersionSummaryListJsonFormat: Format[PaginatedVersionSummaryList] = Json.format[PaginatedVersionSummaryList]
}

