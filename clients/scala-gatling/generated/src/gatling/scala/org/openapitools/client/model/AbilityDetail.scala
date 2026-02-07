
package org.openapitools.client.model


case class AbilityDetail (
    _id: Integer,
    _name: String,
    _isMainSeries: Option[Boolean],
    _generation: GenerationSummary,
    _names: List[AbilityName],
    _effectEntries: List[AbilityEffectText],
    _effectChanges: List[AbilityChange],
    _flavorTextEntries: List[AbilityFlavorText],
    _pokemon: List[AbilityDetailPokemonInner]
)
object AbilityDetail {
    def toStringBody(var_id: Object, var_name: Object, var_isMainSeries: Object, var_generation: Object, var_names: Object, var_effectEntries: Object, var_effectChanges: Object, var_flavorTextEntries: Object, var_pokemon: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"isMainSeries":$var_isMainSeries,"generation":$var_generation,"names":$var_names,"effectEntries":$var_effectEntries,"effectChanges":$var_effectChanges,"flavorTextEntries":$var_flavorTextEntries,"pokemon":$var_pokemon
        | }
        """.stripMargin
}
