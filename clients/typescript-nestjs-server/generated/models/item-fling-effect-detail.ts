import { ItemSummary } from './item-summary';
import { ItemFlingEffectEffectText } from './item-fling-effect-effect-text';


export interface ItemFlingEffectDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * The result of this fling effect listed in different languages.
   */
  readonly effect_entries: Array<ItemFlingEffectEffectText>;
  /**
   * A list of items that have this fling effect.
   */
  readonly items: Array<ItemSummary>;
}

