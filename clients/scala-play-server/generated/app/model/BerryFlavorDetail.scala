package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BerryFlavorDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-25T05:53:17.467323765Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BerryFlavorDetail(
  id: Int,
  name: String,
  berries: List[BerryFlavorDetailBerriesInner],
  contestType: ContestTypeSummary,
  names: List[BerryFlavorName]
)

object BerryFlavorDetail {
  implicit lazy val berryFlavorDetailJsonFormat: Format[BerryFlavorDetail] = Json.format[BerryFlavorDetail]
}

