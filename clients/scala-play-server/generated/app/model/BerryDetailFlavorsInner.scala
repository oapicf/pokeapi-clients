package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BerryDetail_flavors_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BerryDetailFlavorsInner(
  potency: Int,
  flavor: BerryDetailFlavorsInnerFlavor
)

object BerryDetailFlavorsInner {
  implicit lazy val berryDetailFlavorsInnerJsonFormat: Format[BerryDetailFlavorsInner] = Json.format[BerryDetailFlavorsInner]
}

