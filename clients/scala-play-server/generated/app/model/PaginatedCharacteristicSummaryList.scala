package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for PaginatedCharacteristicSummaryList.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-25T05:53:17.467323765Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PaginatedCharacteristicSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[CharacteristicSummary]]
)

object PaginatedCharacteristicSummaryList {
  implicit lazy val paginatedCharacteristicSummaryListJsonFormat: Format[PaginatedCharacteristicSummaryList] = Json.format[PaginatedCharacteristicSummaryList]
}

