
package org.openapitools.client.model


case class TypeDetailPastDamageRelationsInner (
    _generation: AbilityDetailPokemonInnerPokemon,
    _damageRelations: TypeDetailPastDamageRelationsInnerDamageRelations
)
object TypeDetailPastDamageRelationsInner {
    def toStringBody(var_generation: Object, var_damageRelations: Object) =
        s"""
        | {
        | "generation":$var_generation,"damageRelations":$var_damageRelations
        | }
        """.stripMargin
}
