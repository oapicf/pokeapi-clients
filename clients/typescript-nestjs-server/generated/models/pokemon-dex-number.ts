import { PokemonSpeciesSummary } from './pokemon-species-summary';


export interface PokemonDexNumber { 
  /**
   * The index of this Pokémon species entry within the Pokédex.
   */
  entry_number: number;
  /**
   * The Pokémon species being encountered.
   */
  pokemon_species: PokemonSpeciesSummary;
}

