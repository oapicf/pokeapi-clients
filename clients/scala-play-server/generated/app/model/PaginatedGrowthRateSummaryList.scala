package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for PaginatedGrowthRateSummaryList.
  * @param count The total number of resources available from this API.
  * @param next The URL for the next page in the list, or null if there is no next page.
  * @param previous The URL for the previous page in the list, or null if there is no previous page.
  * @param results A list of API resources on this page.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PaginatedGrowthRateSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[GrowthRateSummary]
)

object PaginatedGrowthRateSummaryList {
  implicit lazy val paginatedGrowthRateSummaryListJsonFormat: Format[PaginatedGrowthRateSummaryList] = Json.format[PaginatedGrowthRateSummaryList]
}

