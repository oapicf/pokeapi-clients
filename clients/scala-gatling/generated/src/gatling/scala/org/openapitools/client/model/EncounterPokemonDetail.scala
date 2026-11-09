
package org.openapitools.client.model


case class EncounterPokemonDetail (
    /* The minimum number of perfect IVs, or null if unspecified. */
    _minPerfectIvs: Option[Integer],
    /* Whether the encountered Pokémon is always shiny. */
    _alwaysShiny: Option[Boolean],
    /* Whether the encountered Pokémon can never be shiny. */
    _neverShiny: Option[Boolean],
    /* Whether the encountered Pokémon is an alpha Pokémon. */
    _isAlpha: Option[Boolean]
)
object EncounterPokemonDetail {
    def toStringBody(var_minPerfectIvs: Object, var_alwaysShiny: Object, var_neverShiny: Object, var_isAlpha: Object) =
        s"""
        | {
        | "minPerfectIvs":$var_minPerfectIvs,"alwaysShiny":$var_alwaysShiny,"neverShiny":$var_neverShiny,"isAlpha":$var_isAlpha
        | }
        """.stripMargin
}
