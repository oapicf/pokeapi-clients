#ifndef evolution_chain_detail_chain_TEST
#define evolution_chain_detail_chain_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define evolution_chain_detail_chain_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/evolution_chain_detail_chain.h"
evolution_chain_detail_chain_t* instantiate_evolution_chain_detail_chain(int include_optional);

#include "test_ability_detail_pokemon_inner_pokemon.c"


evolution_chain_detail_chain_t* instantiate_evolution_chain_detail_chain(int include_optional) {
  evolution_chain_detail_chain_t* evolution_chain_detail_chain = NULL;
  if (include_optional) {
    evolution_chain_detail_chain = evolution_chain_detail_chain_create(
      list_createList(),
      list_createList(),
      1,
       // false, not to have infinite recursion
      instantiate_ability_detail_pokemon_inner_pokemon(0)
    );
  } else {
    evolution_chain_detail_chain = evolution_chain_detail_chain_create(
      list_createList(),
      list_createList(),
      1,
      NULL
    );
  }

  return evolution_chain_detail_chain;
}


#ifdef evolution_chain_detail_chain_MAIN

void test_evolution_chain_detail_chain(int include_optional) {
    evolution_chain_detail_chain_t* evolution_chain_detail_chain_1 = instantiate_evolution_chain_detail_chain(include_optional);

	cJSON* jsonevolution_chain_detail_chain_1 = evolution_chain_detail_chain_convertToJSON(evolution_chain_detail_chain_1);
	printf("evolution_chain_detail_chain :\n%s\n", cJSON_Print(jsonevolution_chain_detail_chain_1));
	evolution_chain_detail_chain_t* evolution_chain_detail_chain_2 = evolution_chain_detail_chain_parseFromJSON(jsonevolution_chain_detail_chain_1);
	cJSON* jsonevolution_chain_detail_chain_2 = evolution_chain_detail_chain_convertToJSON(evolution_chain_detail_chain_2);
	printf("repeating evolution_chain_detail_chain:\n%s\n", cJSON_Print(jsonevolution_chain_detail_chain_2));
}

int main() {
  test_evolution_chain_detail_chain(1);
  test_evolution_chain_detail_chain(0);

  printf("Hello world \n");
  return 0;
}

#endif // evolution_chain_detail_chain_MAIN
#endif // evolution_chain_detail_chain_TEST
