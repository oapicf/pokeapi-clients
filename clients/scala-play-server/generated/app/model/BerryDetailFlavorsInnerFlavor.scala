package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for BerryDetail_flavors_inner_flavor.
  * @param name The name of the flavor
  * @param url The URL to get more information about the flavor
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BerryDetailFlavorsInnerFlavor(
  name: Option[String],
  url: Option[URI]
)

object BerryDetailFlavorsInnerFlavor {
  implicit lazy val berryDetailFlavorsInnerFlavorJsonFormat: Format[BerryDetailFlavorsInnerFlavor] = Json.format[BerryDetailFlavorsInnerFlavor]
}

