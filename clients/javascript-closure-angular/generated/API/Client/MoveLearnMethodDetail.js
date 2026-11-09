goog.provide('API.Client.MoveLearnMethodDetail');

/**
 * @record
 */
API.Client.MoveLearnMethodDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.MoveLearnMethodDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.MoveLearnMethodDetail.prototype.name;

/**
 * The name of this resource listed in different languages.
 * @type {!Array<!API.Client.MoveLearnMethodName>}
 * @export
 */
API.Client.MoveLearnMethodDetail.prototype.names;

/**
 * The description of this resource listed in different languages.
 * @type {!Array<!API.Client.MoveLearnMethodDescription>}
 * @export
 */
API.Client.MoveLearnMethodDetail.prototype.descriptions;

/**
 * A list of version groups where moves can be learned through this method.
 * @type {!Array<!API.Client.VersionGroupSummary>}
 * @export
 */
API.Client.MoveLearnMethodDetail.prototype.versionGroups;

