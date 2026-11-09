import { VersionSummary } from './version-summary';
import { LocationAreaEncounterDetail } from './location-area-encounter-detail';


export interface LocationAreaPokemonEncounterVersion { 
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
  encounter_details: Array<LocationAreaEncounterDetail>;
}

