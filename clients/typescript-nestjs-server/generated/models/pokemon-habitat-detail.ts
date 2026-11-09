import { PokemonHabitatName } from './pokemon-habitat-name';
import { PokemonSpeciesSummary } from './pokemon-species-summary';


export interface PokemonHabitatDetail { 
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
  readonly names: Array<PokemonHabitatName>;
  /**
   * A list of the Pokémon species that can be found in this habitat.
   */
  readonly pokemon_species: Array<PokemonSpeciesSummary>;
}

