goog.provide('API.Client.MoveLearnMethodDetail');

/**
 * @record
 */
API.Client.MoveLearnMethodDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.MoveLearnMethodDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.MoveLearnMethodDetail.prototype.name;

/**
 * @type {!Array<!API.Client.MoveLearnMethodName>}
 * @export
 */
API.Client.MoveLearnMethodDetail.prototype.names;

/**
 * @type {!Array<!API.Client.MoveLearnMethodDescription>}
 * @export
 */
API.Client.MoveLearnMethodDetail.prototype.descriptions;

/**
 * @type {!Array<!API.Client.AbilityDetail_pokemon_inner_pokemon>}
 * @export
 */
API.Client.MoveLearnMethodDetail.prototype.versionGroups;

