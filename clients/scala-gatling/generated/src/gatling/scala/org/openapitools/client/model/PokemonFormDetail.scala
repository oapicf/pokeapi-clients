
package org.openapitools.client.model


case class PokemonFormDetail (
    _id: Integer,
    _name: String,
    _order: Option[Integer],
    _formOrder: Option[Integer],
    _isDefault: Option[Boolean],
    _isBattleOnly: Option[Boolean],
    _isMega: Option[Boolean],
    _formName: String,
    _pokemon: PokemonSummary,
    _sprites: PokemonFormDetailSprites,
    _versionGroup: VersionGroupSummary,
    _formNames: List[PokemonFormDetailFormNamesInner],
    _names: List[PokemonFormDetailFormNamesInner],
    _types: List[PokemonDetailTypesInner]
)
object PokemonFormDetail {
    def toStringBody(var_id: Object, var_name: Object, var_order: Object, var_formOrder: Object, var_isDefault: Object, var_isBattleOnly: Object, var_isMega: Object, var_formName: Object, var_pokemon: Object, var_sprites: Object, var_versionGroup: Object, var_formNames: Object, var_names: Object, var_types: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"order":$var_order,"formOrder":$var_formOrder,"isDefault":$var_isDefault,"isBattleOnly":$var_isBattleOnly,"isMega":$var_isMega,"formName":$var_formName,"pokemon":$var_pokemon,"sprites":$var_sprites,"versionGroup":$var_versionGroup,"formNames":$var_formNames,"names":$var_names,"types":$var_types
        | }
        """.stripMargin
}
