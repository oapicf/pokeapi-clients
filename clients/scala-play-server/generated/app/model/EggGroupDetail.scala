package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for EggGroupDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class EggGroupDetail(
  id: Int,
  name: String,
  names: List[EggGroupName],
  pokemonSpecies: List[EggGroupDetailPokemonSpeciesInner]
)

object EggGroupDetail {
  implicit lazy val eggGroupDetailJsonFormat: Format[EggGroupDetail] = Json.format[EggGroupDetail]
}

