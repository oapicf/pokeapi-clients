package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AbilityDetail_pokemon_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AbilityDetailPokemonInner(
  isHidden: Boolean,
  slot: Int,
  pokemon: AbilityDetailPokemonInnerPokemon
)

object AbilityDetailPokemonInner {
  implicit lazy val abilityDetailPokemonInnerJsonFormat: Format[AbilityDetailPokemonInner] = Json.format[AbilityDetailPokemonInner]
}

