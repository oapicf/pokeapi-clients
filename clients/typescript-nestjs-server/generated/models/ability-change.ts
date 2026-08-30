import { VersionGroupSummary } from './version-group-summary';
import { AbilityChangeEffectText } from './ability-change-effect-text';


export interface AbilityChange { 
  version_group: VersionGroupSummary;
  readonly effect_entries: Array<AbilityChangeEffectText>;
}

