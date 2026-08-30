import { MoveMetaCategoryDescription } from './move-meta-category-description';
import { AbilityDetailPokemonInnerPokemon } from './ability-detail-pokemon-inner-pokemon';


export interface MoveMetaCategoryDetail { 
  readonly id: number;
  name: string;
  readonly descriptions: Array<MoveMetaCategoryDescription>;
  readonly moves: Array<AbilityDetailPokemonInnerPokemon>;
}

