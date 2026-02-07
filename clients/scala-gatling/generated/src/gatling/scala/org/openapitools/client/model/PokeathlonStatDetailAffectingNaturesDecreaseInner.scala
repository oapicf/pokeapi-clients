
package org.openapitools.client.model


case class PokeathlonStatDetailAffectingNaturesDecreaseInner (
    _maxChange: Integer,
    _nature: AbilityDetailPokemonInnerPokemon
)
object PokeathlonStatDetailAffectingNaturesDecreaseInner {
    def toStringBody(var_maxChange: Object, var_nature: Object) =
        s"""
        | {
        | "maxChange":$var_maxChange,"nature":$var_nature
        | }
        """.stripMargin
}
