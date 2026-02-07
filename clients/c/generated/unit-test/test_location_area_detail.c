#ifndef location_area_detail_TEST
#define location_area_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define location_area_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/location_area_detail.h"
location_area_detail_t* instantiate_location_area_detail(int include_optional);

#include "test_location_summary.c"


location_area_detail_t* instantiate_location_area_detail(int include_optional) {
  location_area_detail_t* location_area_detail = NULL;
  if (include_optional) {
    location_area_detail = location_area_detail_create(
      56,
      "0",
      56,
      list_createList(),
       // false, not to have infinite recursion
      instantiate_location_summary(0),
      list_createList(),
      list_createList()
    );
  } else {
    location_area_detail = location_area_detail_create(
      56,
      "0",
      56,
      list_createList(),
      NULL,
      list_createList(),
      list_createList()
    );
  }

  return location_area_detail;
}


#ifdef location_area_detail_MAIN

void test_location_area_detail(int include_optional) {
    location_area_detail_t* location_area_detail_1 = instantiate_location_area_detail(include_optional);

	cJSON* jsonlocation_area_detail_1 = location_area_detail_convertToJSON(location_area_detail_1);
	printf("location_area_detail :\n%s\n", cJSON_Print(jsonlocation_area_detail_1));
	location_area_detail_t* location_area_detail_2 = location_area_detail_parseFromJSON(jsonlocation_area_detail_1);
	cJSON* jsonlocation_area_detail_2 = location_area_detail_convertToJSON(location_area_detail_2);
	printf("repeating location_area_detail:\n%s\n", cJSON_Print(jsonlocation_area_detail_2));
}

int main() {
  test_location_area_detail(1);
  test_location_area_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // location_area_detail_MAIN
#endif // location_area_detail_TEST
