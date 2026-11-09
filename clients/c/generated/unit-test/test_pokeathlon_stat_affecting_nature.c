#ifndef pokeathlon_stat_affecting_nature_TEST
#define pokeathlon_stat_affecting_nature_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokeathlon_stat_affecting_nature_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokeathlon_stat_affecting_nature.h"
pokeathlon_stat_affecting_nature_t* instantiate_pokeathlon_stat_affecting_nature(int include_optional);

#include "test_nature_summary.c"


pokeathlon_stat_affecting_nature_t* instantiate_pokeathlon_stat_affecting_nature(int include_optional) {
  pokeathlon_stat_affecting_nature_t* pokeathlon_stat_affecting_nature = NULL;
  if (include_optional) {
    pokeathlon_stat_affecting_nature = pokeathlon_stat_affecting_nature_create(
      -2147483648,
       // false, not to have infinite recursion
      instantiate_nature_summary(0)
    );
  } else {
    pokeathlon_stat_affecting_nature = pokeathlon_stat_affecting_nature_create(
      -2147483648,
      NULL
    );
  }

  return pokeathlon_stat_affecting_nature;
}


#ifdef pokeathlon_stat_affecting_nature_MAIN

void test_pokeathlon_stat_affecting_nature(int include_optional) {
    pokeathlon_stat_affecting_nature_t* pokeathlon_stat_affecting_nature_1 = instantiate_pokeathlon_stat_affecting_nature(include_optional);

	cJSON* jsonpokeathlon_stat_affecting_nature_1 = pokeathlon_stat_affecting_nature_convertToJSON(pokeathlon_stat_affecting_nature_1);
	printf("pokeathlon_stat_affecting_nature :\n%s\n", cJSON_Print(jsonpokeathlon_stat_affecting_nature_1));
	pokeathlon_stat_affecting_nature_t* pokeathlon_stat_affecting_nature_2 = pokeathlon_stat_affecting_nature_parseFromJSON(jsonpokeathlon_stat_affecting_nature_1);
	cJSON* jsonpokeathlon_stat_affecting_nature_2 = pokeathlon_stat_affecting_nature_convertToJSON(pokeathlon_stat_affecting_nature_2);
	printf("repeating pokeathlon_stat_affecting_nature:\n%s\n", cJSON_Print(jsonpokeathlon_stat_affecting_nature_2));
}

int main() {
  test_pokeathlon_stat_affecting_nature(1);
  test_pokeathlon_stat_affecting_nature(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokeathlon_stat_affecting_nature_MAIN
#endif // pokeathlon_stat_affecting_nature_TEST
