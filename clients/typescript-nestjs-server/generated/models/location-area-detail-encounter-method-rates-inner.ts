import { LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner } from './location-area-detail-encounter-method-rates-inner-version-details-inner';
import { AbilityDetailPokemonInnerPokemon } from './ability-detail-pokemon-inner-pokemon';


export interface LocationAreaDetailEncounterMethodRatesInner { 
  encounter_method: AbilityDetailPokemonInnerPokemon;
  version_details: Array<LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner>;
}

