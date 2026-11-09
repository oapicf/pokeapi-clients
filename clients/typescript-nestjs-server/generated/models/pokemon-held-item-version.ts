import { VersionSummary } from './version-summary';


export interface PokemonHeldItemVersion { 
  /**
   * How often the item is held.
   */
  rarity: number;
  /**
   * The version in which the item is held.
   */
  version: VersionSummary;
}

