import { AbilityDetailPokemonInnerPokemon } from './ability-detail-pokemon-inner-pokemon';
import { EvolutionTriggerName } from './evolution-trigger-name';


export interface EvolutionTriggerDetail { 
  readonly id: number;
  name: string;
  readonly names: Array<EvolutionTriggerName>;
  readonly pokemon_species: Array<AbilityDetailPokemonInnerPokemon>;
}

