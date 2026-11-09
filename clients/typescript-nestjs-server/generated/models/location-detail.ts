import { LocationGameIndex } from './location-game-index';
import { RegionSummary } from './region-summary';
import { LocationAreaSummary } from './location-area-summary';
import { LocationName } from './location-name';


export interface LocationDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * The region this location can be found in.
   */
  region: RegionSummary | null;
  /**
   * The name of this resource listed in different languages.
   */
  readonly names: Array<LocationName>;
  /**
   * A list of game indices relevent to this location by generation.
   */
  readonly game_indices: Array<LocationGameIndex>;
  /**
   * Areas that can be found within this location.
   */
  readonly areas: Array<LocationAreaSummary>;
}

