#ifndef pokeathlon_stat_detail_affecting_natures_decrease_inner_TEST
#define pokeathlon_stat_detail_affecting_natures_decrease_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokeathlon_stat_detail_affecting_natures_decrease_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokeathlon_stat_detail_affecting_natures_decrease_inner.h"
pokeathlon_stat_detail_affecting_natures_decrease_inner_t* instantiate_pokeathlon_stat_detail_affecting_natures_decrease_inner(int include_optional);

#include "test_ability_detail_pokemon_inner_pokemon.c"


pokeathlon_stat_detail_affecting_natures_decrease_inner_t* instantiate_pokeathlon_stat_detail_affecting_natures_decrease_inner(int include_optional) {
  pokeathlon_stat_detail_affecting_natures_decrease_inner_t* pokeathlon_stat_detail_affecting_natures_decrease_inner = NULL;
  if (include_optional) {
    pokeathlon_stat_detail_affecting_natures_decrease_inner = pokeathlon_stat_detail_affecting_natures_decrease_inner_create(
      56,
       // false, not to have infinite recursion
      instantiate_ability_detail_pokemon_inner_pokemon(0)
    );
  } else {
    pokeathlon_stat_detail_affecting_natures_decrease_inner = pokeathlon_stat_detail_affecting_natures_decrease_inner_create(
      56,
      NULL
    );
  }

  return pokeathlon_stat_detail_affecting_natures_decrease_inner;
}


#ifdef pokeathlon_stat_detail_affecting_natures_decrease_inner_MAIN

void test_pokeathlon_stat_detail_affecting_natures_decrease_inner(int include_optional) {
    pokeathlon_stat_detail_affecting_natures_decrease_inner_t* pokeathlon_stat_detail_affecting_natures_decrease_inner_1 = instantiate_pokeathlon_stat_detail_affecting_natures_decrease_inner(include_optional);

	cJSON* jsonpokeathlon_stat_detail_affecting_natures_decrease_inner_1 = pokeathlon_stat_detail_affecting_natures_decrease_inner_convertToJSON(pokeathlon_stat_detail_affecting_natures_decrease_inner_1);
	printf("pokeathlon_stat_detail_affecting_natures_decrease_inner :\n%s\n", cJSON_Print(jsonpokeathlon_stat_detail_affecting_natures_decrease_inner_1));
	pokeathlon_stat_detail_affecting_natures_decrease_inner_t* pokeathlon_stat_detail_affecting_natures_decrease_inner_2 = pokeathlon_stat_detail_affecting_natures_decrease_inner_parseFromJSON(jsonpokeathlon_stat_detail_affecting_natures_decrease_inner_1);
	cJSON* jsonpokeathlon_stat_detail_affecting_natures_decrease_inner_2 = pokeathlon_stat_detail_affecting_natures_decrease_inner_convertToJSON(pokeathlon_stat_detail_affecting_natures_decrease_inner_2);
	printf("repeating pokeathlon_stat_detail_affecting_natures_decrease_inner:\n%s\n", cJSON_Print(jsonpokeathlon_stat_detail_affecting_natures_decrease_inner_2));
}

int main() {
  test_pokeathlon_stat_detail_affecting_natures_decrease_inner(1);
  test_pokeathlon_stat_detail_affecting_natures_decrease_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokeathlon_stat_detail_affecting_natures_decrease_inner_MAIN
#endif // pokeathlon_stat_detail_affecting_natures_decrease_inner_TEST
