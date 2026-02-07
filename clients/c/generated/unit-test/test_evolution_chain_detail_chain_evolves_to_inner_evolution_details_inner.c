#ifndef evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_TEST
#define evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner.h"
evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_t* instantiate_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner(int include_optional);

#include "test_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender.c"
#include "test_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender.c"
#include "test_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender.c"
#include "test_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender.c"
#include "test_ability_detail_pokemon_inner_pokemon.c"


evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_t* instantiate_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner(int include_optional) {
  evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_t* evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner = NULL;
  if (include_optional) {
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner = evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_create(
       // false, not to have infinite recursion
      instantiate_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender(0),
       // false, not to have infinite recursion
      instantiate_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender(0),
       // false, not to have infinite recursion
      instantiate_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender(0),
      null,
      null,
       // false, not to have infinite recursion
      instantiate_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender(0),
      56,
      56,
      56,
      56,
      1,
      "0",
      "0",
      "0",
      "0",
      "0",
       // false, not to have infinite recursion
      instantiate_ability_detail_pokemon_inner_pokemon(0),
      1
    );
  } else {
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner = evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_create(
      NULL,
      NULL,
      NULL,
      null,
      null,
      NULL,
      56,
      56,
      56,
      56,
      1,
      "0",
      "0",
      "0",
      "0",
      "0",
      NULL,
      1
    );
  }

  return evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner;
}


#ifdef evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_MAIN

void test_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner(int include_optional) {
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_t* evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_1 = instantiate_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner(include_optional);

	cJSON* jsonevolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_1 = evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_convertToJSON(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_1);
	printf("evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner :\n%s\n", cJSON_Print(jsonevolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_1));
	evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_t* evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_2 = evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_parseFromJSON(jsonevolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_1);
	cJSON* jsonevolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_2 = evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_convertToJSON(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_2);
	printf("repeating evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner:\n%s\n", cJSON_Print(jsonevolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_2));
}

int main() {
  test_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner(1);
  test_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_MAIN
#endif // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_TEST
