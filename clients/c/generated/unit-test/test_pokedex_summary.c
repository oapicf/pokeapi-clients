#ifndef pokedex_summary_TEST
#define pokedex_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokedex_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokedex_summary.h"
pokedex_summary_t* instantiate_pokedex_summary(int include_optional);



pokedex_summary_t* instantiate_pokedex_summary(int include_optional) {
  pokedex_summary_t* pokedex_summary = NULL;
  if (include_optional) {
    pokedex_summary = pokedex_summary_create(
      "0",
      "0"
    );
  } else {
    pokedex_summary = pokedex_summary_create(
      "0",
      "0"
    );
  }

  return pokedex_summary;
}


#ifdef pokedex_summary_MAIN

void test_pokedex_summary(int include_optional) {
    pokedex_summary_t* pokedex_summary_1 = instantiate_pokedex_summary(include_optional);

	cJSON* jsonpokedex_summary_1 = pokedex_summary_convertToJSON(pokedex_summary_1);
	printf("pokedex_summary :\n%s\n", cJSON_Print(jsonpokedex_summary_1));
	pokedex_summary_t* pokedex_summary_2 = pokedex_summary_parseFromJSON(jsonpokedex_summary_1);
	cJSON* jsonpokedex_summary_2 = pokedex_summary_convertToJSON(pokedex_summary_2);
	printf("repeating pokedex_summary:\n%s\n", cJSON_Print(jsonpokedex_summary_2));
}

int main() {
  test_pokedex_summary(1);
  test_pokedex_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokedex_summary_MAIN
#endif // pokedex_summary_TEST
