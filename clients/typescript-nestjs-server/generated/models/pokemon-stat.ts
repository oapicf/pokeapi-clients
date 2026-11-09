import { StatSummary } from './stat-summary';


export interface PokemonStat { 
  /**
   * The base value of the stat.
   */
  base_stat: number;
  /**
   * The effort points (EV) the Pokémon has in the stat.
   */
  effort: number;
  /**
   * The stat the Pokémon has.
   */
  stat: StatSummary;
}

