
package org.openapitools.client.model


case class MoveDetailContestCombosNormal (
    _useBefore: List[AbilityDetailPokemonInnerPokemon],
    _useAfter: List[AbilityDetailPokemonInnerPokemon]
)
object MoveDetailContestCombosNormal {
    def toStringBody(var_useBefore: Object, var_useAfter: Object) =
        s"""
        | {
        | "useBefore":$var_useBefore,"useAfter":$var_useAfter
        | }
        """.stripMargin
}
