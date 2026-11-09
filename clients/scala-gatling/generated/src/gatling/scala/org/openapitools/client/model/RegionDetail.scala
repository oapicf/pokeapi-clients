
package org.openapitools.client.model


case class RegionDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* A list of locations that can be found in this region. */
    _locations: List[LocationSummary],
    /* The generation this region was introduced in. */
    _mainGeneration: GenerationSummary,
    /* The name of this resource listed in different languages. */
    _names: List[RegionName],
    /* A list of pokédexes that catalogue Pokémon in this region. */
    _pokedexes: List[PokedexSummary],
    /* A list of version groups where this region can be visited. */
    _versionGroups: List[VersionGroupSummary]
)
object RegionDetail {
    def toStringBody(var_id: Object, var_name: Object, var_locations: Object, var_mainGeneration: Object, var_names: Object, var_pokedexes: Object, var_versionGroups: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"locations":$var_locations,"mainGeneration":$var_mainGeneration,"names":$var_names,"pokedexes":$var_pokedexes,"versionGroups":$var_versionGroups
        | }
        """.stripMargin
}
