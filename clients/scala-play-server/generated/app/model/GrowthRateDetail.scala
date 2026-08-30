package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GrowthRateDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

