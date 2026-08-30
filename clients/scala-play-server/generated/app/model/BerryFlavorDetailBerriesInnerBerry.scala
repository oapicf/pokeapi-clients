package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for BerryFlavorDetail_berries_inner_berry.
  * @param name The name of the berry
  * @param url The URL to get more information about the berry
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BerryFlavorDetailBerriesInnerBerry(
  name: Option[String],
  url: Option[URI]
)

object BerryFlavorDetailBerriesInnerBerry {
  implicit lazy val berryFlavorDetailBerriesInnerBerryJsonFormat: Format[BerryFlavorDetailBerriesInnerBerry] = Json.format[BerryFlavorDetailBerriesInnerBerry]
}

