
package org.openapitools.client.model


case class PokemonStat (
    /* The base value of the stat. */
    _baseStat: Integer,
    /* The effort points (EV) the Pokémon has in the stat. */
    _effort: Integer,
    /* The stat the Pokémon has. */
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
