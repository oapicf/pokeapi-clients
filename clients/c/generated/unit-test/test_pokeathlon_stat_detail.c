#ifndef pokeathlon_stat_detail_TEST
#define pokeathlon_stat_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokeathlon_stat_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokeathlon_stat_detail.h"
pokeathlon_stat_detail_t* instantiate_pokeathlon_stat_detail(int include_optional);

#include "test_pokeathlon_stat_detail_affecting_natures.c"


pokeathlon_stat_detail_t* instantiate_pokeathlon_stat_detail(int include_optional) {
  pokeathlon_stat_detail_t* pokeathlon_stat_detail = NULL;
  if (include_optional) {
    pokeathlon_stat_detail = pokeathlon_stat_detail_create(
      56,
      "0",
       // false, not to have infinite recursion
      instantiate_pokeathlon_stat_detail_affecting_natures(0),
      list_createList()
    );
  } else {
    pokeathlon_stat_detail = pokeathlon_stat_detail_create(
      56,
      "0",
      NULL,
      list_createList()
    );
  }

  return pokeathlon_stat_detail;
}


#ifdef pokeathlon_stat_detail_MAIN

void test_pokeathlon_stat_detail(int include_optional) {
    pokeathlon_stat_detail_t* pokeathlon_stat_detail_1 = instantiate_pokeathlon_stat_detail(include_optional);

	cJSON* jsonpokeathlon_stat_detail_1 = pokeathlon_stat_detail_convertToJSON(pokeathlon_stat_detail_1);
	printf("pokeathlon_stat_detail :\n%s\n", cJSON_Print(jsonpokeathlon_stat_detail_1));
	pokeathlon_stat_detail_t* pokeathlon_stat_detail_2 = pokeathlon_stat_detail_parseFromJSON(jsonpokeathlon_stat_detail_1);
	cJSON* jsonpokeathlon_stat_detail_2 = pokeathlon_stat_detail_convertToJSON(pokeathlon_stat_detail_2);
	printf("repeating pokeathlon_stat_detail:\n%s\n", cJSON_Print(jsonpokeathlon_stat_detail_2));
}

int main() {
  test_pokeathlon_stat_detail(1);
  test_pokeathlon_stat_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokeathlon_stat_detail_MAIN
#endif // pokeathlon_stat_detail_TEST
