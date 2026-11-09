goog.provide('API.Client.MachineDetail');

/**
 * @record
 */
API.Client.MachineDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.MachineDetail.prototype.id;

/**
 * The TM or HM item that corresponds to this machine.
 * @type {!API.Client.ItemSummary}
 * @export
 */
API.Client.MachineDetail.prototype.item;

/**
 * The version group that this machine applies to.
 * @type {!API.Client.VersionGroupSummary}
 * @export
 */
API.Client.MachineDetail.prototype.versionGroup;

/**
 * The move that is taught by this machine.
 * @type {!API.Client.MoveSummary}
 * @export
 */
API.Client.MachineDetail.prototype.move;

