#ifndef pokedex_detail_TEST
#define pokedex_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokedex_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokedex_detail.h"
pokedex_detail_t* instantiate_pokedex_detail(int include_optional);

#include "test_region_summary.c"


pokedex_detail_t* instantiate_pokedex_detail(int include_optional) {
  pokedex_detail_t* pokedex_detail = NULL;
  if (include_optional) {
    pokedex_detail = pokedex_detail_create(
      56,
      "0",
      1,
      list_createList(),
      list_createList(),
      list_createList(),
       // false, not to have infinite recursion
      instantiate_region_summary(0),
      list_createList()
    );
  } else {
    pokedex_detail = pokedex_detail_create(
      56,
      "0",
      1,
      list_createList(),
      list_createList(),
      list_createList(),
      NULL,
      list_createList()
    );
  }

  return pokedex_detail;
}


#ifdef pokedex_detail_MAIN

void test_pokedex_detail(int include_optional) {
    pokedex_detail_t* pokedex_detail_1 = instantiate_pokedex_detail(include_optional);

	cJSON* jsonpokedex_detail_1 = pokedex_detail_convertToJSON(pokedex_detail_1);
	printf("pokedex_detail :\n%s\n", cJSON_Print(jsonpokedex_detail_1));
	pokedex_detail_t* pokedex_detail_2 = pokedex_detail_parseFromJSON(jsonpokedex_detail_1);
	cJSON* jsonpokedex_detail_2 = pokedex_detail_convertToJSON(pokedex_detail_2);
	printf("repeating pokedex_detail:\n%s\n", cJSON_Print(jsonpokedex_detail_2));
}

int main() {
  test_pokedex_detail(1);
  test_pokedex_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokedex_detail_MAIN
#endif // pokedex_detail_TEST
