import { AbilityDetailPokemonInnerPokemon } from './ability-detail-pokemon-inner-pokemon';
import { EvolutionChainDetailChainEvolvesToInner } from './evolution-chain-detail-chain-evolves-to-inner';


export interface EvolutionChainDetailChain { 
  evolution_details: Array<any>;
  evolves_to: Array<EvolutionChainDetailChainEvolvesToInner>;
  is_baby: boolean;
  species: AbilityDetailPokemonInnerPokemon;
}

