package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonDetail_moves_inner_version_group_details_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class PokemonDetailMovesInnerVersionGroupDetailsInner(
  levelLearnedAt: Int,
  moveLearnMethod: AbilityDetailPokemonInnerPokemon,
  versionGroup: AbilityDetailPokemonInnerPokemon
)

object PokemonDetailMovesInnerVersionGroupDetailsInner {
  implicit lazy val pokemonDetailMovesInnerVersionGroupDetailsInnerJsonFormat: Format[PokemonDetailMovesInnerVersionGroupDetailsInner] = Json.format[PokemonDetailMovesInnerVersionGroupDetailsInner]
}

