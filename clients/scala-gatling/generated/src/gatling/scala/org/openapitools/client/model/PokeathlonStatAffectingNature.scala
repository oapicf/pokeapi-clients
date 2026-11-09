
package org.openapitools.client.model


case class PokeathlonStatAffectingNature (
    /* The maximum amount of change to the referenced Pokéathlon stat. */
    _maxChange: Integer,
    /* The nature causing the change. */
    _nature: NatureSummary
)
object PokeathlonStatAffectingNature {
    def toStringBody(var_maxChange: Object, var_nature: Object) =
        s"""
        | {
        | "maxChange":$var_maxChange,"nature":$var_nature
        | }
        """.stripMargin
}
