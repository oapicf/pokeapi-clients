import { PalParkAreaDetailPokemonEncountersInner } from './pal-park-area-detail-pokemon-encounters-inner';
import { PalParkAreaName } from './pal-park-area-name';


export interface PalParkAreaDetail { 
  readonly id: number;
  name: string;
  readonly names: Array<PalParkAreaName>;
  readonly pokemon_encounters: Array<PalParkAreaDetailPokemonEncountersInner>;
}

