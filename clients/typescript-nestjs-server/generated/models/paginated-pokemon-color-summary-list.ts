import { PokemonColorSummary } from './pokemon-color-summary';


export interface PaginatedPokemonColorSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<PokemonColorSummary>;
}

