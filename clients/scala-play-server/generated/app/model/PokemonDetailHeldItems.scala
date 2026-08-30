package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonDetail_held_items.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class PokemonDetailHeldItems(
  item: AbilityDetailPokemonInnerPokemon,
  versionDetails: List[ItemDetailHeldByPokemonInnerVersionDetailsInner]
)

object PokemonDetailHeldItems {
  implicit lazy val pokemonDetailHeldItemsJsonFormat: Format[PokemonDetailHeldItems] = Json.format[PokemonDetailHeldItems]
}

