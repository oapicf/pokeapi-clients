goog.provide('API.Client.VersionDetail');

/**
 * Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I'm not sure how to add anything other than a hyperlink
 * @record
 */
API.Client.VersionDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.VersionDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.VersionDetail.prototype.name;

/**
 * The name of this resource listed in different languages.
 * @type {!Array<!API.Client.VersionName>}
 * @export
 */
API.Client.VersionDetail.prototype.names;

/**
 * The version group this version belongs to.
 * @type {!API.Client.VersionGroupSummary}
 * @export
 */
API.Client.VersionDetail.prototype.versionGroup;

