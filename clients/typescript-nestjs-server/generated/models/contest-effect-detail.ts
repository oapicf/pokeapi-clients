import { ContestEffectEffectText } from './contest-effect-effect-text';
import { ContestEffectFlavorText } from './contest-effect-flavor-text';


export interface ContestEffectDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The base number of hearts the user of this move gets.
   */
  appeal: number;
  /**
   * The base number of hearts the user\'s opponent loses.
   */
  jam: number;
  /**
   * The result of this contest effect listed in different languages.
   */
  readonly effect_entries: Array<ContestEffectEffectText>;
  /**
   * The flavor text of this contest effect listed in different languages.
   */
  readonly flavor_text_entries: Array<ContestEffectFlavorText>;
}

