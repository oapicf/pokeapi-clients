
package org.openapitools.client.model


case class StatDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* ID the games use for this stat. */
    _gameIndex: Integer,
    /* Whether this stat only exists within a battle. */
    _isBattleOnly: Option[Boolean],
    /* A detail of moves which affect this stat positively or negatively. */
    _affectingMoves: StatAffectingMoves,
    /* A detail of natures which affect this stat positively or negatively. */
    _affectingNatures: StatAffectingNatures,
    /* Items that affect this stat, such as vitamins and battle items. */
    _affectingItems: List[ItemSummary],
    /* A list of characteristics that are set on a Pokémon when its highest base stat is this stat. */
    _characteristics: List[CharacteristicSummary],
    /* The class of damage this stat is directly related to. */
    _moveDamageClass: MoveDamageClassSummary,
    /* The name of this resource listed in different languages. */
    _names: List[StatName]
)
object StatDetail {
    def toStringBody(var_id: Object, var_name: Object, var_gameIndex: Object, var_isBattleOnly: Object, var_affectingMoves: Object, var_affectingNatures: Object, var_affectingItems: Object, var_characteristics: Object, var_moveDamageClass: Object, var_names: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"gameIndex":$var_gameIndex,"isBattleOnly":$var_isBattleOnly,"affectingMoves":$var_affectingMoves,"affectingNatures":$var_affectingNatures,"affectingItems":$var_affectingItems,"characteristics":$var_characteristics,"moveDamageClass":$var_moveDamageClass,"names":$var_names
        | }
        """.stripMargin
}
