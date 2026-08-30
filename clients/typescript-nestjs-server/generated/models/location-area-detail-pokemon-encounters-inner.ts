import { AbilityDetailPokemonInnerPokemon } from './ability-detail-pokemon-inner-pokemon';
import { LocationAreaDetailPokemonEncountersInnerVersionDetailsInner } from './location-area-detail-pokemon-encounters-inner-version-details-inner';


export interface LocationAreaDetailPokemonEncountersInner { 
  pokemon: AbilityDetailPokemonInnerPokemon;
  version_details: Array<LocationAreaDetailPokemonEncountersInnerVersionDetailsInner>;
}

