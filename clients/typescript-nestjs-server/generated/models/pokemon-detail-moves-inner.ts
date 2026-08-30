import { PokemonDetailMovesInnerVersionGroupDetailsInner } from './pokemon-detail-moves-inner-version-group-details-inner';
import { AbilityDetailPokemonInnerPokemon } from './ability-detail-pokemon-inner-pokemon';


export interface PokemonDetailMovesInner { 
  move: AbilityDetailPokemonInnerPokemon;
  version_group_details: Array<PokemonDetailMovesInnerVersionGroupDetailsInner>;
}

