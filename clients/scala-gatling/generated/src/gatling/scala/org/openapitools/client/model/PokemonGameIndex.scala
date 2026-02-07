
package org.openapitools.client.model


case class PokemonGameIndex (
    _gameIndex: Integer,
    _version: VersionSummary
)
object PokemonGameIndex {
    def toStringBody(var_gameIndex: Object, var_version: Object) =
        s"""
        | {
        | "gameIndex":$var_gameIndex,"version":$var_version
        | }
        """.stripMargin
}
