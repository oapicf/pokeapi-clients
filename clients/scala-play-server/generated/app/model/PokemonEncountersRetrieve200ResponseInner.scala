package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for pokemon_encounters_retrieve_200_response_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PokemonEncountersRetrieve200ResponseInner(
  locationArea: PokemonEncountersRetrieve200ResponseInnerLocationArea,
  versionDetails: List[PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner]
)

object PokemonEncountersRetrieve200ResponseInner {
  implicit lazy val pokemonEncountersRetrieve200ResponseInnerJsonFormat: Format[PokemonEncountersRetrieve200ResponseInner] = Json.format[PokemonEncountersRetrieve200ResponseInner]
}

