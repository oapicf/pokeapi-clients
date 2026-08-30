package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonDetail_abilities_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class PokemonDetailAbilitiesInner(
  ability: AbilityDetailPokemonInnerPokemon,
  isHidden: Boolean,
  slot: Int
)

object PokemonDetailAbilitiesInner {
  implicit lazy val pokemonDetailAbilitiesInnerJsonFormat: Format[PokemonDetailAbilitiesInner] = Json.format[PokemonDetailAbilitiesInner]
}

