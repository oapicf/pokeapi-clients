package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonDetail_past_types_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PokemonDetailPastTypesInner(
  generation: AbilityDetailPokemonInnerPokemon,
  types: List[PokemonDetailTypesInner]
)

object PokemonDetailPastTypesInner {
  implicit lazy val pokemonDetailPastTypesInnerJsonFormat: Format[PokemonDetailPastTypesInner] = Json.format[PokemonDetailPastTypesInner]
}

