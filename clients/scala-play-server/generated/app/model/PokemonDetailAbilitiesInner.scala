package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonDetail_abilities_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PokemonDetailAbilitiesInner(
  ability: AbilityDetailPokemonInnerPokemon,
  isHidden: Boolean,
  slot: Int
)

object PokemonDetailAbilitiesInner {
  implicit lazy val pokemonDetailAbilitiesInnerJsonFormat: Format[PokemonDetailAbilitiesInner] = Json.format[PokemonDetailAbilitiesInner]
}

