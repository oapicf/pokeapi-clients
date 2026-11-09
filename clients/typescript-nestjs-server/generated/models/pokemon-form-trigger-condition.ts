import { PokemonFormSummary } from './pokemon-form-summary';


export interface PokemonFormTriggerCondition { 
  /**
   * The trigger for this form change.
   */
  trigger: string;
  /**
   * The name of the required item, ability, or move. Only present for a resource-based trigger.
   */
  name?: string;
  /**
   * The URL of the required item, ability, or move. Only present for a resource-based trigger.
   */
  url?: string;
  /**
   * The required base form. Only present when the trigger specifies one.
   */
  base_form?: PokemonFormSummary;
}

