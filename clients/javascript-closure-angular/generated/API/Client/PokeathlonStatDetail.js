goog.provide('API.Client.PokeathlonStatDetail');

/**
 * @record
 */
API.Client.PokeathlonStatDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.PokeathlonStatDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.PokeathlonStatDetail.prototype.name;

/**
 * A detail of natures which affect this Pokéathlon stat positively or negatively.
 * @type {!API.Client.PokeathlonStatAffectingNatures}
 * @export
 */
API.Client.PokeathlonStatDetail.prototype.affectingNatures;

/**
 * The name of this resource listed in different languages.
 * @type {!Array<!API.Client.PokeathlonStatName>}
 * @export
 */
API.Client.PokeathlonStatDetail.prototype.names;

