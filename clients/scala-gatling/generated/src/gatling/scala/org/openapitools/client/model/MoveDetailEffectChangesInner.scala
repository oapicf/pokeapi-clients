
package org.openapitools.client.model


case class MoveDetailEffectChangesInner (
    _effectEntries: List[MoveDetailEffectChangesInnerEffectEntriesInner],
    _versionGroup: AbilityDetailPokemonInnerPokemon
)
object MoveDetailEffectChangesInner {
    def toStringBody(var_effectEntries: Object, var_versionGroup: Object) =
        s"""
        | {
        | "effectEntries":$var_effectEntries,"versionGroup":$var_versionGroup
        | }
        """.stripMargin
}
