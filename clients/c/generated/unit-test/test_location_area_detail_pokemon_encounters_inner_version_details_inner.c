#ifndef location_area_detail_pokemon_encounters_inner_version_details_inner_TEST
#define location_area_detail_pokemon_encounters_inner_version_details_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define location_area_detail_pokemon_encounters_inner_version_details_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/location_area_detail_pokemon_encounters_inner_version_details_inner.h"
location_area_detail_pokemon_encounters_inner_version_details_inner_t* instantiate_location_area_detail_pokemon_encounters_inner_version_details_inner(int include_optional);

#include "test_ability_detail_pokemon_inner_pokemon.c"
#include "test_location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details.c"


location_area_detail_pokemon_encounters_inner_version_details_inner_t* instantiate_location_area_detail_pokemon_encounters_inner_version_details_inner(int include_optional) {
  location_area_detail_pokemon_encounters_inner_version_details_inner_t* location_area_detail_pokemon_encounters_inner_version_details_inner = NULL;
  if (include_optional) {
    location_area_detail_pokemon_encounters_inner_version_details_inner = location_area_detail_pokemon_encounters_inner_version_details_inner_create(
       // false, not to have infinite recursion
      instantiate_ability_detail_pokemon_inner_pokemon(0),
      56,
       // false, not to have infinite recursion
      instantiate_location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details(0)
    );
  } else {
    location_area_detail_pokemon_encounters_inner_version_details_inner = location_area_detail_pokemon_encounters_inner_version_details_inner_create(
      NULL,
      56,
      NULL
    );
  }

  return location_area_detail_pokemon_encounters_inner_version_details_inner;
}


#ifdef location_area_detail_pokemon_encounters_inner_version_details_inner_MAIN

void test_location_area_detail_pokemon_encounters_inner_version_details_inner(int include_optional) {
    location_area_detail_pokemon_encounters_inner_version_details_inner_t* location_area_detail_pokemon_encounters_inner_version_details_inner_1 = instantiate_location_area_detail_pokemon_encounters_inner_version_details_inner(include_optional);

	cJSON* jsonlocation_area_detail_pokemon_encounters_inner_version_details_inner_1 = location_area_detail_pokemon_encounters_inner_version_details_inner_convertToJSON(location_area_detail_pokemon_encounters_inner_version_details_inner_1);
	printf("location_area_detail_pokemon_encounters_inner_version_details_inner :\n%s\n", cJSON_Print(jsonlocation_area_detail_pokemon_encounters_inner_version_details_inner_1));
	location_area_detail_pokemon_encounters_inner_version_details_inner_t* location_area_detail_pokemon_encounters_inner_version_details_inner_2 = location_area_detail_pokemon_encounters_inner_version_details_inner_parseFromJSON(jsonlocation_area_detail_pokemon_encounters_inner_version_details_inner_1);
	cJSON* jsonlocation_area_detail_pokemon_encounters_inner_version_details_inner_2 = location_area_detail_pokemon_encounters_inner_version_details_inner_convertToJSON(location_area_detail_pokemon_encounters_inner_version_details_inner_2);
	printf("repeating location_area_detail_pokemon_encounters_inner_version_details_inner:\n%s\n", cJSON_Print(jsonlocation_area_detail_pokemon_encounters_inner_version_details_inner_2));
}

int main() {
  test_location_area_detail_pokemon_encounters_inner_version_details_inner(1);
  test_location_area_detail_pokemon_encounters_inner_version_details_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // location_area_detail_pokemon_encounters_inner_version_details_inner_MAIN
#endif // location_area_detail_pokemon_encounters_inner_version_details_inner_TEST
