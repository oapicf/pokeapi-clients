package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RegionDetail.
  * @param id The identifier for this resource.
  * @param name The name for this resource.
  * @param locations A list of locations that can be found in this region.
  * @param mainGeneration The generation this region was introduced in.
  * @param names The name of this resource listed in different languages.
  * @param pokedexes A list of pokédexes that catalogue Pokémon in this region.
  * @param versionGroups A list of version groups where this region can be visited.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class RegionDetail(
  id: Int,
  name: String,
  locations: List[LocationSummary],
  mainGeneration: GenerationSummary,
  names: List[RegionName],
  pokedexes: List[PokedexSummary],
  versionGroups: List[VersionGroupSummary]
)

object RegionDetail {
  implicit lazy val regionDetailJsonFormat: Format[RegionDetail] = Json.format[RegionDetail]
}

