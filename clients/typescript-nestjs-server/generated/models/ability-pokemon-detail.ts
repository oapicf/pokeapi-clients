import { PokemonSummary } from './pokemon-summary';


export interface AbilityPokemonDetail { 
  /**
   * Whether or not this a hidden ability for the referenced Pokémon.
   */
  is_hidden?: boolean;
  /**
   * Pokémon have 3 ability \'slots\' which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon.
   */
  slot: number;
  /**
   * The Pokémon this ability could belong to.
   */
  pokemon: PokemonSummary;
}

