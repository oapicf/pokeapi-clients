goog.provide('API.Client.MoveDamageClassDetail');

/**
 * @record
 */
API.Client.MoveDamageClassDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.MoveDamageClassDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.MoveDamageClassDetail.prototype.name;

/**
 * @type {!Array<!API.Client.MoveDamageClassDescription>}
 * @export
 */
API.Client.MoveDamageClassDetail.prototype.descriptions;

/**
 * @type {!Array<!API.Client.MoveSummary>}
 * @export
 */
API.Client.MoveDamageClassDetail.prototype.moves;

/**
 * @type {!Array<!API.Client.MoveDamageClassName>}
 * @export
 */
API.Client.MoveDamageClassDetail.prototype.names;

