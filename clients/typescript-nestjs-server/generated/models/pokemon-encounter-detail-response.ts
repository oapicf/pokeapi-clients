import { EncounterMethodSummary } from './encounter-method-summary';
import { EncounterConditionValueSummary } from './encounter-condition-value-summary';


export interface PokemonEncounterDetailResponse { 
  /**
   * Percent chance that this encounter will occur.
   */
  chance: number;
  /**
   * A list of condition values that must be in effect for this encounter to occur.
   */
  condition_values: Array<EncounterConditionValueSummary>;
  /**
   * The highest level the Pokémon could be encountered at.
   */
  max_level: number;
  /**
   * The method by which this encounter happens.
   */
  method: EncounterMethodSummary;
  /**
   * The lowest level the Pokémon could be encountered at.
   */
  min_level: number;
}

