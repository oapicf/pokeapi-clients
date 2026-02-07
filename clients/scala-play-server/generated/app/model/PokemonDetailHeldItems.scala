package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonDetail_held_items.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PokemonDetailHeldItems(
  item: AbilityDetailPokemonInnerPokemon,
  versionDetails: List[ItemDetailHeldByPokemonInnerVersionDetailsInner]
)

object PokemonDetailHeldItems {
  implicit lazy val pokemonDetailHeldItemsJsonFormat: Format[PokemonDetailHeldItems] = Json.format[PokemonDetailHeldItems]
}

