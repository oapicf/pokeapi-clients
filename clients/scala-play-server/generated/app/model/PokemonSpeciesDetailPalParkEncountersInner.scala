package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonSpeciesDetail_pal_park_encounters_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-25T05:53:17.467323765Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonSpeciesDetailPalParkEncountersInner(
  area: AbilityDetailPokemonInnerPokemon,
  baseScore: Int,
  rate: Int
)

object PokemonSpeciesDetailPalParkEncountersInner {
  implicit lazy val pokemonSpeciesDetailPalParkEncountersInnerJsonFormat: Format[PokemonSpeciesDetailPalParkEncountersInner] = Json.format[PokemonSpeciesDetailPalParkEncountersInner]
}

