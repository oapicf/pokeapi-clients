
package org.openapitools.client.model


case class MoveChangeEffectEntriesInner (
    _effect: String,
    _shortEffect: String,
    _language: AbilityDetailPokemonInnerPokemon
)
object MoveChangeEffectEntriesInner {
    def toStringBody(var_effect: Object, var_shortEffect: Object, var_language: Object) =
        s"""
        | {
        | "effect":$var_effect,"shortEffect":$var_shortEffect,"language":$var_language
        | }
        """.stripMargin
}
