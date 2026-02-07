#ifndef pokeathlon_stat_name_TEST
#define pokeathlon_stat_name_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokeathlon_stat_name_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokeathlon_stat_name.h"
pokeathlon_stat_name_t* instantiate_pokeathlon_stat_name(int include_optional);

#include "test_language_summary.c"


pokeathlon_stat_name_t* instantiate_pokeathlon_stat_name(int include_optional) {
  pokeathlon_stat_name_t* pokeathlon_stat_name = NULL;
  if (include_optional) {
    pokeathlon_stat_name = pokeathlon_stat_name_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    pokeathlon_stat_name = pokeathlon_stat_name_create(
      "0",
      NULL
    );
  }

  return pokeathlon_stat_name;
}


#ifdef pokeathlon_stat_name_MAIN

void test_pokeathlon_stat_name(int include_optional) {
    pokeathlon_stat_name_t* pokeathlon_stat_name_1 = instantiate_pokeathlon_stat_name(include_optional);

	cJSON* jsonpokeathlon_stat_name_1 = pokeathlon_stat_name_convertToJSON(pokeathlon_stat_name_1);
	printf("pokeathlon_stat_name :\n%s\n", cJSON_Print(jsonpokeathlon_stat_name_1));
	pokeathlon_stat_name_t* pokeathlon_stat_name_2 = pokeathlon_stat_name_parseFromJSON(jsonpokeathlon_stat_name_1);
	cJSON* jsonpokeathlon_stat_name_2 = pokeathlon_stat_name_convertToJSON(pokeathlon_stat_name_2);
	printf("repeating pokeathlon_stat_name:\n%s\n", cJSON_Print(jsonpokeathlon_stat_name_2));
}

int main() {
  test_pokeathlon_stat_name(1);
  test_pokeathlon_stat_name(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokeathlon_stat_name_MAIN
#endif // pokeathlon_stat_name_TEST
