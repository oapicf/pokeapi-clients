import { TypeRelationships } from './type-relationships';
import { GenerationSummary } from './generation-summary';


export interface TypePastRelationships { 
  /**
   * The last generation in which the referenced type had the listed damage relations
   */
  generation: GenerationSummary;
  /**
   * The damage relations the referenced type had up to and including the listed generation
   */
  damage_relations: TypeRelationships;
}

