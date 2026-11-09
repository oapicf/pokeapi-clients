import { SuperContestEffectFlavorText } from './super-contest-effect-flavor-text';
import { MoveSummary } from './move-summary';


export interface SuperContestEffectDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The level of appeal this super contest effect has.
   */
  appeal: number;
  /**
   * The flavor text of this super contest effect listed in different languages.
   */
  readonly flavor_text_entries: Array<SuperContestEffectFlavorText>;
  /**
   * A list of moves that have the effect when used in super contests.
   */
  readonly moves: Array<MoveSummary>;
}

