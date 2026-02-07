package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TypeDetail_pokemon_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TypeDetailPokemonInner(
  slot: Option[Int],
  pokemon: Option[TypeDetailPokemonInnerPokemon]
)

object TypeDetailPokemonInner {
  implicit lazy val typeDetailPokemonInnerJsonFormat: Format[TypeDetailPokemonInner] = Json.format[TypeDetailPokemonInner]
}

