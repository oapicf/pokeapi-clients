#ifndef location_area_summary_TEST
#define location_area_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define location_area_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/location_area_summary.h"
location_area_summary_t* instantiate_location_area_summary(int include_optional);



location_area_summary_t* instantiate_location_area_summary(int include_optional) {
  location_area_summary_t* location_area_summary = NULL;
  if (include_optional) {
    location_area_summary = location_area_summary_create(
      "0",
      "0"
    );
  } else {
    location_area_summary = location_area_summary_create(
      "0",
      "0"
    );
  }

  return location_area_summary;
}


#ifdef location_area_summary_MAIN

void test_location_area_summary(int include_optional) {
    location_area_summary_t* location_area_summary_1 = instantiate_location_area_summary(include_optional);

	cJSON* jsonlocation_area_summary_1 = location_area_summary_convertToJSON(location_area_summary_1);
	printf("location_area_summary :\n%s\n", cJSON_Print(jsonlocation_area_summary_1));
	location_area_summary_t* location_area_summary_2 = location_area_summary_parseFromJSON(jsonlocation_area_summary_1);
	cJSON* jsonlocation_area_summary_2 = location_area_summary_convertToJSON(location_area_summary_2);
	printf("repeating location_area_summary:\n%s\n", cJSON_Print(jsonlocation_area_summary_2));
}

int main() {
  test_location_area_summary(1);
  test_location_area_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // location_area_summary_MAIN
#endif // location_area_summary_TEST
