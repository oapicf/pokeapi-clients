package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GenderDetail.
  * @param id The identifier for this resource.
  * @param name The name for this resource.
  * @param pokemonSpeciesDetails A list of Pokémon species that can be this gender and how likely it is that they will be.
  * @param requiredForEvolution A list of Pokémon species that required this gender in order for a Pokémon to evolve into them.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class GenderDetail(
  id: Int,
  name: String,
  pokemonSpeciesDetails: List[GenderPokemonSpecies],
  requiredForEvolution: List[PokemonSpeciesSummary]
)

object GenderDetail {
  implicit lazy val genderDetailJsonFormat: Format[GenderDetail] = Json.format[GenderDetail]
}

