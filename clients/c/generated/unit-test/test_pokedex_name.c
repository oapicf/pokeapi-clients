#ifndef pokedex_name_TEST
#define pokedex_name_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokedex_name_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokedex_name.h"
pokedex_name_t* instantiate_pokedex_name(int include_optional);

#include "test_language_summary.c"


pokedex_name_t* instantiate_pokedex_name(int include_optional) {
  pokedex_name_t* pokedex_name = NULL;
  if (include_optional) {
    pokedex_name = pokedex_name_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    pokedex_name = pokedex_name_create(
      "0",
      NULL
    );
  }

  return pokedex_name;
}


#ifdef pokedex_name_MAIN

void test_pokedex_name(int include_optional) {
    pokedex_name_t* pokedex_name_1 = instantiate_pokedex_name(include_optional);

	cJSON* jsonpokedex_name_1 = pokedex_name_convertToJSON(pokedex_name_1);
	printf("pokedex_name :\n%s\n", cJSON_Print(jsonpokedex_name_1));
	pokedex_name_t* pokedex_name_2 = pokedex_name_parseFromJSON(jsonpokedex_name_1);
	cJSON* jsonpokedex_name_2 = pokedex_name_convertToJSON(pokedex_name_2);
	printf("repeating pokedex_name:\n%s\n", cJSON_Print(jsonpokedex_name_2));
}

int main() {
  test_pokedex_name(1);
  test_pokedex_name(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokedex_name_MAIN
#endif // pokedex_name_TEST
