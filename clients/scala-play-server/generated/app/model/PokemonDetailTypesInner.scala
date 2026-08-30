package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonDetail_types_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class PokemonDetailTypesInner(
  slot: Int,
  `type`: AbilityDetailPokemonInnerPokemon
)

object PokemonDetailTypesInner {
  implicit lazy val pokemonDetailTypesInnerJsonFormat: Format[PokemonDetailTypesInner] = Json.format[PokemonDetailTypesInner]
}

