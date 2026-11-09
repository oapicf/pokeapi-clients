#ifndef location_area_encounter_rate_TEST
#define location_area_encounter_rate_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define location_area_encounter_rate_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/location_area_encounter_rate.h"
location_area_encounter_rate_t* instantiate_location_area_encounter_rate(int include_optional);

#include "test_encounter_method_summary.c"


location_area_encounter_rate_t* instantiate_location_area_encounter_rate(int include_optional) {
  location_area_encounter_rate_t* location_area_encounter_rate = NULL;
  if (include_optional) {
    location_area_encounter_rate = location_area_encounter_rate_create(
       // false, not to have infinite recursion
      instantiate_encounter_method_summary(0),
      list_createList()
    );
  } else {
    location_area_encounter_rate = location_area_encounter_rate_create(
      NULL,
      list_createList()
    );
  }

  return location_area_encounter_rate;
}


#ifdef location_area_encounter_rate_MAIN

void test_location_area_encounter_rate(int include_optional) {
    location_area_encounter_rate_t* location_area_encounter_rate_1 = instantiate_location_area_encounter_rate(include_optional);

	cJSON* jsonlocation_area_encounter_rate_1 = location_area_encounter_rate_convertToJSON(location_area_encounter_rate_1);
	printf("location_area_encounter_rate :\n%s\n", cJSON_Print(jsonlocation_area_encounter_rate_1));
	location_area_encounter_rate_t* location_area_encounter_rate_2 = location_area_encounter_rate_parseFromJSON(jsonlocation_area_encounter_rate_1);
	cJSON* jsonlocation_area_encounter_rate_2 = location_area_encounter_rate_convertToJSON(location_area_encounter_rate_2);
	printf("repeating location_area_encounter_rate:\n%s\n", cJSON_Print(jsonlocation_area_encounter_rate_2));
}

int main() {
  test_location_area_encounter_rate(1);
  test_location_area_encounter_rate(0);

  printf("Hello world \n");
  return 0;
}

#endif // location_area_encounter_rate_MAIN
#endif // location_area_encounter_rate_TEST
