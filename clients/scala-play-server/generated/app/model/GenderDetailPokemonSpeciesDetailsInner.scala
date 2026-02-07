package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GenderDetail_pokemon_species_details_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class GenderDetailPokemonSpeciesDetailsInner(
  rate: Int,
  pokemonSpecies: AbilityDetailPokemonInnerPokemon
)

object GenderDetailPokemonSpeciesDetailsInner {
  implicit lazy val genderDetailPokemonSpeciesDetailsInnerJsonFormat: Format[GenderDetailPokemonSpeciesDetailsInner] = Json.format[GenderDetailPokemonSpeciesDetailsInner]
}

