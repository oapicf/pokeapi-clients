package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LocationDetail.
  * @param id The identifier for this resource.
  * @param name The name for this resource.
  * @param region The region this location can be found in.
  * @param names The name of this resource listed in different languages.
  * @param gameIndices A list of game indices relevent to this location by generation.
  * @param areas Areas that can be found within this location.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

