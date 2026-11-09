import { VersionGroupSummary } from './version-group-summary';
import { MoveEffectEffectText } from './move-effect-effect-text';
import { TypeSummary } from './type-summary';


export interface MoveChange { 
  /**
   * The percent value of how likely this move is to be successful.
   */
  accuracy?: number | null;
  /**
   * The base power before the listed version group, or null if power did not change.
   */
  power?: number | null;
  /**
   * Power points. The number of times this move can be used.
   */
  pp?: number | null;
  /**
   * The percent value of how likely it is this moves effect will take effect.
   */
  effect_chance: number | null;
  /**
   * The effect of this move listed in different languages.
   */
  readonly effect_entries: Array<MoveEffectEffectText>;
  /**
   * The elemental type of this move.
   */
  type: TypeSummary | null;
  /**
   * The version group in which these move stat values were in effect.
   */
  version_group: VersionGroupSummary;
}

