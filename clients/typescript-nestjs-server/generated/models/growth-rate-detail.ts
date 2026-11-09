import { Experience } from './experience';
import { GrowthRateDescription } from './growth-rate-description';
import { PokemonSpeciesSummary } from './pokemon-species-summary';


export interface GrowthRateDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * The formula used to calculate the rate at which the Pokémon species gains level.
   */
  formula: string;
  /**
   * The descriptions of this characteristic listed in different languages.
   */
  readonly descriptions: Array<GrowthRateDescription>;
  /**
   * A list of levels and the amount of experienced needed to atain them based on this growth rate.
   */
  readonly levels: Array<Experience>;
  /**
   * A list of Pokémon species that gain levels at this growth rate.
   */
  readonly pokemon_species: Array<PokemonSpeciesSummary>;
}

