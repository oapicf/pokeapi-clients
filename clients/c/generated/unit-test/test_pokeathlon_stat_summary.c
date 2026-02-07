#ifndef pokeathlon_stat_summary_TEST
#define pokeathlon_stat_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokeathlon_stat_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokeathlon_stat_summary.h"
pokeathlon_stat_summary_t* instantiate_pokeathlon_stat_summary(int include_optional);



pokeathlon_stat_summary_t* instantiate_pokeathlon_stat_summary(int include_optional) {
  pokeathlon_stat_summary_t* pokeathlon_stat_summary = NULL;
  if (include_optional) {
    pokeathlon_stat_summary = pokeathlon_stat_summary_create(
      "0",
      "0"
    );
  } else {
    pokeathlon_stat_summary = pokeathlon_stat_summary_create(
      "0",
      "0"
    );
  }

  return pokeathlon_stat_summary;
}


#ifdef pokeathlon_stat_summary_MAIN

void test_pokeathlon_stat_summary(int include_optional) {
    pokeathlon_stat_summary_t* pokeathlon_stat_summary_1 = instantiate_pokeathlon_stat_summary(include_optional);

	cJSON* jsonpokeathlon_stat_summary_1 = pokeathlon_stat_summary_convertToJSON(pokeathlon_stat_summary_1);
	printf("pokeathlon_stat_summary :\n%s\n", cJSON_Print(jsonpokeathlon_stat_summary_1));
	pokeathlon_stat_summary_t* pokeathlon_stat_summary_2 = pokeathlon_stat_summary_parseFromJSON(jsonpokeathlon_stat_summary_1);
	cJSON* jsonpokeathlon_stat_summary_2 = pokeathlon_stat_summary_convertToJSON(pokeathlon_stat_summary_2);
	printf("repeating pokeathlon_stat_summary:\n%s\n", cJSON_Print(jsonpokeathlon_stat_summary_2));
}

int main() {
  test_pokeathlon_stat_summary(1);
  test_pokeathlon_stat_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokeathlon_stat_summary_MAIN
#endif // pokeathlon_stat_summary_TEST
