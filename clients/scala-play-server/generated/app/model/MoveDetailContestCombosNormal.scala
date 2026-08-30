package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveDetail_contest_combos_normal.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class MoveDetailContestCombosNormal(
  useBefore: List[AbilityDetailPokemonInnerPokemon],
  useAfter: List[AbilityDetailPokemonInnerPokemon]
)

object MoveDetailContestCombosNormal {
  implicit lazy val moveDetailContestCombosNormalJsonFormat: Format[MoveDetailContestCombosNormal] = Json.format[MoveDetailContestCombosNormal]
}

