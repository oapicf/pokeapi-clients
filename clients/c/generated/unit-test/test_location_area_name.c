#ifndef location_area_name_TEST
#define location_area_name_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define location_area_name_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/location_area_name.h"
location_area_name_t* instantiate_location_area_name(int include_optional);

#include "test_language_summary.c"


location_area_name_t* instantiate_location_area_name(int include_optional) {
  location_area_name_t* location_area_name = NULL;
  if (include_optional) {
    location_area_name = location_area_name_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    location_area_name = location_area_name_create(
      "0",
      NULL
    );
  }

  return location_area_name;
}


#ifdef location_area_name_MAIN

void test_location_area_name(int include_optional) {
    location_area_name_t* location_area_name_1 = instantiate_location_area_name(include_optional);

	cJSON* jsonlocation_area_name_1 = location_area_name_convertToJSON(location_area_name_1);
	printf("location_area_name :\n%s\n", cJSON_Print(jsonlocation_area_name_1));
	location_area_name_t* location_area_name_2 = location_area_name_parseFromJSON(jsonlocation_area_name_1);
	cJSON* jsonlocation_area_name_2 = location_area_name_convertToJSON(location_area_name_2);
	printf("repeating location_area_name:\n%s\n", cJSON_Print(jsonlocation_area_name_2));
}

int main() {
  test_location_area_name(1);
  test_location_area_name(0);

  printf("Hello world \n");
  return 0;
}

#endif // location_area_name_MAIN
#endif // location_area_name_TEST
