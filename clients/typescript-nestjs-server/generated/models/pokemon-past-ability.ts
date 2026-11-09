import { PokemonAbilityPast } from './pokemon-ability-past';
import { GenerationSummary } from './generation-summary';


export interface PokemonPastAbility { 
  /**
   * The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty.
   */
  abilities: Array<PokemonAbilityPast>;
  /**
   * The last generation in which the referenced pokémon had the listed abilities.
   */
  generation: GenerationSummary;
}

