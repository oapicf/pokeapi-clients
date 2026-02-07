package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LocationDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class LocationDetail(
  id: Int,
  name: String,
  region: RegionSummary,
  names: List[LocationName],
  gameIndices: List[LocationGameIndex],
  areas: List[LocationAreaSummary]
)

object LocationDetail {
  implicit lazy val locationDetailJsonFormat: Format[LocationDetail] = Json.format[LocationDetail]
}

