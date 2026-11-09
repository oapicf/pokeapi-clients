package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for VersionGroupDetail.
  * @param id The identifier for this resource.
  * @param name The name for this resource.
  * @param order Order for sorting. Almost by date of release, except similar versions are grouped together.
  * @param generation The generation this version was introduced in.
  * @param moveLearnMethods A list of methods in which Pokémon can learn moves in this version group.
  * @param pokedexes A list of Pokédexes introduces in this version group.
  * @param regions A list of regions that can be visited in this version group.
  * @param versions The versions this version group owns.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class VersionGroupDetail(
  id: Int,
  name: String,
  order: Option[Int],
  generation: GenerationSummary,
  moveLearnMethods: List[MoveLearnMethodSummary],
  pokedexes: List[PokedexSummary],
  regions: List[RegionSummary],
  versions: List[VersionSummary]
)

object VersionGroupDetail {
  implicit lazy val versionGroupDetailJsonFormat: Format[VersionGroupDetail] = Json.format[VersionGroupDetail]
}

