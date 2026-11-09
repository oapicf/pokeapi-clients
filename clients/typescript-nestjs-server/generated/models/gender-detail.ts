import { PokemonSpeciesSummary } from './pokemon-species-summary';
import { GenderPokemonSpecies } from './gender-pokemon-species';


export interface GenderDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * A list of Pokémon species that can be this gender and how likely it is that they will be.
   */
  readonly pokemon_species_details: Array<GenderPokemonSpecies>;
  /**
   * A list of Pokémon species that required this gender in order for a Pokémon to evolve into them.
   */
  readonly required_for_evolution: Array<PokemonSpeciesSummary>;
}

