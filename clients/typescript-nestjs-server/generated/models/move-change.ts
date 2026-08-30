import { MoveChangeEffectEntriesInner } from './move-change-effect-entries-inner';
import { VersionGroupSummary } from './version-group-summary';
import { TypeSummary } from './type-summary';


export interface MoveChange { 
  accuracy?: number | null;
  power?: number | null;
  pp?: number | null;
  effect_chance: number;
  readonly effect_entries: Array<MoveChangeEffectEntriesInner>;
  type: TypeSummary;
  version_group: VersionGroupSummary;
}

