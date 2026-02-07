
package org.openapitools.client.model


case class StatDetailAffectingNatures (
    _increase: List[AbilityDetailPokemonInnerPokemon],
    _decrease: List[AbilityDetailPokemonInnerPokemon]
)
object StatDetailAffectingNatures {
    def toStringBody(var_increase: Object, var_decrease: Object) =
        s"""
        | {
        | "increase":$var_increase,"decrease":$var_decrease
        | }
        """.stripMargin
}
