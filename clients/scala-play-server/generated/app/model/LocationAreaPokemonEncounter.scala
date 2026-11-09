package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LocationAreaPokemonEncounter.
  * @param pokemon The Pokémon being encountered.
  * @param versionDetails A list of versions and encounters with Pokémon that might happen in the referenced location area.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class LocationAreaPokemonEncounter(
  pokemon: PokemonSummary,
  versionDetails: List[LocationAreaPokemonEncounterVersion]
)

object LocationAreaPokemonEncounter {
  implicit lazy val locationAreaPokemonEncounterJsonFormat: Format[LocationAreaPokemonEncounter] = Json.format[LocationAreaPokemonEncounter]
}

