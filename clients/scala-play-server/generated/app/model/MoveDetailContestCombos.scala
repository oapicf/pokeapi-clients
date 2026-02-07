package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveDetail_contest_combos.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class MoveDetailContestCombos(
  normal: MoveDetailContestCombosNormal,
  `super`: MoveDetailContestCombosNormal
)

object MoveDetailContestCombos {
  implicit lazy val moveDetailContestCombosJsonFormat: Format[MoveDetailContestCombos] = Json.format[MoveDetailContestCombos]
}

