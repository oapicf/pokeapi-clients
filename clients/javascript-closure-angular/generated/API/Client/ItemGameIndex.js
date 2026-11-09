goog.provide('API.Client.ItemGameIndex');

/**
 * @record
 */
API.Client.ItemGameIndex = function() {}

/**
 * The internal id of an API resource within game data.
 * @type {!number}
 * @export
 */
API.Client.ItemGameIndex.prototype.gameIndex;

/**
 * The generation relevent to this game index.
 * @type {!API.Client.GenerationSummary}
 * @export
 */
API.Client.ItemGameIndex.prototype.generation;

