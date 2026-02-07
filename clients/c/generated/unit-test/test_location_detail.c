#ifndef location_detail_TEST
#define location_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define location_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/location_detail.h"
location_detail_t* instantiate_location_detail(int include_optional);

#include "test_region_summary.c"


location_detail_t* instantiate_location_detail(int include_optional) {
  location_detail_t* location_detail = NULL;
  if (include_optional) {
    location_detail = location_detail_create(
      56,
      "0",
       // false, not to have infinite recursion
      instantiate_region_summary(0),
      list_createList(),
      list_createList(),
      list_createList()
    );
  } else {
    location_detail = location_detail_create(
      56,
      "0",
      NULL,
      list_createList(),
      list_createList(),
      list_createList()
    );
  }

  return location_detail;
}


#ifdef location_detail_MAIN

void test_location_detail(int include_optional) {
    location_detail_t* location_detail_1 = instantiate_location_detail(include_optional);

	cJSON* jsonlocation_detail_1 = location_detail_convertToJSON(location_detail_1);
	printf("location_detail :\n%s\n", cJSON_Print(jsonlocation_detail_1));
	location_detail_t* location_detail_2 = location_detail_parseFromJSON(jsonlocation_detail_1);
	cJSON* jsonlocation_detail_2 = location_detail_convertToJSON(location_detail_2);
	printf("repeating location_detail:\n%s\n", cJSON_Print(jsonlocation_detail_2));
}

int main() {
  test_location_detail(1);
  test_location_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // location_detail_MAIN
#endif // location_detail_TEST
