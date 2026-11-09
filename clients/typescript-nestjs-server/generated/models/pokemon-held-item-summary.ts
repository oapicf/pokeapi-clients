import { PokemonHeldItemVersion } from './pokemon-held-item-version';
import { ItemSummary } from './item-summary';


export interface PokemonHeldItemSummary { 
  /**
   * The item the referenced Pokémon holds.
   */
  item: ItemSummary;
  /**
   * The details of the different versions in which the item is held.
   */
  version_details: Array<PokemonHeldItemVersion>;
}

