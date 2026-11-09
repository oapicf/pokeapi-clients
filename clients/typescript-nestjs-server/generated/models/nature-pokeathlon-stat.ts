import { PokeathlonStatSummary } from './pokeathlon-stat-summary';


export interface NaturePokeathlonStat { 
  /**
   * The amount of change.
   */
  max_change: number;
  /**
   * The stat being affected.
   */
  pokeathlon_stat: PokeathlonStatSummary;
}

