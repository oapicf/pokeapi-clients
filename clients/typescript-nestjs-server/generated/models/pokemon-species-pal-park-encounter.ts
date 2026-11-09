import { PalParkAreaSummary } from './pal-park-area-summary';


export interface PokemonSpeciesPalParkEncounter { 
  /**
   * The base score given to the player when the referenced Pokémon is caught during a pal park run.
   */
  base_score?: number | null;
  /**
   * The base rate for encountering the referenced Pokémon in this pal park area.
   */
  rate: number;
  /**
   * The pal park area where this encounter happens.
   */
  area: PalParkAreaSummary;
}

