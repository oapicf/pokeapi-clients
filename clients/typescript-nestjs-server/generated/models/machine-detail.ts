import { VersionGroupSummary } from './version-group-summary';
import { MoveSummary } from './move-summary';
import { ItemSummary } from './item-summary';


export interface MachineDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The TM or HM item that corresponds to this machine.
   */
  item: ItemSummary;
  /**
   * The version group that this machine applies to.
   */
  version_group: VersionGroupSummary;
  /**
   * The move that is taught by this machine.
   */
  move: MoveSummary;
}

