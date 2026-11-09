package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonEncounterResponse.
  * @param locationArea The location area the referenced Pokémon can be encountered in.
  * @param versionDetails A list of versions and encounters with the referenced Pokémon that might happen.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonEncounterResponse(
  locationArea: LocationAreaSummary,
  versionDetails: List[PokemonEncounterVersionDetailResponse]
)

object PokemonEncounterResponse {
  implicit lazy val pokemonEncounterResponseJsonFormat: Format[PokemonEncounterResponse] = Json.format[PokemonEncounterResponse]
}

