package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ItemDetail_held_by_pokemon_inner_version_details_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-25T05:53:17.467323765Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ItemDetailHeldByPokemonInnerVersionDetailsInner(
  rarity: Int,
  version: AbilityDetailPokemonInnerPokemon
)

object ItemDetailHeldByPokemonInnerVersionDetailsInner {
  implicit lazy val itemDetailHeldByPokemonInnerVersionDetailsInnerJsonFormat: Format[ItemDetailHeldByPokemonInnerVersionDetailsInner] = Json.format[ItemDetailHeldByPokemonInnerVersionDetailsInner]
}

