goog.provide('API.Client.PokeathlonStatAffectingNature');

/**
 * @record
 */
API.Client.PokeathlonStatAffectingNature = function() {}

/**
 * The maximum amount of change to the referenced Pokéathlon stat.
 * @type {!number}
 * @export
 */
API.Client.PokeathlonStatAffectingNature.prototype.maxChange;

/**
 * The nature causing the change.
 * @type {!API.Client.NatureSummary}
 * @export
 */
API.Client.PokeathlonStatAffectingNature.prototype.nature;

