#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/evolution_chain_detail.h"
#include "../model/evolution_trigger_detail.h"
#include "../model/paginated_evolution_chain_summary_list.h"
#include "../model/paginated_evolution_trigger_summary_list.h"


// List evolution chains
//
// Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
//
paginated_evolution_chain_summary_list_t*
EvolutionAPI_evolutionChainList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get evolution chain
//
// Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
//
evolution_chain_detail_t*
EvolutionAPI_evolutionChainRetrieve(apiClient_t *apiClient, char *id);


// List evolution triggers
//
// Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
//
paginated_evolution_trigger_summary_list_t*
EvolutionAPI_evolutionTriggerList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get evolution trigger
//
// Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
//
evolution_trigger_detail_t*
EvolutionAPI_evolutionTriggerRetrieve(apiClient_t *apiClient, char *id);


