#ifndef location_area_pokemon_encounter_TEST
#define location_area_pokemon_encounter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define location_area_pokemon_encounter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/location_area_pokemon_encounter.h"
location_area_pokemon_encounter_t* instantiate_location_area_pokemon_encounter(int include_optional);

#include "test_pokemon_summary.c"


location_area_pokemon_encounter_t* instantiate_location_area_pokemon_encounter(int include_optional) {
  location_area_pokemon_encounter_t* location_area_pokemon_encounter = NULL;
  if (include_optional) {
    location_area_pokemon_encounter = location_area_pokemon_encounter_create(
       // false, not to have infinite recursion
      instantiate_pokemon_summary(0),
      list_createList()
    );
  } else {
    location_area_pokemon_encounter = location_area_pokemon_encounter_create(
      NULL,
      list_createList()
    );
  }

  return location_area_pokemon_encounter;
}


#ifdef location_area_pokemon_encounter_MAIN

void test_location_area_pokemon_encounter(int include_optional) {
    location_area_pokemon_encounter_t* location_area_pokemon_encounter_1 = instantiate_location_area_pokemon_encounter(include_optional);

	cJSON* jsonlocation_area_pokemon_encounter_1 = location_area_pokemon_encounter_convertToJSON(location_area_pokemon_encounter_1);
	printf("location_area_pokemon_encounter :\n%s\n", cJSON_Print(jsonlocation_area_pokemon_encounter_1));
	location_area_pokemon_encounter_t* location_area_pokemon_encounter_2 = location_area_pokemon_encounter_parseFromJSON(jsonlocation_area_pokemon_encounter_1);
	cJSON* jsonlocation_area_pokemon_encounter_2 = location_area_pokemon_encounter_convertToJSON(location_area_pokemon_encounter_2);
	printf("repeating location_area_pokemon_encounter:\n%s\n", cJSON_Print(jsonlocation_area_pokemon_encounter_2));
}

int main() {
  test_location_area_pokemon_encounter(1);
  test_location_area_pokemon_encounter(0);

  printf("Hello world \n");
  return 0;
}

#endif // location_area_pokemon_encounter_MAIN
#endif // location_area_pokemon_encounter_TEST
