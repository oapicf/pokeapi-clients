package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for PaginatedLanguageSummaryList.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-25T05:53:17.467323765Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PaginatedLanguageSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[LanguageSummary]]
)

object PaginatedLanguageSummaryList {
  implicit lazy val paginatedLanguageSummaryListJsonFormat: Format[PaginatedLanguageSummaryList] = Json.format[PaginatedLanguageSummaryList]
}

