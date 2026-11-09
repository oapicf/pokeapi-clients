import { VersionGroupSummary } from './version-group-summary';
import { MachineSummary } from './machine-summary';


export interface ItemMachine { 
  /**
   * The machine that teaches a move from an item.
   */
  machine: MachineSummary;
  /**
   * The version group of this specific machine.
   */
  version_group: VersionGroupSummary;
}

