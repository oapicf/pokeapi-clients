package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PalParkAreaDetail.
  * @param id The identifier for this resource.
  * @param name The name for this resource.
  * @param names The name of this resource listed in different languages.
  * @param pokemonEncounters A list of Pokémon encountered in thi pal park area along with details.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PalParkAreaDetail(
  id: Int,
  name: String,
  names: List[PalParkAreaName],
  pokemonEncounters: List[PalParkEncounter]
)

object PalParkAreaDetail {
  implicit lazy val palParkAreaDetailJsonFormat: Format[PalParkAreaDetail] = Json.format[PalParkAreaDetail]
}

