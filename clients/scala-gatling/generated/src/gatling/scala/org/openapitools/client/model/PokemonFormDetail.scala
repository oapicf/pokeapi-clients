
package org.openapitools.client.model


case class PokemonFormDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name. */
    _order: Option[Integer],
    /* The order in which forms should be sorted within a species' forms. */
    _formOrder: Option[Integer],
    /* True for exactly one form used as the default for each Pokémon. */
    _isDefault: Option[Boolean],
    /* Whether or not this form can only happen during battle. */
    _isBattleOnly: Option[Boolean],
    /* Whether or not this form requires mega evolution. */
    _isMega: Option[Boolean],
    /* The name of this form. */
    _formName: String,
    /* The Pokémon that can take on this form. */
    _pokemon: PokemonSummary,
    /* A set of sprites used to depict this Pokémon form in the game. */
    _sprites: PokemonFormSprites,
    /* The version group this Pokémon form was introduced in. */
    _versionGroup: VersionGroupSummary,
    /* The form specific form name of this Pokémon form, or empty if the form does not have a specific name. */
    _formNames: List[PokemonFormName],
    /* The form specific full name of this Pokémon form, or empty if the form does not have a specific name. */
    _names: List[PokemonFormName],
    /* A list of details showing types this Pokémon form has. */
    _types: List[PokemonFormType],
    /* The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource. */
    _triggerConditions: List[PokemonFormTriggerCondition],
    /* The flavor text of this form listed in different languages and versions. */
    _flavorTextEntries: List[PokemonFormFlavorText]
)
object PokemonFormDetail {
    def toStringBody(var_id: Object, var_name: Object, var_order: Object, var_formOrder: Object, var_isDefault: Object, var_isBattleOnly: Object, var_isMega: Object, var_formName: Object, var_pokemon: Object, var_sprites: Object, var_versionGroup: Object, var_formNames: Object, var_names: Object, var_types: Object, var_triggerConditions: Object, var_flavorTextEntries: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"order":$var_order,"formOrder":$var_formOrder,"isDefault":$var_isDefault,"isBattleOnly":$var_isBattleOnly,"isMega":$var_isMega,"formName":$var_formName,"pokemon":$var_pokemon,"sprites":$var_sprites,"versionGroup":$var_versionGroup,"formNames":$var_formNames,"names":$var_names,"types":$var_types,"triggerConditions":$var_triggerConditions,"flavorTextEntries":$var_flavorTextEntries
        | }
        """.stripMargin
}
