import { EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner } from './evolution-chain-detail-chain-evolves-to-inner-evolution-details-inner';
import { AbilityDetailPokemonInnerPokemon } from './ability-detail-pokemon-inner-pokemon';


export interface EvolutionChainDetailChainEvolvesToInner { 
  evolution_details: Array<EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner>;
  is_baby: boolean;
  species: AbilityDetailPokemonInnerPokemon;
}

