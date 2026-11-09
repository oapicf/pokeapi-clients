import { NatureSummary } from './nature-summary';


export interface PokeathlonStatAffectingNature { 
  /**
   * The maximum amount of change to the referenced Pokéathlon stat.
   */
  max_change: number;
  /**
   * The nature causing the change.
   */
  nature: NatureSummary;
}

