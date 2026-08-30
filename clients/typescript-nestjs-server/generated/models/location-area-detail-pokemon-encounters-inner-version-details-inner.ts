import { LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails } from './location-area-detail-pokemon-encounters-inner-version-details-inner-encounter-details';
import { AbilityDetailPokemonInnerPokemon } from './ability-detail-pokemon-inner-pokemon';


export interface LocationAreaDetailPokemonEncountersInnerVersionDetailsInner { 
  version: AbilityDetailPokemonInnerPokemon;
  max_chance: number;
  encounter_details: LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails;
}

