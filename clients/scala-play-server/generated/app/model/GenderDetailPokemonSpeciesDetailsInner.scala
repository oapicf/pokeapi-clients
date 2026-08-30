package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GenderDetail_pokemon_species_details_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class GenderDetailPokemonSpeciesDetailsInner(
  rate: Int,
  pokemonSpecies: AbilityDetailPokemonInnerPokemon
)

object GenderDetailPokemonSpeciesDetailsInner {
  implicit lazy val genderDetailPokemonSpeciesDetailsInnerJsonFormat: Format[GenderDetailPokemonSpeciesDetailsInner] = Json.format[GenderDetailPokemonSpeciesDetailsInner]
}

