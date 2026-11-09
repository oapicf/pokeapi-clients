import { PokemonSummary } from './pokemon-summary';


export interface PokemonSpeciesVariety { 
  /**
   * Whether this variety is the default variety.
   */
  is_default: boolean;
  /**
   * The Pokémon variety.
   */
  pokemon: PokemonSummary;
}

