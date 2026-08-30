import { ItemSummary } from './item-summary';
import { ItemFlingEffectEffectText } from './item-fling-effect-effect-text';


export interface ItemFlingEffectDetail { 
  readonly id: number;
  name: string;
  readonly effect_entries: Array<ItemFlingEffectEffectText>;
  readonly items: Array<ItemSummary>;
}

