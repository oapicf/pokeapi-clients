package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TypeGameSprite.
  * @param nameIcon The URL of the icon displaying the type name in this game, or null if unavailable.
  * @param symbolIcon The URL of the type symbol icon in this game, or null if unavailable.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class TypeGameSprite(
  nameIcon: Option[String],
  symbolIcon: Option[String]
)

object TypeGameSprite {
  implicit lazy val typeGameSpriteJsonFormat: Format[TypeGameSprite] = Json.format[TypeGameSprite]
}

