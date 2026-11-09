import { PokemonColorSummary } from './pokemon-color-summary';


export interface PaginatedPokemonColorSummaryList { 
  /**
   * The total number of resources available from this API.
   */
  count: number;
  /**
   * The URL for the next page in the list, or null if there is no next page.
   */
  next?: string | null;
  /**
   * The URL for the previous page in the list, or null if there is no previous page.
   */
  previous?: string | null;
  /**
   * A list of API resources on this page.
   */
  results: Array<PokemonColorSummary>;
}

