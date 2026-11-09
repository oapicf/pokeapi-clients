goog.provide('API.Client.MoveDamageClassDetail');

/**
 * @record
 */
API.Client.MoveDamageClassDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.MoveDamageClassDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.MoveDamageClassDetail.prototype.name;

/**
 * The description of this resource listed in different languages.
 * @type {!Array<!API.Client.MoveDamageClassDescription>}
 * @export
 */
API.Client.MoveDamageClassDetail.prototype.descriptions;

/**
 * A list of moves that fall into this damage class.
 * @type {!Array<!API.Client.MoveSummary>}
 * @export
 */
API.Client.MoveDamageClassDetail.prototype.moves;

/**
 * The name of this resource listed in different languages.
 * @type {!Array<!API.Client.MoveDamageClassName>}
 * @export
 */
API.Client.MoveDamageClassDetail.prototype.names;

