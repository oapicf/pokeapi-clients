package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ContestTypeDetail.
  * @param id The identifier for this resource.
  * @param name The name for this resource.
  * @param berryFlavor The berry flavor that correlates with this contest type.
  * @param names The name of this contest type listed in different languages.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ContestTypeDetail(
  id: Int,
  name: String,
  berryFlavor: BerryFlavorSummary,
  names: List[ContestTypeName]
)

object ContestTypeDetail {
  implicit lazy val contestTypeDetailJsonFormat: Format[ContestTypeDetail] = Json.format[ContestTypeDetail]
}

