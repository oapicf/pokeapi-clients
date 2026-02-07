
package org.openapitools.client.model


case class PokemonDetailMovesInner (
    _move: AbilityDetailPokemonInnerPokemon,
    _versionGroupDetails: List[PokemonDetailMovesInnerVersionGroupDetailsInner]
)
object PokemonDetailMovesInner {
    def toStringBody(var_move: Object, var_versionGroupDetails: Object) =
        s"""
        | {
        | "move":$var_move,"versionGroupDetails":$var_versionGroupDetails
        | }
        """.stripMargin
}
