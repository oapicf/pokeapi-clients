import { PokemonMoveVersionGroup } from './pokemon-move-version-group';
import { MoveSummary } from './move-summary';


export interface PokemonMove { 
  /**
   * The move the Pokémon can learn.
   */
  move: MoveSummary;
  /**
   * The details of the version in which the Pokémon can learn the move.
   */
  version_group_details: Array<PokemonMoveVersionGroup>;
}

