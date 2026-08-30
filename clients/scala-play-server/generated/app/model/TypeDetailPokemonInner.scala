package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TypeDetail_pokemon_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TypeDetailPokemonInner(
  slot: Option[Int],
  pokemon: Option[TypeDetailPokemonInnerPokemon]
)

object TypeDetailPokemonInner {
  implicit lazy val typeDetailPokemonInnerJsonFormat: Format[TypeDetailPokemonInner] = Json.format[TypeDetailPokemonInner]
}

