package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for pokemon_encounters_retrieve_200_response_inner_version_details_inner_version.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion(
  name: String,
  url: URI
)

object PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion {
  implicit lazy val pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersionJsonFormat: Format[PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion] = Json.format[PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion]
}

