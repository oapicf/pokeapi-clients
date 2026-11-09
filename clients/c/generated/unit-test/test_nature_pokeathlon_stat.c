#ifndef nature_pokeathlon_stat_TEST
#define nature_pokeathlon_stat_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define nature_pokeathlon_stat_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/nature_pokeathlon_stat.h"
nature_pokeathlon_stat_t* instantiate_nature_pokeathlon_stat(int include_optional);

#include "test_pokeathlon_stat_summary.c"


nature_pokeathlon_stat_t* instantiate_nature_pokeathlon_stat(int include_optional) {
  nature_pokeathlon_stat_t* nature_pokeathlon_stat = NULL;
  if (include_optional) {
    nature_pokeathlon_stat = nature_pokeathlon_stat_create(
      -2147483648,
       // false, not to have infinite recursion
      instantiate_pokeathlon_stat_summary(0)
    );
  } else {
    nature_pokeathlon_stat = nature_pokeathlon_stat_create(
      -2147483648,
      NULL
    );
  }

  return nature_pokeathlon_stat;
}


#ifdef nature_pokeathlon_stat_MAIN

void test_nature_pokeathlon_stat(int include_optional) {
    nature_pokeathlon_stat_t* nature_pokeathlon_stat_1 = instantiate_nature_pokeathlon_stat(include_optional);

	cJSON* jsonnature_pokeathlon_stat_1 = nature_pokeathlon_stat_convertToJSON(nature_pokeathlon_stat_1);
	printf("nature_pokeathlon_stat :\n%s\n", cJSON_Print(jsonnature_pokeathlon_stat_1));
	nature_pokeathlon_stat_t* nature_pokeathlon_stat_2 = nature_pokeathlon_stat_parseFromJSON(jsonnature_pokeathlon_stat_1);
	cJSON* jsonnature_pokeathlon_stat_2 = nature_pokeathlon_stat_convertToJSON(nature_pokeathlon_stat_2);
	printf("repeating nature_pokeathlon_stat:\n%s\n", cJSON_Print(jsonnature_pokeathlon_stat_2));
}

int main() {
  test_nature_pokeathlon_stat(1);
  test_nature_pokeathlon_stat(0);

  printf("Hello world \n");
  return 0;
}

#endif // nature_pokeathlon_stat_MAIN
#endif // nature_pokeathlon_stat_TEST
