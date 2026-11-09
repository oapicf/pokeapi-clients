
package org.openapitools.client.model


case class VersionGroupDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* Order for sorting. Almost by date of release, except similar versions are grouped together. */
    _order: Option[Integer],
    /* The generation this version was introduced in. */
    _generation: GenerationSummary,
    /* A list of methods in which Pokémon can learn moves in this version group. */
    _moveLearnMethods: List[MoveLearnMethodSummary],
    /* A list of Pokédexes introduces in this version group. */
    _pokedexes: List[PokedexSummary],
    /* A list of regions that can be visited in this version group. */
    _regions: List[RegionSummary],
    /* The versions this version group owns. */
    _versions: List[VersionSummary]
)
object VersionGroupDetail {
    def toStringBody(var_id: Object, var_name: Object, var_order: Object, var_generation: Object, var_moveLearnMethods: Object, var_pokedexes: Object, var_regions: Object, var_versions: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"order":$var_order,"generation":$var_generation,"moveLearnMethods":$var_moveLearnMethods,"pokedexes":$var_pokedexes,"regions":$var_regions,"versions":$var_versions
        | }
        """.stripMargin
}
