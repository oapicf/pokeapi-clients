package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for pokemon_encounters_retrieve_200_response_inner_version_details_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner(
  encounterDetails: List[PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner],
  maxChance: BigDecimal,
  version: PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion
)

object PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner {
  implicit lazy val pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerJsonFormat: Format[PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner] = Json.format[PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner]
}

