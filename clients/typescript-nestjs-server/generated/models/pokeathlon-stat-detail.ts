import { PokeathlonStatName } from './pokeathlon-stat-name';
import { PokeathlonStatAffectingNatures } from './pokeathlon-stat-affecting-natures';


export interface PokeathlonStatDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * A detail of natures which affect this Pokéathlon stat positively or negatively.
   */
  readonly affecting_natures: PokeathlonStatAffectingNatures;
  /**
   * The name of this resource listed in different languages.
   */
  readonly names: Array<PokeathlonStatName>;
}

