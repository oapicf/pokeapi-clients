
package org.openapitools.client.model


case class PokemonDetail (
    _id: Integer,
    _name: String,
    _baseExperience: Option[Integer],
    _height: Option[Integer],
    _isDefault: Option[Boolean],
    _order: Option[Integer],
    _weight: Option[Integer],
    _abilities: List[PokemonDetailAbilitiesInner],
    _pastAbilities: List[PokemonDetailPastAbilitiesInner],
    _forms: List[PokemonFormSummary],
    _gameIndices: List[PokemonGameIndex],
    _heldItems: PokemonDetailHeldItems,
    _locationAreaEncounters: String,
    _moves: List[PokemonDetailMovesInner],
    _species: PokemonSpeciesSummary,
    _sprites: PokemonDetailSprites,
    _cries: PokemonDetailCries,
    _stats: List[PokemonStat],
    _types: List[PokemonDetailTypesInner],
    _pastTypes: List[PokemonDetailPastTypesInner]
)
object PokemonDetail {
    def toStringBody(var_id: Object, var_name: Object, var_baseExperience: Object, var_height: Object, var_isDefault: Object, var_order: Object, var_weight: Object, var_abilities: Object, var_pastAbilities: Object, var_forms: Object, var_gameIndices: Object, var_heldItems: Object, var_locationAreaEncounters: Object, var_moves: Object, var_species: Object, var_sprites: Object, var_cries: Object, var_stats: Object, var_types: Object, var_pastTypes: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"baseExperience":$var_baseExperience,"height":$var_height,"isDefault":$var_isDefault,"order":$var_order,"weight":$var_weight,"abilities":$var_abilities,"pastAbilities":$var_pastAbilities,"forms":$var_forms,"gameIndices":$var_gameIndices,"heldItems":$var_heldItems,"locationAreaEncounters":$var_locationAreaEncounters,"moves":$var_moves,"species":$var_species,"sprites":$var_sprites,"cries":$var_cries,"stats":$var_stats,"types":$var_types,"pastTypes":$var_pastTypes
        | }
        """.stripMargin
}
