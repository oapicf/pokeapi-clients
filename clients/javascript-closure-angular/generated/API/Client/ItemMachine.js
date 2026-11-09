goog.provide('API.Client.ItemMachine');

/**
 * @record
 */
API.Client.ItemMachine = function() {}

/**
 * The machine that teaches a move from an item.
 * @type {!API.Client.MachineSummary}
 * @export
 */
API.Client.ItemMachine.prototype.machine;

/**
 * The version group of this specific machine.
 * @type {!API.Client.VersionGroupSummary}
 * @export
 */
API.Client.ItemMachine.prototype.versionGroup;

