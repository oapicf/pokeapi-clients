#ifndef pal_park_encounter_TEST
#define pal_park_encounter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pal_park_encounter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pal_park_encounter.h"
pal_park_encounter_t* instantiate_pal_park_encounter(int include_optional);

#include "test_pokemon_species_summary.c"


pal_park_encounter_t* instantiate_pal_park_encounter(int include_optional) {
  pal_park_encounter_t* pal_park_encounter = NULL;
  if (include_optional) {
    pal_park_encounter = pal_park_encounter_create(
      -2147483648,
      -2147483648,
       // false, not to have infinite recursion
      instantiate_pokemon_species_summary(0)
    );
  } else {
    pal_park_encounter = pal_park_encounter_create(
      -2147483648,
      -2147483648,
      NULL
    );
  }

  return pal_park_encounter;
}


#ifdef pal_park_encounter_MAIN

void test_pal_park_encounter(int include_optional) {
    pal_park_encounter_t* pal_park_encounter_1 = instantiate_pal_park_encounter(include_optional);

	cJSON* jsonpal_park_encounter_1 = pal_park_encounter_convertToJSON(pal_park_encounter_1);
	printf("pal_park_encounter :\n%s\n", cJSON_Print(jsonpal_park_encounter_1));
	pal_park_encounter_t* pal_park_encounter_2 = pal_park_encounter_parseFromJSON(jsonpal_park_encounter_1);
	cJSON* jsonpal_park_encounter_2 = pal_park_encounter_convertToJSON(pal_park_encounter_2);
	printf("repeating pal_park_encounter:\n%s\n", cJSON_Print(jsonpal_park_encounter_2));
}

int main() {
  test_pal_park_encounter(1);
  test_pal_park_encounter(0);

  printf("Hello world \n");
  return 0;
}

#endif // pal_park_encounter_MAIN
#endif // pal_park_encounter_TEST
