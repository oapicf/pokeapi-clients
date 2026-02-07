
package org.openapitools.client.model


case class PokedexDetail (
    _id: Integer,
    _name: String,
    _isMainSeries: Option[Boolean],
    _descriptions: List[PokedexDescription],
    _names: List[PokedexName],
    _pokemonEntries: List[PokedexDetailPokemonEntriesInner],
    _region: RegionSummary,
    _versionGroups: List[AbilityDetailPokemonInnerPokemon]
)
object PokedexDetail {
    def toStringBody(var_id: Object, var_name: Object, var_isMainSeries: Object, var_descriptions: Object, var_names: Object, var_pokemonEntries: Object, var_region: Object, var_versionGroups: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"isMainSeries":$var_isMainSeries,"descriptions":$var_descriptions,"names":$var_names,"pokemonEntries":$var_pokemonEntries,"region":$var_region,"versionGroups":$var_versionGroups
        | }
        """.stripMargin
}
