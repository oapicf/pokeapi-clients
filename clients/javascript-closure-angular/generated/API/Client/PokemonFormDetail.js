goog.provide('API.Client.PokemonFormDetail');

/**
 * @record
 */
API.Client.PokemonFormDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PokemonFormDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.PokemonFormDetail.prototype.name;

/**
 * @type {!number}
 * @export
 */
API.Client.PokemonFormDetail.prototype.order;

/**
 * @type {!number}
 * @export
 */
API.Client.PokemonFormDetail.prototype.formOrder;

/**
 * @type {!boolean}
 * @export
 */
API.Client.PokemonFormDetail.prototype.isDefault;

/**
 * @type {!boolean}
 * @export
 */
API.Client.PokemonFormDetail.prototype.isBattleOnly;

/**
 * @type {!boolean}
 * @export
 */
API.Client.PokemonFormDetail.prototype.isMega;

/**
 * @type {!string}
 * @export
 */
API.Client.PokemonFormDetail.prototype.formName;

/**
 * @type {!API.Client.PokemonSummary}
 * @export
 */
API.Client.PokemonFormDetail.prototype.pokemon;

/**
 * @type {!API.Client.PokemonFormDetail_sprites}
 * @export
 */
API.Client.PokemonFormDetail.prototype.sprites;

/**
 * @type {!API.Client.VersionGroupSummary}
 * @export
 */
API.Client.PokemonFormDetail.prototype.versionGroup;

/**
 * @type {!Array<!API.Client.PokemonFormDetail_form_names_inner>}
 * @export
 */
API.Client.PokemonFormDetail.prototype.formNames;

/**
 * @type {!Array<!API.Client.PokemonFormDetail_form_names_inner>}
 * @export
 */
API.Client.PokemonFormDetail.prototype.names;

/**
 * @type {!Array<!API.Client.PokemonDetail_types_inner>}
 * @export
 */
API.Client.PokemonFormDetail.prototype.types;

