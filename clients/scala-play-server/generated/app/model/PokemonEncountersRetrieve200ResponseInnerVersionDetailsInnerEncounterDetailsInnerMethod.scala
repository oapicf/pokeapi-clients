package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod(
  name: String,
  url: URI
)

object PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod {
  implicit lazy val pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethodJsonFormat: Format[PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod] = Json.format[PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod]
}

