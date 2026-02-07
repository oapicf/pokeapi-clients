
package org.openapitools.client.model


case class PalParkAreaDetail (
    _id: Integer,
    _name: String,
    _names: List[PalParkAreaName],
    _pokemonEncounters: List[PalParkAreaDetailPokemonEncountersInner]
)
object PalParkAreaDetail {
    def toStringBody(var_id: Object, var_name: Object, var_names: Object, var_pokemonEncounters: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"names":$var_names,"pokemonEncounters":$var_pokemonEncounters
        | }
        """.stripMargin
}
