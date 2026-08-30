import { AbilityDetailPokemonInnerPokemon } from './ability-detail-pokemon-inner-pokemon';
import { MoveDetailEffectChangesInnerEffectEntriesInner } from './move-detail-effect-changes-inner-effect-entries-inner';


export interface MoveDetailEffectChangesInner { 
  effect_entries: Array<MoveDetailEffectChangesInnerEffectEntriesInner>;
  version_group: AbilityDetailPokemonInnerPokemon;
}

