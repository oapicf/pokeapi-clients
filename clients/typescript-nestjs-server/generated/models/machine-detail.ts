import { VersionGroupSummary } from './version-group-summary';
import { MoveSummary } from './move-summary';
import { ItemSummary } from './item-summary';


export interface MachineDetail { 
  readonly id: number;
  item: ItemSummary;
  version_group: VersionGroupSummary;
  move: MoveSummary;
}

