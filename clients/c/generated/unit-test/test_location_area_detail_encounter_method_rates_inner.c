#ifndef location_area_detail_encounter_method_rates_inner_TEST
#define location_area_detail_encounter_method_rates_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define location_area_detail_encounter_method_rates_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/location_area_detail_encounter_method_rates_inner.h"
location_area_detail_encounter_method_rates_inner_t* instantiate_location_area_detail_encounter_method_rates_inner(int include_optional);

#include "test_ability_detail_pokemon_inner_pokemon.c"


location_area_detail_encounter_method_rates_inner_t* instantiate_location_area_detail_encounter_method_rates_inner(int include_optional) {
  location_area_detail_encounter_method_rates_inner_t* location_area_detail_encounter_method_rates_inner = NULL;
  if (include_optional) {
    location_area_detail_encounter_method_rates_inner = location_area_detail_encounter_method_rates_inner_create(
       // false, not to have infinite recursion
      instantiate_ability_detail_pokemon_inner_pokemon(0),
      list_createList()
    );
  } else {
    location_area_detail_encounter_method_rates_inner = location_area_detail_encounter_method_rates_inner_create(
      NULL,
      list_createList()
    );
  }

  return location_area_detail_encounter_method_rates_inner;
}


#ifdef location_area_detail_encounter_method_rates_inner_MAIN

void test_location_area_detail_encounter_method_rates_inner(int include_optional) {
    location_area_detail_encounter_method_rates_inner_t* location_area_detail_encounter_method_rates_inner_1 = instantiate_location_area_detail_encounter_method_rates_inner(include_optional);

	cJSON* jsonlocation_area_detail_encounter_method_rates_inner_1 = location_area_detail_encounter_method_rates_inner_convertToJSON(location_area_detail_encounter_method_rates_inner_1);
	printf("location_area_detail_encounter_method_rates_inner :\n%s\n", cJSON_Print(jsonlocation_area_detail_encounter_method_rates_inner_1));
	location_area_detail_encounter_method_rates_inner_t* location_area_detail_encounter_method_rates_inner_2 = location_area_detail_encounter_method_rates_inner_parseFromJSON(jsonlocation_area_detail_encounter_method_rates_inner_1);
	cJSON* jsonlocation_area_detail_encounter_method_rates_inner_2 = location_area_detail_encounter_method_rates_inner_convertToJSON(location_area_detail_encounter_method_rates_inner_2);
	printf("repeating location_area_detail_encounter_method_rates_inner:\n%s\n", cJSON_Print(jsonlocation_area_detail_encounter_method_rates_inner_2));
}

int main() {
  test_location_area_detail_encounter_method_rates_inner(1);
  test_location_area_detail_encounter_method_rates_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // location_area_detail_encounter_method_rates_inner_MAIN
#endif // location_area_detail_encounter_method_rates_inner_TEST
