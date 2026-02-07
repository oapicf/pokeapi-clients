
package org.openapitools.client.model


case class NatureDetailPokeathlonStatChangesInner (
    _maxChange: Integer,
    _pokeathlonStat: AbilityDetailPokemonInnerPokemon
)
object NatureDetailPokeathlonStatChangesInner {
    def toStringBody(var_maxChange: Object, var_pokeathlonStat: Object) =
        s"""
        | {
        | "maxChange":$var_maxChange,"pokeathlonStat":$var_pokeathlonStat
        | }
        """.stripMargin
}
