
package org.openapitools.client.model


case class VersionGroupDetail (
    _id: Integer,
    _name: String,
    _order: Option[Integer],
    _generation: GenerationSummary,
    _moveLearnMethods: List[AbilityDetailPokemonInnerPokemon],
    _pokedexes: List[AbilityDetailPokemonInnerPokemon],
    _regions: List[AbilityDetailPokemonInnerPokemon],
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
