package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for pokemon_encounters_retrieve_200_response_inner_location_area.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PokemonEncountersRetrieve200ResponseInnerLocationArea(
  name: String,
  url: URI
)

object PokemonEncountersRetrieve200ResponseInnerLocationArea {
  implicit lazy val pokemonEncountersRetrieve200ResponseInnerLocationAreaJsonFormat: Format[PokemonEncountersRetrieve200ResponseInnerLocationArea] = Json.format[PokemonEncountersRetrieve200ResponseInnerLocationArea]
}

