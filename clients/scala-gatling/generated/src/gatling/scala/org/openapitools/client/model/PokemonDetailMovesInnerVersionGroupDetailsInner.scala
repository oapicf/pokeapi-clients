
package org.openapitools.client.model


case class PokemonDetailMovesInnerVersionGroupDetailsInner (
    _levelLearnedAt: Integer,
    _moveLearnMethod: AbilityDetailPokemonInnerPokemon,
    _versionGroup: AbilityDetailPokemonInnerPokemon
)
object PokemonDetailMovesInnerVersionGroupDetailsInner {
    def toStringBody(var_levelLearnedAt: Object, var_moveLearnMethod: Object, var_versionGroup: Object) =
        s"""
        | {
        | "levelLearnedAt":$var_levelLearnedAt,"moveLearnMethod":$var_moveLearnMethod,"versionGroup":$var_versionGroup
        | }
        """.stripMargin
}
