
package org.openapitools.client.model


case class AbilityDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* Whether or not this ability originated in the main series of the video games. */
    _isMainSeries: Option[Boolean],
    /* The generation this ability originated in. */
    _generation: GenerationSummary,
    /* The name of this resource listed in different languages. */
    _names: List[AbilityName],
    /* The effect of this ability listed in different languages. */
    _effectEntries: List[AbilityEffectText],
    /* The list of previous effects this ability has had across version groups. */
    _effectChanges: List[AbilityChange],
    /* The flavor text of this ability listed in different languages. */
    _flavorTextEntries: List[AbilityFlavorText],
    /* A list of Pokémon that could potentially have this ability. */
    _pokemon: List[AbilityPokemonDetail]
)
object AbilityDetail {
    def toStringBody(var_id: Object, var_name: Object, var_isMainSeries: Object, var_generation: Object, var_names: Object, var_effectEntries: Object, var_effectChanges: Object, var_flavorTextEntries: Object, var_pokemon: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"isMainSeries":$var_isMainSeries,"generation":$var_generation,"names":$var_names,"effectEntries":$var_effectEntries,"effectChanges":$var_effectChanges,"flavorTextEntries":$var_flavorTextEntries,"pokemon":$var_pokemon
        | }
        """.stripMargin
}
