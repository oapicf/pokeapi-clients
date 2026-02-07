package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BerryFirmnessDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BerryFirmnessDetail(
  id: Int,
  name: String,
  berries: List[BerrySummary],
  names: List[BerryFirmnessName]
)

object BerryFirmnessDetail {
  implicit lazy val berryFirmnessDetailJsonFormat: Format[BerryFirmnessDetail] = Json.format[BerryFirmnessDetail]
}

