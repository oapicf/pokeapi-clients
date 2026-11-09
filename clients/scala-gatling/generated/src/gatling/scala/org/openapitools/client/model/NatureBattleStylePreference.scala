
package org.openapitools.client.model


case class NatureBattleStylePreference (
    /* Chance of using the move, in percent, if HP is under one half. */
    _lowHpPreference: Integer,
    /* Chance of using the move, in percent, if HP is over one half. */
    _highHpPreference: Integer,
    /* The move battle style. */
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
