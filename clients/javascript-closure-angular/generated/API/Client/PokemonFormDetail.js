goog.provide('API.Client.PokemonFormDetail');

/**
 * @record
 */
API.Client.PokemonFormDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.PokemonFormDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.PokemonFormDetail.prototype.name;

/**
 * The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.
 * @type {!number}
 * @export
 */
API.Client.PokemonFormDetail.prototype.order;

/**
 * The order in which forms should be sorted within a species' forms.
 * @type {!number}
 * @export
 */
API.Client.PokemonFormDetail.prototype.formOrder;

/**
 * True for exactly one form used as the default for each Pokémon.
 * @type {!boolean}
 * @export
 */
API.Client.PokemonFormDetail.prototype.isDefault;

/**
 * Whether or not this form can only happen during battle.
 * @type {!boolean}
 * @export
 */
API.Client.PokemonFormDetail.prototype.isBattleOnly;

/**
 * Whether or not this form requires mega evolution.
 * @type {!boolean}
 * @export
 */
API.Client.PokemonFormDetail.prototype.isMega;

/**
 * The name of this form.
 * @type {!string}
 * @export
 */
API.Client.PokemonFormDetail.prototype.formName;

/**
 * The Pokémon that can take on this form.
 * @type {!API.Client.PokemonSummary}
 * @export
 */
API.Client.PokemonFormDetail.prototype.pokemon;

/**
 * A set of sprites used to depict this Pokémon form in the game.
 * @type {!API.Client.PokemonFormSprites}
 * @export
 */
API.Client.PokemonFormDetail.prototype.sprites;

/**
 * The version group this Pokémon form was introduced in.
 * @type {!API.Client.VersionGroupSummary}
 * @export
 */
API.Client.PokemonFormDetail.prototype.versionGroup;

/**
 * The form specific form name of this Pokémon form, or empty if the form does not have a specific name.
 * @type {!Array<!API.Client.PokemonFormName>}
 * @export
 */
API.Client.PokemonFormDetail.prototype.formNames;

/**
 * The form specific full name of this Pokémon form, or empty if the form does not have a specific name.
 * @type {!Array<!API.Client.PokemonFormName>}
 * @export
 */
API.Client.PokemonFormDetail.prototype.names;

/**
 * A list of details showing types this Pokémon form has.
 * @type {!Array<!API.Client.PokemonFormType>}
 * @export
 */
API.Client.PokemonFormDetail.prototype.types;

/**
 * The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource.
 * @type {!Array<!API.Client.PokemonFormTriggerCondition>}
 * @export
 */
API.Client.PokemonFormDetail.prototype.triggerConditions;

/**
 * The flavor text of this form listed in different languages and versions.
 * @type {!Array<!API.Client.PokemonFormFlavorText>}
 * @export
 */
API.Client.PokemonFormDetail.prototype.flavorTextEntries;

