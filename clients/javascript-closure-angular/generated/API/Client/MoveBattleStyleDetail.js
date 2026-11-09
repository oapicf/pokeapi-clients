goog.provide('API.Client.MoveBattleStyleDetail');

/**
 * @record
 */
API.Client.MoveBattleStyleDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.MoveBattleStyleDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.MoveBattleStyleDetail.prototype.name;

/**
 * The name of this resource listed in different languages.
 * @type {!Array<!API.Client.MoveBattleStyleName>}
 * @export
 */
API.Client.MoveBattleStyleDetail.prototype.names;

