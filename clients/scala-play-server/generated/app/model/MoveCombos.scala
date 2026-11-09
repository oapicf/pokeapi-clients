package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveCombos.
  * @param normal A detail of moves this move can be used before or after, granting additional appeal points in contests.
  * @param `super` A detail of moves this move can be used before or after, granting additional appeal points in super contests.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class MoveCombos(
  normal: MoveComboUsage,
  `super`: MoveComboUsage
)

object MoveCombos {
  implicit lazy val moveCombosJsonFormat: Format[MoveCombos] = Json.format[MoveCombos]
}

