package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BerryDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

