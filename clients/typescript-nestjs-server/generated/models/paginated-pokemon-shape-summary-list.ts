import { PokemonShapeSummary } from './pokemon-shape-summary';


export interface PaginatedPokemonShapeSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<PokemonShapeSummary>;
}

