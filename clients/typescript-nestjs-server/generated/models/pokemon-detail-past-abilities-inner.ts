import { AbilityDetailPokemonInnerPokemon } from './ability-detail-pokemon-inner-pokemon';
import { PokemonDetailAbilitiesInner } from './pokemon-detail-abilities-inner';


export interface PokemonDetailPastAbilitiesInner { 
  abilities: Array<PokemonDetailAbilitiesInner>;
  generation: AbilityDetailPokemonInnerPokemon;
}

