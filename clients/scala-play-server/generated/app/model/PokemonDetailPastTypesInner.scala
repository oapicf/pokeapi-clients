package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonDetail_past_types_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class PokemonDetailPastTypesInner(
  generation: AbilityDetailPokemonInnerPokemon,
  types: List[PokemonDetailTypesInner]
)

object PokemonDetailPastTypesInner {
  implicit lazy val pokemonDetailPastTypesInnerJsonFormat: Format[PokemonDetailPastTypesInner] = Json.format[PokemonDetailPastTypesInner]
}

