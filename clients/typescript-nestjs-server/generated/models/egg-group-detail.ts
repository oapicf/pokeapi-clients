import { EggGroupName } from './egg-group-name';
import { EggGroupDetailPokemonSpeciesInner } from './egg-group-detail-pokemon-species-inner';


export interface EggGroupDetail { 
  readonly id: number;
  name: string;
  readonly names: Array<EggGroupName>;
  readonly pokemon_species: Array<EggGroupDetailPokemonSpeciesInner>;
}

