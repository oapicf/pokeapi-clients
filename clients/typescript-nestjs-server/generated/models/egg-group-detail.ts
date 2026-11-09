import { EggGroupName } from './egg-group-name';
import { PokemonSpeciesSummary } from './pokemon-species-summary';


export interface EggGroupDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * The name of this resource listed in different languages.
   */
  readonly names: Array<EggGroupName>;
  /**
   * A list of all Pokémon species that are members of this egg group.
   */
  readonly pokemon_species: Array<PokemonSpeciesSummary>;
}

