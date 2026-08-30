package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ContestTypeDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ContestTypeDetail(
  id: Int,
  name: String,
  berryFlavor: BerryFlavorSummary,
  names: List[ContestTypeName]
)

object ContestTypeDetail {
  implicit lazy val contestTypeDetailJsonFormat: Format[ContestTypeDetail] = Json.format[ContestTypeDetail]
}

