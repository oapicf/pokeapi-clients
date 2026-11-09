import { VersionSummary } from './version-summary';


export interface LocationAreaEncounterVersionDetail { 
  /**
   * The chance of an encounter to occur.
   */
  rate: number;
  /**
   * The version of the game in which the encounter can occur with the given chance.
   */
  version: VersionSummary;
}

