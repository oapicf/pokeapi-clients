
package org.openapitools.client.model


case class MoveMetaCategoryDetail (
    _id: Integer,
    _name: String,
    _descriptions: List[MoveMetaCategoryDescription],
    _moves: List[AbilityDetailPokemonInnerPokemon]
)
object MoveMetaCategoryDetail {
    def toStringBody(var_id: Object, var_name: Object, var_descriptions: Object, var_moves: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"descriptions":$var_descriptions,"moves":$var_moves
        | }
        """.stripMargin
}
