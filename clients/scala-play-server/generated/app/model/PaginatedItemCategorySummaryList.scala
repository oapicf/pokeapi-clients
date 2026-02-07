package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for PaginatedItemCategorySummaryList.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PaginatedItemCategorySummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[ItemCategorySummary]]
)

object PaginatedItemCategorySummaryList {
  implicit lazy val paginatedItemCategorySummaryListJsonFormat: Format[PaginatedItemCategorySummaryList] = Json.format[PaginatedItemCategorySummaryList]
}

