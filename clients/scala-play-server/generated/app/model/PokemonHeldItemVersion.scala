package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonHeldItemVersion.
  * @param rarity How often the item is held.
  * @param version The version in which the item is held.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonHeldItemVersion(
  rarity: Int,
  version: VersionSummary
)

object PokemonHeldItemVersion {
  implicit lazy val pokemonHeldItemVersionJsonFormat: Format[PokemonHeldItemVersion] = Json.format[PokemonHeldItemVersion]
}

