package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonDetail_moves_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class PokemonDetailMovesInner(
  move: AbilityDetailPokemonInnerPokemon,
  versionGroupDetails: List[PokemonDetailMovesInnerVersionGroupDetailsInner]
)

object PokemonDetailMovesInner {
  implicit lazy val pokemonDetailMovesInnerJsonFormat: Format[PokemonDetailMovesInner] = Json.format[PokemonDetailMovesInner]
}

