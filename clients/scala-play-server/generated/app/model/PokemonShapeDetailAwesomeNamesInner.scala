package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonShapeDetail_awesome_names_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class PokemonShapeDetailAwesomeNamesInner(
  awesomeName: String,
  language: AbilityDetailPokemonInnerPokemon
)

object PokemonShapeDetailAwesomeNamesInner {
  implicit lazy val pokemonShapeDetailAwesomeNamesInnerJsonFormat: Format[PokemonShapeDetailAwesomeNamesInner] = Json.format[PokemonShapeDetailAwesomeNamesInner]
}

