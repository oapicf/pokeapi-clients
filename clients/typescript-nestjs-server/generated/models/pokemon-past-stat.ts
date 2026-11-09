import { PokemonStat } from './pokemon-stat';
import { GenerationSummary } from './generation-summary';


export interface PokemonPastStat { 
  /**
   * The last generation in which the referenced pokémon had the listed stats.
   */
  generation: GenerationSummary;
  /**
   * The stat the Pokémon had up to and including the listed generation.
   */
  stats: Array<PokemonStat>;
}

