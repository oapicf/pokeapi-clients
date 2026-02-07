
package org.openapitools.client.model


case class MoveDetailStatChangesInner (
    _change: Integer,
    _stat: AbilityDetailPokemonInnerPokemon
)
object MoveDetailStatChangesInner {
    def toStringBody(var_change: Object, var_stat: Object) =
        s"""
        | {
        | "change":$var_change,"stat":$var_stat
        | }
        """.stripMargin
}
