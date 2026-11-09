goog.provide('API.Client.LocationGameIndex');

/**
 * @record
 */
API.Client.LocationGameIndex = function() {}

/**
 * The internal id of an API resource within game data.
 * @type {!number}
 * @export
 */
API.Client.LocationGameIndex.prototype.gameIndex;

/**
 * The generation relevent to this game index.
 * @type {!API.Client.GenerationSummary}
 * @export
 */
API.Client.LocationGameIndex.prototype.generation;

