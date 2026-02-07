package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BerryFlavorDetail_berries_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BerryFlavorDetailBerriesInner(
  potency: Int,
  berry: BerryFlavorDetailBerriesInnerBerry
)

object BerryFlavorDetailBerriesInner {
  implicit lazy val berryFlavorDetailBerriesInnerJsonFormat: Format[BerryFlavorDetailBerriesInner] = Json.format[BerryFlavorDetailBerriesInner]
}

