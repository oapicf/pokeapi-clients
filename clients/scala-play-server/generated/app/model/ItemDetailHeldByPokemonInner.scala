package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ItemDetail_held_by_pokemon_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ItemDetailHeldByPokemonInner(
  pokemon: AbilityDetailPokemonInnerPokemon,
  versionDetails: List[ItemDetailHeldByPokemonInnerVersionDetailsInner]
)

object ItemDetailHeldByPokemonInner {
  implicit lazy val itemDetailHeldByPokemonInnerJsonFormat: Format[ItemDetailHeldByPokemonInner] = Json.format[ItemDetailHeldByPokemonInner]
}

