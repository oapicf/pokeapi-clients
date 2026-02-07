package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PalParkAreaDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PalParkAreaDetail(
  id: Int,
  name: String,
  names: List[PalParkAreaName],
  pokemonEncounters: List[PalParkAreaDetailPokemonEncountersInner]
)

object PalParkAreaDetail {
  implicit lazy val palParkAreaDetailJsonFormat: Format[PalParkAreaDetail] = Json.format[PalParkAreaDetail]
}

