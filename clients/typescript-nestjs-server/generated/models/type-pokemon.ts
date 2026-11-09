import { PokemonSummary } from './pokemon-summary';


export interface TypePokemon { 
  /**
   * The order the Pokémon\'s types are listed in.
   */
  slot: number;
  /**
   * The Pokémon that has the referenced type.
   */
  pokemon: PokemonSummary;
}

