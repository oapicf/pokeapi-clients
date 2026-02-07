package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for StatDetail_affecting_moves_increase_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class StatDetailAffectingMovesIncreaseInner(
  change: Int,
  move: AbilityDetailPokemonInnerPokemon
)

object StatDetailAffectingMovesIncreaseInner {
  implicit lazy val statDetailAffectingMovesIncreaseInnerJsonFormat: Format[StatDetailAffectingMovesIncreaseInner] = Json.format[StatDetailAffectingMovesIncreaseInner]
}

