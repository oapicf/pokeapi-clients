import { PokemonDetailTypesInner } from './pokemon-detail-types-inner';
import { AbilityDetailPokemonInnerPokemon } from './ability-detail-pokemon-inner-pokemon';


export interface PokemonDetailPastTypesInner { 
  generation: AbilityDetailPokemonInnerPokemon;
  types: Array<PokemonDetailTypesInner>;
}

