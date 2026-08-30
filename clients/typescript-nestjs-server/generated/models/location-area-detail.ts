import { LocationAreaName } from './location-area-name';
import { LocationSummary } from './location-summary';
import { LocationAreaDetailPokemonEncountersInner } from './location-area-detail-pokemon-encounters-inner';
import { LocationAreaDetailEncounterMethodRatesInner } from './location-area-detail-encounter-method-rates-inner';


export interface LocationAreaDetail { 
  readonly id: number;
  name: string;
  game_index: number;
  readonly encounter_method_rates: Array<LocationAreaDetailEncounterMethodRatesInner>;
  location: LocationSummary;
  readonly names: Array<LocationAreaName>;
  readonly pokemon_encounters: Array<LocationAreaDetailPokemonEncountersInner>;
}

