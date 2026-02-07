#ifndef nature_detail_pokeathlon_stat_changes_inner_TEST
#define nature_detail_pokeathlon_stat_changes_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define nature_detail_pokeathlon_stat_changes_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/nature_detail_pokeathlon_stat_changes_inner.h"
nature_detail_pokeathlon_stat_changes_inner_t* instantiate_nature_detail_pokeathlon_stat_changes_inner(int include_optional);

#include "test_ability_detail_pokemon_inner_pokemon.c"


nature_detail_pokeathlon_stat_changes_inner_t* instantiate_nature_detail_pokeathlon_stat_changes_inner(int include_optional) {
  nature_detail_pokeathlon_stat_changes_inner_t* nature_detail_pokeathlon_stat_changes_inner = NULL;
  if (include_optional) {
    nature_detail_pokeathlon_stat_changes_inner = nature_detail_pokeathlon_stat_changes_inner_create(
      56,
       // false, not to have infinite recursion
      instantiate_ability_detail_pokemon_inner_pokemon(0)
    );
  } else {
    nature_detail_pokeathlon_stat_changes_inner = nature_detail_pokeathlon_stat_changes_inner_create(
      56,
      NULL
    );
  }

  return nature_detail_pokeathlon_stat_changes_inner;
}


#ifdef nature_detail_pokeathlon_stat_changes_inner_MAIN

void test_nature_detail_pokeathlon_stat_changes_inner(int include_optional) {
    nature_detail_pokeathlon_stat_changes_inner_t* nature_detail_pokeathlon_stat_changes_inner_1 = instantiate_nature_detail_pokeathlon_stat_changes_inner(include_optional);

	cJSON* jsonnature_detail_pokeathlon_stat_changes_inner_1 = nature_detail_pokeathlon_stat_changes_inner_convertToJSON(nature_detail_pokeathlon_stat_changes_inner_1);
	printf("nature_detail_pokeathlon_stat_changes_inner :\n%s\n", cJSON_Print(jsonnature_detail_pokeathlon_stat_changes_inner_1));
	nature_detail_pokeathlon_stat_changes_inner_t* nature_detail_pokeathlon_stat_changes_inner_2 = nature_detail_pokeathlon_stat_changes_inner_parseFromJSON(jsonnature_detail_pokeathlon_stat_changes_inner_1);
	cJSON* jsonnature_detail_pokeathlon_stat_changes_inner_2 = nature_detail_pokeathlon_stat_changes_inner_convertToJSON(nature_detail_pokeathlon_stat_changes_inner_2);
	printf("repeating nature_detail_pokeathlon_stat_changes_inner:\n%s\n", cJSON_Print(jsonnature_detail_pokeathlon_stat_changes_inner_2));
}

int main() {
  test_nature_detail_pokeathlon_stat_changes_inner(1);
  test_nature_detail_pokeathlon_stat_changes_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // nature_detail_pokeathlon_stat_changes_inner_MAIN
#endif // nature_detail_pokeathlon_stat_changes_inner_TEST
