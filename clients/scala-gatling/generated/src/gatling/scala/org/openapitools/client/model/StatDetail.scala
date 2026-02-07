
package org.openapitools.client.model


case class StatDetail (
    _id: Integer,
    _name: String,
    _gameIndex: Integer,
    _isBattleOnly: Option[Boolean],
    _affectingMoves: StatDetailAffectingMoves,
    _affectingNatures: StatDetailAffectingNatures,
    _characteristics: List[CharacteristicSummary],
    _moveDamageClass: MoveDamageClassSummary,
    _names: List[StatName]
)
object StatDetail {
    def toStringBody(var_id: Object, var_name: Object, var_gameIndex: Object, var_isBattleOnly: Object, var_affectingMoves: Object, var_affectingNatures: Object, var_characteristics: Object, var_moveDamageClass: Object, var_names: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"gameIndex":$var_gameIndex,"isBattleOnly":$var_isBattleOnly,"affectingMoves":$var_affectingMoves,"affectingNatures":$var_affectingNatures,"characteristics":$var_characteristics,"moveDamageClass":$var_moveDamageClass,"names":$var_names
        | }
        """.stripMargin
}
