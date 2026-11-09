import { PokemonType } from './pokemon-type';
import { GenerationSummary } from './generation-summary';


export interface PokemonPastType { 
  /**
   * The last generation in which the referenced pokémon had the listed types.
   */
  generation: GenerationSummary;
  /**
   * The types the referenced pokémon had up to and including the listed generation.
   */
  types: Array<PokemonType>;
}

