#ifndef stat_detail_affecting_moves_increase_inner_TEST
#define stat_detail_affecting_moves_increase_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define stat_detail_affecting_moves_increase_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/stat_detail_affecting_moves_increase_inner.h"
stat_detail_affecting_moves_increase_inner_t* instantiate_stat_detail_affecting_moves_increase_inner(int include_optional);

#include "test_ability_detail_pokemon_inner_pokemon.c"


stat_detail_affecting_moves_increase_inner_t* instantiate_stat_detail_affecting_moves_increase_inner(int include_optional) {
  stat_detail_affecting_moves_increase_inner_t* stat_detail_affecting_moves_increase_inner = NULL;
  if (include_optional) {
    stat_detail_affecting_moves_increase_inner = stat_detail_affecting_moves_increase_inner_create(
      56,
       // false, not to have infinite recursion
      instantiate_ability_detail_pokemon_inner_pokemon(0)
    );
  } else {
    stat_detail_affecting_moves_increase_inner = stat_detail_affecting_moves_increase_inner_create(
      56,
      NULL
    );
  }

  return stat_detail_affecting_moves_increase_inner;
}


#ifdef stat_detail_affecting_moves_increase_inner_MAIN

void test_stat_detail_affecting_moves_increase_inner(int include_optional) {
    stat_detail_affecting_moves_increase_inner_t* stat_detail_affecting_moves_increase_inner_1 = instantiate_stat_detail_affecting_moves_increase_inner(include_optional);

	cJSON* jsonstat_detail_affecting_moves_increase_inner_1 = stat_detail_affecting_moves_increase_inner_convertToJSON(stat_detail_affecting_moves_increase_inner_1);
	printf("stat_detail_affecting_moves_increase_inner :\n%s\n", cJSON_Print(jsonstat_detail_affecting_moves_increase_inner_1));
	stat_detail_affecting_moves_increase_inner_t* stat_detail_affecting_moves_increase_inner_2 = stat_detail_affecting_moves_increase_inner_parseFromJSON(jsonstat_detail_affecting_moves_increase_inner_1);
	cJSON* jsonstat_detail_affecting_moves_increase_inner_2 = stat_detail_affecting_moves_increase_inner_convertToJSON(stat_detail_affecting_moves_increase_inner_2);
	printf("repeating stat_detail_affecting_moves_increase_inner:\n%s\n", cJSON_Print(jsonstat_detail_affecting_moves_increase_inner_2));
}

int main() {
  test_stat_detail_affecting_moves_increase_inner(1);
  test_stat_detail_affecting_moves_increase_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // stat_detail_affecting_moves_increase_inner_MAIN
#endif // stat_detail_affecting_moves_increase_inner_TEST
