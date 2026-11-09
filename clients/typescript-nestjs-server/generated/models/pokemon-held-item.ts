import { PokemonHeldItemVersion } from './pokemon-held-item-version';
import { PokemonSummary } from './pokemon-summary';


export interface PokemonHeldItem { 
  /**
   * The Pokémon that holds this item.
   */
  pokemon: PokemonSummary;
  /**
   * The details for the version that this item is held in by the Pokémon.
   */
  version_details: Array<PokemonHeldItemVersion>;
}

