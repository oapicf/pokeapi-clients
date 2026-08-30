import { EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender } from './evolution-chain-detail-chain-evolves-to-inner-evolution-details-inner-gender';
import { AbilityDetailPokemonInnerPokemon } from './ability-detail-pokemon-inner-pokemon';


export interface EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner { 
  gender: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender;
  held_item: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender;
  item: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender;
  known_move: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender;
  known_move_type: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender;
  location: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender;
  min_affection: number;
  min_beauty: number;
  min_happiness: number;
  min_level: number;
  needs_overworld_rain: boolean;
  party_species: string;
  party_type: string;
  relative_physical_stats: string;
  time_of_day: string;
  trade_species: string;
  trigger: AbilityDetailPokemonInnerPokemon;
  turn_upside_down: boolean;
}

