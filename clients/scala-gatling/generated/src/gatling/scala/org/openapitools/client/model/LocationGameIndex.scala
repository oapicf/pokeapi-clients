
package org.openapitools.client.model


case class LocationGameIndex (
    _gameIndex: Integer,
    _generation: GenerationSummary
)
object LocationGameIndex {
    def toStringBody(var_gameIndex: Object, var_generation: Object) =
        s"""
        | {
        | "gameIndex":$var_gameIndex,"generation":$var_generation
        | }
        """.stripMargin
}
