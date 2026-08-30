import { ContestEffectEffectText } from './contest-effect-effect-text';
import { ContestEffectFlavorText } from './contest-effect-flavor-text';


export interface ContestEffectDetail { 
  readonly id: number;
  appeal: number;
  jam: number;
  readonly effect_entries: Array<ContestEffectEffectText>;
  readonly flavor_text_entries: Array<ContestEffectFlavorText>;
}

