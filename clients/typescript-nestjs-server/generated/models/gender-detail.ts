import { AbilityDetailPokemonInnerPokemon } from './ability-detail-pokemon-inner-pokemon';
import { GenderDetailPokemonSpeciesDetailsInner } from './gender-detail-pokemon-species-details-inner';


export interface GenderDetail { 
  readonly id: number;
  name: string;
  readonly pokemon_species_details: Array<GenderDetailPokemonSpeciesDetailsInner>;
  readonly required_for_evolution: Array<AbilityDetailPokemonInnerPokemon>;
}

