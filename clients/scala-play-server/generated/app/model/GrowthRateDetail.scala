package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GrowthRateDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

