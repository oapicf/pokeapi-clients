#ifndef location_summary_TEST
#define location_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define location_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/location_summary.h"
location_summary_t* instantiate_location_summary(int include_optional);



location_summary_t* instantiate_location_summary(int include_optional) {
  location_summary_t* location_summary = NULL;
  if (include_optional) {
    location_summary = location_summary_create(
      "0",
      "0"
    );
  } else {
    location_summary = location_summary_create(
      "0",
      "0"
    );
  }

  return location_summary;
}


#ifdef location_summary_MAIN

void test_location_summary(int include_optional) {
    location_summary_t* location_summary_1 = instantiate_location_summary(include_optional);

	cJSON* jsonlocation_summary_1 = location_summary_convertToJSON(location_summary_1);
	printf("location_summary :\n%s\n", cJSON_Print(jsonlocation_summary_1));
	location_summary_t* location_summary_2 = location_summary_parseFromJSON(jsonlocation_summary_1);
	cJSON* jsonlocation_summary_2 = location_summary_convertToJSON(location_summary_2);
	printf("repeating location_summary:\n%s\n", cJSON_Print(jsonlocation_summary_2));
}

int main() {
  test_location_summary(1);
  test_location_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // location_summary_MAIN
#endif // location_summary_TEST
