goog.provide('API.Client.MachineDetail');

/**
 * @record
 */
API.Client.MachineDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.MachineDetail.prototype.id;

/**
 * @type {!API.Client.ItemSummary}
 * @export
 */
API.Client.MachineDetail.prototype.item;

/**
 * @type {!API.Client.VersionGroupSummary}
 * @export
 */
API.Client.MachineDetail.prototype.versionGroup;

/**
 * @type {!API.Client.MoveSummary}
 * @export
 */
API.Client.MachineDetail.prototype.move;

