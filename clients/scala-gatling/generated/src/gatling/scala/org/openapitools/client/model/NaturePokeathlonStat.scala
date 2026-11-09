
package org.openapitools.client.model


case class NaturePokeathlonStat (
    /* The amount of change. */
    _maxChange: Integer,
    /* The stat being affected. */
    _pokeathlonStat: PokeathlonStatSummary
)
object NaturePokeathlonStat {
    def toStringBody(var_maxChange: Object, var_pokeathlonStat: Object) =
        s"""
        | {
        | "maxChange":$var_maxChange,"pokeathlonStat":$var_pokeathlonStat
        | }
        """.stripMargin
}
