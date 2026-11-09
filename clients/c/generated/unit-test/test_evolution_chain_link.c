#ifndef evolution_chain_link_TEST
#define evolution_chain_link_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define evolution_chain_link_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/evolution_chain_link.h"
evolution_chain_link_t* instantiate_evolution_chain_link(int include_optional);

#include "test_pokemon_species_summary.c"


evolution_chain_link_t* instantiate_evolution_chain_link(int include_optional) {
  evolution_chain_link_t* evolution_chain_link = NULL;
  if (include_optional) {
    evolution_chain_link = evolution_chain_link_create(
      1,
       // false, not to have infinite recursion
      instantiate_pokemon_species_summary(0),
      list_createList(),
      list_createList()
    );
  } else {
    evolution_chain_link = evolution_chain_link_create(
      1,
      NULL,
      list_createList(),
      list_createList()
    );
  }

  return evolution_chain_link;
}


#ifdef evolution_chain_link_MAIN

void test_evolution_chain_link(int include_optional) {
    evolution_chain_link_t* evolution_chain_link_1 = instantiate_evolution_chain_link(include_optional);

	cJSON* jsonevolution_chain_link_1 = evolution_chain_link_convertToJSON(evolution_chain_link_1);
	printf("evolution_chain_link :\n%s\n", cJSON_Print(jsonevolution_chain_link_1));
	evolution_chain_link_t* evolution_chain_link_2 = evolution_chain_link_parseFromJSON(jsonevolution_chain_link_1);
	cJSON* jsonevolution_chain_link_2 = evolution_chain_link_convertToJSON(evolution_chain_link_2);
	printf("repeating evolution_chain_link:\n%s\n", cJSON_Print(jsonevolution_chain_link_2));
}

int main() {
  test_evolution_chain_link(1);
  test_evolution_chain_link(0);

  printf("Hello world \n");
  return 0;
}

#endif // evolution_chain_link_MAIN
#endif // evolution_chain_link_TEST
