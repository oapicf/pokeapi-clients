package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AbilityDetail_pokemon_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AbilityDetailPokemonInner(
  isHidden: Boolean,
  slot: Int,
  pokemon: AbilityDetailPokemonInnerPokemon
)

object AbilityDetailPokemonInner {
  implicit lazy val abilityDetailPokemonInnerJsonFormat: Format[AbilityDetailPokemonInner] = Json.format[AbilityDetailPokemonInner]
}

