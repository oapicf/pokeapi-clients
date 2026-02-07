goog.provide('API.Client.VersionDetail');

/**
 * Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I'm not sure how to add anything other than a hyperlink
 * @record
 */
API.Client.VersionDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.VersionDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.VersionDetail.prototype.name;

/**
 * @type {!Array<!API.Client.VersionName>}
 * @export
 */
API.Client.VersionDetail.prototype.names;

/**
 * @type {!API.Client.VersionGroupSummary}
 * @export
 */
API.Client.VersionDetail.prototype.versionGroup;

