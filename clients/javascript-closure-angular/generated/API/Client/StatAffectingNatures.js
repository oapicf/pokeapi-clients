goog.provide('API.Client.StatAffectingNatures');

/**
 * @record
 */
API.Client.StatAffectingNatures = function() {}

/**
 * A list of natures and how they change the referenced stat.
 * @type {!Array<!API.Client.NatureSummary>}
 * @export
 */
API.Client.StatAffectingNatures.prototype.increase;

/**
 * A list of nature sand how they change the referenced stat.
 * @type {!Array<!API.Client.NatureSummary>}
 * @export
 */
API.Client.StatAffectingNatures.prototype.decrease;

