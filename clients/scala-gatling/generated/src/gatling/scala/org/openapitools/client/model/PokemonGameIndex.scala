
package org.openapitools.client.model


case class PokemonGameIndex (
    /* The internal id of an API resource within game data. */
    _gameIndex: Integer,
    /* The version relevent to this game index. */
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
