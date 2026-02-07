package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveDetail_contest_combos_normal.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class MoveDetailContestCombosNormal(
  useBefore: List[AbilityDetailPokemonInnerPokemon],
  useAfter: List[AbilityDetailPokemonInnerPokemon]
)

object MoveDetailContestCombosNormal {
  implicit lazy val moveDetailContestCombosNormalJsonFormat: Format[MoveDetailContestCombosNormal] = Json.format[MoveDetailContestCombosNormal]
}

