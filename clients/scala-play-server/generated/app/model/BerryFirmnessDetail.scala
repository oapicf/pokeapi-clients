package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BerryFirmnessDetail.
  * @param id The identifier for this resource.
  * @param name The name for this resource.
  * @param berries A list of the berries with this firmness.
  * @param names The name of this resource listed in different languages.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BerryFirmnessDetail(
  id: Int,
  name: String,
  berries: List[BerrySummary],
  names: List[BerryFirmnessName]
)

object BerryFirmnessDetail {
  implicit lazy val berryFirmnessDetailJsonFormat: Format[BerryFirmnessDetail] = Json.format[BerryFirmnessDetail]
}

