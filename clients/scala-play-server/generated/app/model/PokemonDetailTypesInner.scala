package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonDetail_types_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PokemonDetailTypesInner(
  slot: Int,
  `type`: AbilityDetailPokemonInnerPokemon
)

object PokemonDetailTypesInner {
  implicit lazy val pokemonDetailTypesInnerJsonFormat: Format[PokemonDetailTypesInner] = Json.format[PokemonDetailTypesInner]
}

