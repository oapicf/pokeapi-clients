
package org.openapitools.client.model


case class NatureBattleStylePreference (
    _lowHpPreference: Integer,
    _highHpPreference: Integer,
    _moveBattleStyle: MoveBattleStyleSummary
)
object NatureBattleStylePreference {
    def toStringBody(var_lowHpPreference: Object, var_highHpPreference: Object, var_moveBattleStyle: Object) =
        s"""
        | {
        | "lowHpPreference":$var_lowHpPreference,"highHpPreference":$var_highHpPreference,"moveBattleStyle":$var_moveBattleStyle
        | }
        """.stripMargin
}
