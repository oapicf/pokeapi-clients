
package org.openapitools.client.model


case class TypeGameIndex (
    /* The internal id of an API resource within game data. */
    _gameIndex: Integer,
    /* The generation relevent to this game index. */
    _generation: GenerationSummary
)
object TypeGameIndex {
    def toStringBody(var_gameIndex: Object, var_generation: Object) =
        s"""
        | {
        | "gameIndex":$var_gameIndex,"generation":$var_generation
        | }
        """.stripMargin
}
