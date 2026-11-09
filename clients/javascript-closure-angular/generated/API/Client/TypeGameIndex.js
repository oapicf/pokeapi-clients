goog.provide('API.Client.TypeGameIndex');

/**
 * @record
 */
API.Client.TypeGameIndex = function() {}

/**
 * The internal id of an API resource within game data.
 * @type {!number}
 * @export
 */
API.Client.TypeGameIndex.prototype.gameIndex;

/**
 * The generation relevent to this game index.
 * @type {!API.Client.GenerationSummary}
 * @export
 */
API.Client.TypeGameIndex.prototype.generation;

