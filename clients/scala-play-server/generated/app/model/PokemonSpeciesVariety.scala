package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonSpeciesVariety.
  * @param isDefault Whether this variety is the default variety.
  * @param pokemon The Pokémon variety.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonSpeciesVariety(
  isDefault: Boolean,
  pokemon: PokemonSummary
)

object PokemonSpeciesVariety {
  implicit lazy val pokemonSpeciesVarietyJsonFormat: Format[PokemonSpeciesVariety] = Json.format[PokemonSpeciesVariety]
}

