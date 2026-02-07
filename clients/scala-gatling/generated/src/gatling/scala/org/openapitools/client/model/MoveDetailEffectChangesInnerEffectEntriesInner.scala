
package org.openapitools.client.model


case class MoveDetailEffectChangesInnerEffectEntriesInner (
    _effect: String,
    _language: AbilityDetailPokemonInnerPokemon
)
object MoveDetailEffectChangesInnerEffectEntriesInner {
    def toStringBody(var_effect: Object, var_language: Object) =
        s"""
        | {
        | "effect":$var_effect,"language":$var_language
        | }
        """.stripMargin
}
