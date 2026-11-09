package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BerryFlavorMap.
  * @param potency How powerful the referenced flavor is for this berry.
  * @param flavor The referenced berry flavor.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BerryFlavorMap(
  potency: Int,
  flavor: BerryFlavorSummary
)

object BerryFlavorMap {
  implicit lazy val berryFlavorMapJsonFormat: Format[BerryFlavorMap] = Json.format[BerryFlavorMap]
}

