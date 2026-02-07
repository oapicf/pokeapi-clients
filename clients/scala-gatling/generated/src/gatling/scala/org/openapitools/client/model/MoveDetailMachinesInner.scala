
package org.openapitools.client.model


case class MoveDetailMachinesInner (
    _machine: MoveDetailMachinesInnerMachine,
    _versionGroup: AbilityDetailPokemonInnerPokemon
)
object MoveDetailMachinesInner {
    def toStringBody(var_machine: Object, var_versionGroup: Object) =
        s"""
        | {
        | "machine":$var_machine,"versionGroup":$var_versionGroup
        | }
        """.stripMargin
}
