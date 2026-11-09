import { LocationAreaEncounterVersionDetail } from './location-area-encounter-version-detail';
import { EncounterMethodSummary } from './encounter-method-summary';


export interface LocationAreaEncounterRate { 
  /**
   * The method in which Pokémon may be encountered in an area..
   */
  encounter_method: EncounterMethodSummary;
  /**
   * The chance of the encounter to occur on a version of the game.
   */
  version_details: Array<LocationAreaEncounterVersionDetail>;
}

