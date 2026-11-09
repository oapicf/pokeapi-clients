package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GrowthRateDetail.
  * @param id The identifier for this resource.
  * @param name The name for this resource.
  * @param formula The formula used to calculate the rate at which the Pokémon species gains level.
  * @param descriptions The descriptions of this characteristic listed in different languages.
  * @param levels A list of levels and the amount of experienced needed to atain them based on this growth rate.
  * @param pokemonSpecies A list of Pokémon species that gain levels at this growth rate.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class GrowthRateDetail(
  id: Int,
  name: String,
  formula: String,
  descriptions: List[GrowthRateDescription],
  levels: List[Experience],
  pokemonSpecies: List[PokemonSpeciesSummary]
)

object GrowthRateDetail {
  implicit lazy val growthRateDetailJsonFormat: Format[GrowthRateDetail] = Json.format[GrowthRateDetail]
}

