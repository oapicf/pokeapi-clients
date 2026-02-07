package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for BerryDetail_flavors_inner_flavor.
  * @param name The name of the flavor
  * @param url The URL to get more information about the flavor
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BerryDetailFlavorsInnerFlavor(
  name: Option[String],
  url: Option[URI]
)

object BerryDetailFlavorsInnerFlavor {
  implicit lazy val berryDetailFlavorsInnerFlavorJsonFormat: Format[BerryDetailFlavorsInnerFlavor] = Json.format[BerryDetailFlavorsInnerFlavor]
}

