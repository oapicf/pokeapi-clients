goog.provide('API.Client.Experience');

/**
 * @record
 */
API.Client.Experience = function() {}

/**
 * The level gained.
 * @type {!number}
 * @export
 */
API.Client.Experience.prototype.level;

/**
 * The amount of experience required to reach the referenced level.
 * @type {!number}
 * @export
 */
API.Client.Experience.prototype.experience;

