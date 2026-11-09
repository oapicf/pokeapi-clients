package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ItemSprites.
  * @param default The default depiction of this item.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ItemSprites(
  default: String
)

object ItemSprites {
  implicit lazy val itemSpritesJsonFormat: Format[ItemSprites] = Json.format[ItemSprites]
}

