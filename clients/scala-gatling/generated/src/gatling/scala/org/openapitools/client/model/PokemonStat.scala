
package org.openapitools.client.model


case class PokemonStat (
    _baseStat: Integer,
    _effort: Integer,
    _stat: StatSummary
)
object PokemonStat {
    def toStringBody(var_baseStat: Object, var_effort: Object, var_stat: Object) =
        s"""
        | {
        | "baseStat":$var_baseStat,"effort":$var_effort,"stat":$var_stat
        | }
        """.stripMargin
}
