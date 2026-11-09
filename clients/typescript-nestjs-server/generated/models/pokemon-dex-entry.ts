import { PokedexSummary } from './pokedex-summary';


export interface PokemonDexEntry { 
  /**
   * The index number within the Pokédex.
   */
  entry_number: number;
  /**
   * The Pokédex the referenced Pokémon species can be found in.
   */
  pokedex: PokedexSummary;
}

