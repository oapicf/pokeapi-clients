import { EncounterMethodSummary } from './encounter-method-summary';
import { EncounterPokemonDetail } from './encounter-pokemon-detail';
import { EncounterConditionValueSummary } from './encounter-condition-value-summary';


export interface LocationAreaEncounterDetail { 
  /**
   * The lowest level the Pokémon could be encountered at.
   */
  min_level: number;
  /**
   * The highest level the Pokémon could be encountered at.
   */
  max_level: number;
  /**
   * Percent chance that this encounter will occur.
   */
  chance?: number;
  /**
   * The method by which this encounter happens.
   */
  method?: EncounterMethodSummary;
  /**
   * A list of condition values that must be in effect for this encounter to occur.
   */
  readonly condition_values: Array<EncounterConditionValueSummary>;
  /**
   * Additional properties of the encountered Pokémon, or null if unspecified.
   */
  readonly pokemon_details: EncounterPokemonDetail | null;
}

