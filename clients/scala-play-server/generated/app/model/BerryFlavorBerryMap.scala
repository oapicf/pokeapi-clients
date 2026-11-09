package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BerryFlavorBerryMap.
  * @param potency How powerful the referenced flavor is for this berry.
  * @param berry The berry with the referenced flavor.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BerryFlavorBerryMap(
  potency: Int,
  berry: BerrySummary
)

object BerryFlavorBerryMap {
  implicit lazy val berryFlavorBerryMapJsonFormat: Format[BerryFlavorBerryMap] = Json.format[BerryFlavorBerryMap]
}

