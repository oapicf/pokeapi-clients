
package org.openapitools.client.model


case class NatureDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* The stat decreased by 10% in Pokémon with this nature. */
    _decreasedStat: StatSummary,
    /* The stat increased by 10% in Pokémon with this nature. */
    _increasedStat: StatSummary,
    /* The flavor liked by Pokémon with this nature. */
    _likesFlavor: BerryFlavorSummary,
    /* The flavor hated by Pokémon with this nature. */
    _hatesFlavor: BerryFlavorSummary,
    /* A list of Pokéathlon stats this nature effects and how much it effects them. */
    _pokeathlonStatChanges: List[NaturePokeathlonStat],
    /* A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent. */
    _moveBattleStylePreferences: List[NatureBattleStylePreference],
    /* The name of this resource listed in different languages. */
    _names: List[NatureName]
)
object NatureDetail {
    def toStringBody(var_id: Object, var_name: Object, var_decreasedStat: Object, var_increasedStat: Object, var_likesFlavor: Object, var_hatesFlavor: Object, var_pokeathlonStatChanges: Object, var_moveBattleStylePreferences: Object, var_names: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"decreasedStat":$var_decreasedStat,"increasedStat":$var_increasedStat,"likesFlavor":$var_likesFlavor,"hatesFlavor":$var_hatesFlavor,"pokeathlonStatChanges":$var_pokeathlonStatChanges,"moveBattleStylePreferences":$var_moveBattleStylePreferences,"names":$var_names
        | }
        """.stripMargin
}
