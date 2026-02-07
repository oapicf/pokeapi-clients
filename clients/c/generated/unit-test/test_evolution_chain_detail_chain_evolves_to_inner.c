#ifndef evolution_chain_detail_chain_evolves_to_inner_TEST
#define evolution_chain_detail_chain_evolves_to_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define evolution_chain_detail_chain_evolves_to_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/evolution_chain_detail_chain_evolves_to_inner.h"
evolution_chain_detail_chain_evolves_to_inner_t* instantiate_evolution_chain_detail_chain_evolves_to_inner(int include_optional);

#include "test_ability_detail_pokemon_inner_pokemon.c"


evolution_chain_detail_chain_evolves_to_inner_t* instantiate_evolution_chain_detail_chain_evolves_to_inner(int include_optional) {
  evolution_chain_detail_chain_evolves_to_inner_t* evolution_chain_detail_chain_evolves_to_inner = NULL;
  if (include_optional) {
    evolution_chain_detail_chain_evolves_to_inner = evolution_chain_detail_chain_evolves_to_inner_create(
      list_createList(),
      1,
       // false, not to have infinite recursion
      instantiate_ability_detail_pokemon_inner_pokemon(0)
    );
  } else {
    evolution_chain_detail_chain_evolves_to_inner = evolution_chain_detail_chain_evolves_to_inner_create(
      list_createList(),
      1,
      NULL
    );
  }

  return evolution_chain_detail_chain_evolves_to_inner;
}


#ifdef evolution_chain_detail_chain_evolves_to_inner_MAIN

void test_evolution_chain_detail_chain_evolves_to_inner(int include_optional) {
    evolution_chain_detail_chain_evolves_to_inner_t* evolution_chain_detail_chain_evolves_to_inner_1 = instantiate_evolution_chain_detail_chain_evolves_to_inner(include_optional);

	cJSON* jsonevolution_chain_detail_chain_evolves_to_inner_1 = evolution_chain_detail_chain_evolves_to_inner_convertToJSON(evolution_chain_detail_chain_evolves_to_inner_1);
	printf("evolution_chain_detail_chain_evolves_to_inner :\n%s\n", cJSON_Print(jsonevolution_chain_detail_chain_evolves_to_inner_1));
	evolution_chain_detail_chain_evolves_to_inner_t* evolution_chain_detail_chain_evolves_to_inner_2 = evolution_chain_detail_chain_evolves_to_inner_parseFromJSON(jsonevolution_chain_detail_chain_evolves_to_inner_1);
	cJSON* jsonevolution_chain_detail_chain_evolves_to_inner_2 = evolution_chain_detail_chain_evolves_to_inner_convertToJSON(evolution_chain_detail_chain_evolves_to_inner_2);
	printf("repeating evolution_chain_detail_chain_evolves_to_inner:\n%s\n", cJSON_Print(jsonevolution_chain_detail_chain_evolves_to_inner_2));
}

int main() {
  test_evolution_chain_detail_chain_evolves_to_inner(1);
  test_evolution_chain_detail_chain_evolves_to_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // evolution_chain_detail_chain_evolves_to_inner_MAIN
#endif // evolution_chain_detail_chain_evolves_to_inner_TEST
