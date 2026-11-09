package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonHeldItemSummary.
  * @param item The item the referenced Pokémon holds.
  * @param versionDetails The details of the different versions in which the item is held.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonHeldItemSummary(
  item: ItemSummary,
  versionDetails: List[PokemonHeldItemVersion]
)

object PokemonHeldItemSummary {
  implicit lazy val pokemonHeldItemSummaryJsonFormat: Format[PokemonHeldItemSummary] = Json.format[PokemonHeldItemSummary]
}

