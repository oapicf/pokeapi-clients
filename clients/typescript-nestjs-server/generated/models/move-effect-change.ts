import { VersionGroupSummary } from './version-group-summary';
import { MoveEffectChangeEffectText } from './move-effect-change-effect-text';


export interface MoveEffectChange { 
  /**
   * The version group in which the previous effect of this ability originated.
   */
  version_group: VersionGroupSummary;
  /**
   * The previous effect of this ability listed in different languages.
   */
  readonly effect_entries: Array<MoveEffectChangeEffectText>;
}

