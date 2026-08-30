import { LocationGameIndex } from './location-game-index';
import { RegionSummary } from './region-summary';
import { LocationAreaSummary } from './location-area-summary';
import { LocationName } from './location-name';


export interface LocationDetail { 
  readonly id: number;
  name: string;
  region: RegionSummary;
  readonly names: Array<LocationName>;
  readonly game_indices: Array<LocationGameIndex>;
  readonly areas: Array<LocationAreaSummary>;
}

