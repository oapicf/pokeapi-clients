import { AbilityDetailPokemonInner } from './ability-detail-pokemon-inner';
import { AbilityName } from './ability-name';
import { GenerationSummary } from './generation-summary';
import { AbilityChange } from './ability-change';
import { AbilityEffectText } from './ability-effect-text';
import { AbilityFlavorText } from './ability-flavor-text';


export interface AbilityDetail { 
  readonly id: number;
  name: string;
  is_main_series?: boolean;
  generation: GenerationSummary;
  readonly names: Array<AbilityName>;
  readonly effect_entries: Array<AbilityEffectText>;
  readonly effect_changes: Array<AbilityChange>;
  readonly flavor_text_entries: Array<AbilityFlavorText>;
  readonly pokemon: Array<AbilityDetailPokemonInner>;
}

