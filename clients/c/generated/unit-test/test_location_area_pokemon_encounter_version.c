#ifndef location_area_pokemon_encounter_version_TEST
#define location_area_pokemon_encounter_version_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define location_area_pokemon_encounter_version_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/location_area_pokemon_encounter_version.h"
location_area_pokemon_encounter_version_t* instantiate_location_area_pokemon_encounter_version(int include_optional);

#include "test_version_summary.c"


location_area_pokemon_encounter_version_t* instantiate_location_area_pokemon_encounter_version(int include_optional) {
  location_area_pokemon_encounter_version_t* location_area_pokemon_encounter_version = NULL;
  if (include_optional) {
    location_area_pokemon_encounter_version = location_area_pokemon_encounter_version_create(
       // false, not to have infinite recursion
      instantiate_version_summary(0),
      56,
      list_createList()
    );
  } else {
    location_area_pokemon_encounter_version = location_area_pokemon_encounter_version_create(
      NULL,
      56,
      list_createList()
    );
  }

  return location_area_pokemon_encounter_version;
}


#ifdef location_area_pokemon_encounter_version_MAIN

void test_location_area_pokemon_encounter_version(int include_optional) {
    location_area_pokemon_encounter_version_t* location_area_pokemon_encounter_version_1 = instantiate_location_area_pokemon_encounter_version(include_optional);

	cJSON* jsonlocation_area_pokemon_encounter_version_1 = location_area_pokemon_encounter_version_convertToJSON(location_area_pokemon_encounter_version_1);
	printf("location_area_pokemon_encounter_version :\n%s\n", cJSON_Print(jsonlocation_area_pokemon_encounter_version_1));
	location_area_pokemon_encounter_version_t* location_area_pokemon_encounter_version_2 = location_area_pokemon_encounter_version_parseFromJSON(jsonlocation_area_pokemon_encounter_version_1);
	cJSON* jsonlocation_area_pokemon_encounter_version_2 = location_area_pokemon_encounter_version_convertToJSON(location_area_pokemon_encounter_version_2);
	printf("repeating location_area_pokemon_encounter_version:\n%s\n", cJSON_Print(jsonlocation_area_pokemon_encounter_version_2));
}

int main() {
  test_location_area_pokemon_encounter_version(1);
  test_location_area_pokemon_encounter_version(0);

  printf("Hello world \n");
  return 0;
}

#endif // location_area_pokemon_encounter_version_MAIN
#endif // location_area_pokemon_encounter_version_TEST
