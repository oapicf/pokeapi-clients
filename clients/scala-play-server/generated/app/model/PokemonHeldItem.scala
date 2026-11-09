package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonHeldItem.
  * @param pokemon The Pokémon that holds this item.
  * @param versionDetails The details for the version that this item is held in by the Pokémon.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonHeldItem(
  pokemon: PokemonSummary,
  versionDetails: List[PokemonHeldItemVersion]
)

object PokemonHeldItem {
  implicit lazy val pokemonHeldItemJsonFormat: Format[PokemonHeldItem] = Json.format[PokemonHeldItem]
}

