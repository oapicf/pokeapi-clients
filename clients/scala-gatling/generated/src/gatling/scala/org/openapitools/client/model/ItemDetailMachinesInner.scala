
package org.openapitools.client.model

import java.net.URI

case class ItemDetailMachinesInner (
    _machine: URI,
    _versionGroup: AbilityDetailPokemonInnerPokemon
)
object ItemDetailMachinesInner {
    def toStringBody(var_machine: Object, var_versionGroup: Object) =
        s"""
        | {
        | "machine":$var_machine,"versionGroup":$var_versionGroup
        | }
        """.stripMargin
}
