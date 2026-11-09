import { VersionGroupSummary } from './version-group-summary';
import { AbilityChangeEffectText } from './ability-change-effect-text';


export interface AbilityChange { 
  /**
   * The version group in which the previous effect of this ability originated.
   */
  version_group: VersionGroupSummary;
  /**
   * The previous effect of this ability listed in different languages.
   */
  readonly effect_entries: Array<AbilityChangeEffectText>;
}

