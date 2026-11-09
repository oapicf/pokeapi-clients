
package org.openapitools.client.model


case class PokeathlonStatAffectingNatures (
    /* A list of natures and how they change the referenced Pokéathlon stat. */
    _increase: List[PokeathlonStatAffectingNature],
    /* A list of natures and how they change the referenced Pokéathlon stat. */
    _decrease: List[PokeathlonStatAffectingNature]
)
object PokeathlonStatAffectingNatures {
    def toStringBody(var_increase: Object, var_decrease: Object) =
        s"""
        | {
        | "increase":$var_increase,"decrease":$var_decrease
        | }
        """.stripMargin
}
