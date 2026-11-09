import { PokeathlonStatAffectingNature } from './pokeathlon-stat-affecting-nature';


export interface PokeathlonStatAffectingNatures { 
  /**
   * A list of natures and how they change the referenced Pokéathlon stat.
   */
  increase: Array<PokeathlonStatAffectingNature>;
  /**
   * A list of natures and how they change the referenced Pokéathlon stat.
   */
  decrease: Array<PokeathlonStatAffectingNature>;
}

