package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonSpeciesDetail_pal_park_encounters_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PokemonSpeciesDetailPalParkEncountersInner(
  area: AbilityDetailPokemonInnerPokemon,
  baseScore: Int,
  rate: Int
)

object PokemonSpeciesDetailPalParkEncountersInner {
  implicit lazy val pokemonSpeciesDetailPalParkEncountersInnerJsonFormat: Format[PokemonSpeciesDetailPalParkEncountersInner] = Json.format[PokemonSpeciesDetailPalParkEncountersInner]
}

