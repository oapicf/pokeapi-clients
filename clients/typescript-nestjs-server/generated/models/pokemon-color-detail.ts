import { PokemonColorName } from './pokemon-color-name';
import { PokemonSpeciesSummary } from './pokemon-species-summary';


export interface PokemonColorDetail { 
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
  readonly names: Array<PokemonColorName>;
  /**
   * A list of the Pokémon species that have this color.
   */
  readonly pokemon_species: Array<PokemonSpeciesSummary>;
}

