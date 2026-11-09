import { PokemonSpeciesSummary } from './pokemon-species-summary';


export interface PalParkEncounter { 
  /**
   * The base score given to the player when this Pokémon is caught during a pal park run.
   */
  base_score?: number | null;
  /**
   * The base rate for encountering this Pokémon in this pal park area.
   */
  rate: number;
  /**
   * The Pokémon species being encountered.
   */
  pokemon_species: PokemonSpeciesSummary;
}

