
package org.openapitools.client.model


case class PokeathlonStatDetailAffectingNatures (
    _decrease: List[PokeathlonStatDetailAffectingNaturesDecreaseInner],
    _increase: List[PokeathlonStatDetailAffectingNaturesIncreaseInner]
)
object PokeathlonStatDetailAffectingNatures {
    def toStringBody(var_decrease: Object, var_increase: Object) =
        s"""
        | {
        | "decrease":$var_decrease,"increase":$var_increase
        | }
        """.stripMargin
}
