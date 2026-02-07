package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PalParkAreaDetail_pokemon_encounters_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PalParkAreaDetailPokemonEncountersInner(
  baseScore: Int,
  pokemonSpecies: AbilityDetailPokemonInnerPokemon,
  rate: Int
)

object PalParkAreaDetailPokemonEncountersInner {
  implicit lazy val palParkAreaDetailPokemonEncountersInnerJsonFormat: Format[PalParkAreaDetailPokemonEncountersInner] = Json.format[PalParkAreaDetailPokemonEncountersInner]
}

