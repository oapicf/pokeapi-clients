
package org.openapitools.client.model


case class MoveMetaAilmentDetail (
    _id: Integer,
    _name: String,
    _moves: List[AbilityDetailPokemonInnerPokemon],
    _names: List[MoveMetaAilmentName]
)
object MoveMetaAilmentDetail {
    def toStringBody(var_id: Object, var_name: Object, var_moves: Object, var_names: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"moves":$var_moves,"names":$var_names
        | }
        """.stripMargin
}
