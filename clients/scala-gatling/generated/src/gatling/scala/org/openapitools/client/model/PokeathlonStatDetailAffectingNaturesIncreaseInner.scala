
package org.openapitools.client.model


case class PokeathlonStatDetailAffectingNaturesIncreaseInner (
    _maxChange: Integer,
    _nature: AbilityDetailPokemonInnerPokemon
)
object PokeathlonStatDetailAffectingNaturesIncreaseInner {
    def toStringBody(var_maxChange: Object, var_nature: Object) =
        s"""
        | {
        | "maxChange":$var_maxChange,"nature":$var_nature
        | }
        """.stripMargin
}
