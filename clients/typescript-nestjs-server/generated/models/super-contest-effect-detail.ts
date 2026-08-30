import { SuperContestEffectFlavorText } from './super-contest-effect-flavor-text';
import { MoveSummary } from './move-summary';


export interface SuperContestEffectDetail { 
  readonly id: number;
  appeal: number;
  readonly flavor_text_entries: Array<SuperContestEffectFlavorText>;
  readonly moves: Array<MoveSummary>;
}

