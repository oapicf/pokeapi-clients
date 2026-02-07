#ifndef location_name_TEST
#define location_name_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define location_name_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/location_name.h"
location_name_t* instantiate_location_name(int include_optional);

#include "test_language_summary.c"


location_name_t* instantiate_location_name(int include_optional) {
  location_name_t* location_name = NULL;
  if (include_optional) {
    location_name = location_name_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    location_name = location_name_create(
      "0",
      NULL
    );
  }

  return location_name;
}


#ifdef location_name_MAIN

void test_location_name(int include_optional) {
    location_name_t* location_name_1 = instantiate_location_name(include_optional);

	cJSON* jsonlocation_name_1 = location_name_convertToJSON(location_name_1);
	printf("location_name :\n%s\n", cJSON_Print(jsonlocation_name_1));
	location_name_t* location_name_2 = location_name_parseFromJSON(jsonlocation_name_1);
	cJSON* jsonlocation_name_2 = location_name_convertToJSON(location_name_2);
	printf("repeating location_name:\n%s\n", cJSON_Print(jsonlocation_name_2));
}

int main() {
  test_location_name(1);
  test_location_name(0);

  printf("Hello world \n");
  return 0;
}

#endif // location_name_MAIN
#endif // location_name_TEST
