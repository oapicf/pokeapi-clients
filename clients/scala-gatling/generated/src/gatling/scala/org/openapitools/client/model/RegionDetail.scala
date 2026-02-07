
package org.openapitools.client.model


case class RegionDetail (
    _id: Integer,
    _name: String,
    _locations: List[LocationSummary],
    _mainGeneration: GenerationSummary,
    _names: List[RegionName],
    _pokedexes: List[PokedexSummary],
    _versionGroups: List[AbilityDetailPokemonInnerPokemon]
)
object RegionDetail {
    def toStringBody(var_id: Object, var_name: Object, var_locations: Object, var_mainGeneration: Object, var_names: Object, var_pokedexes: Object, var_versionGroups: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"locations":$var_locations,"mainGeneration":$var_mainGeneration,"names":$var_names,"pokedexes":$var_pokedexes,"versionGroups":$var_versionGroups
        | }
        """.stripMargin
}
