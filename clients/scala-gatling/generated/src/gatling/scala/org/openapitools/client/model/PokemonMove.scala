
package org.openapitools.client.model


case class PokemonMove (
    /* The move the Pokémon can learn. */
    _move: MoveSummary,
    /* The details of the version in which the Pokémon can learn the move. */
    _versionGroupDetails: List[PokemonMoveVersionGroup]
)
object PokemonMove {
    def toStringBody(var_move: Object, var_versionGroupDetails: Object) =
        s"""
        | {
        | "move":$var_move,"versionGroupDetails":$var_versionGroupDetails
        | }
        """.stripMargin
}
