
package org.openapitools.client.model


case class NatureDetail (
    _id: Integer,
    _name: String,
    _decreasedStat: StatSummary,
    _increasedStat: StatSummary,
    _likesFlavor: BerryFlavorSummary,
    _hatesFlavor: BerryFlavorSummary,
    _berries: List[BerrySummary],
    _pokeathlonStatChanges: List[NatureDetailPokeathlonStatChangesInner],
    _moveBattleStylePreferences: List[NatureBattleStylePreference],
    _names: List[NatureName]
)
object NatureDetail {
    def toStringBody(var_id: Object, var_name: Object, var_decreasedStat: Object, var_increasedStat: Object, var_likesFlavor: Object, var_hatesFlavor: Object, var_berries: Object, var_pokeathlonStatChanges: Object, var_moveBattleStylePreferences: Object, var_names: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"decreasedStat":$var_decreasedStat,"increasedStat":$var_increasedStat,"likesFlavor":$var_likesFlavor,"hatesFlavor":$var_hatesFlavor,"berries":$var_berries,"pokeathlonStatChanges":$var_pokeathlonStatChanges,"moveBattleStylePreferences":$var_moveBattleStylePreferences,"names":$var_names
        | }
        """.stripMargin
}
