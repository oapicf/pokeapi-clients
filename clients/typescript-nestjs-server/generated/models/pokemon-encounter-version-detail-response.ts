import { VersionSummary } from './version-summary';
import { PokemonEncounterDetailResponse } from './pokemon-encounter-detail-response';


export interface PokemonEncounterVersionDetailResponse { 
  /**
   * The game version this encounter happens in.
   */
  version: VersionSummary;
  /**
   * The total percentage of all encounter potential.
   */
  max_chance: number;
  /**
   * A list of encounters and their specifics.
   */
  encounter_details: Array<PokemonEncounterDetailResponse>;
}

