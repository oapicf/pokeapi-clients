import { PokemonEncounterVersionDetailResponse } from './pokemon-encounter-version-detail-response';
import { LocationAreaSummary } from './location-area-summary';


export interface PokemonEncounterResponse { 
  /**
   * The location area the referenced Pokémon can be encountered in.
   */
  location_area: LocationAreaSummary;
  /**
   * A list of versions and encounters with the referenced Pokémon that might happen.
   */
  version_details: Array<PokemonEncounterVersionDetailResponse>;
}

