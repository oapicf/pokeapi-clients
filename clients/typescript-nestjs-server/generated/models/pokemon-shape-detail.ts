import { PokemonShapeDetailAwesomeNamesInner } from './pokemon-shape-detail-awesome-names-inner';
import { PokemonSpeciesSummary } from './pokemon-species-summary';
import { PokemonShapeDetailNamesInner } from './pokemon-shape-detail-names-inner';


export interface PokemonShapeDetail { 
  readonly id: number;
  name: string;
  readonly awesome_names: Array<PokemonShapeDetailAwesomeNamesInner>;
  readonly names: Array<PokemonShapeDetailNamesInner>;
  readonly pokemon_species: Array<PokemonSpeciesSummary>;
}

