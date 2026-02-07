package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BerryDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BerryDetail(
  id: Int,
  name: String,
  growthTime: Int,
  maxHarvest: Int,
  naturalGiftPower: Int,
  size: Int,
  smoothness: Int,
  soilDryness: Int,
  firmness: BerryFirmnessSummary,
  flavors: List[BerryDetailFlavorsInner],
  item: ItemSummary,
  naturalGiftType: TypeSummary
)

object BerryDetail {
  implicit lazy val berryDetailJsonFormat: Format[BerryDetail] = Json.format[BerryDetail]
}

