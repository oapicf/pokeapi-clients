#ifndef pokedex_description_TEST
#define pokedex_description_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokedex_description_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokedex_description.h"
pokedex_description_t* instantiate_pokedex_description(int include_optional);

#include "test_language_summary.c"


pokedex_description_t* instantiate_pokedex_description(int include_optional) {
  pokedex_description_t* pokedex_description = NULL;
  if (include_optional) {
    pokedex_description = pokedex_description_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    pokedex_description = pokedex_description_create(
      "0",
      NULL
    );
  }

  return pokedex_description;
}


#ifdef pokedex_description_MAIN

void test_pokedex_description(int include_optional) {
    pokedex_description_t* pokedex_description_1 = instantiate_pokedex_description(include_optional);

	cJSON* jsonpokedex_description_1 = pokedex_description_convertToJSON(pokedex_description_1);
	printf("pokedex_description :\n%s\n", cJSON_Print(jsonpokedex_description_1));
	pokedex_description_t* pokedex_description_2 = pokedex_description_parseFromJSON(jsonpokedex_description_1);
	cJSON* jsonpokedex_description_2 = pokedex_description_convertToJSON(pokedex_description_2);
	printf("repeating pokedex_description:\n%s\n", cJSON_Print(jsonpokedex_description_2));
}

int main() {
  test_pokedex_description(1);
  test_pokedex_description(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokedex_description_MAIN
#endif // pokedex_description_TEST
