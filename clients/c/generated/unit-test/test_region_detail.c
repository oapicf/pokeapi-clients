#ifndef region_detail_TEST
#define region_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define region_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/region_detail.h"
region_detail_t* instantiate_region_detail(int include_optional);

#include "test_generation_summary.c"


region_detail_t* instantiate_region_detail(int include_optional) {
  region_detail_t* region_detail = NULL;
  if (include_optional) {
    region_detail = region_detail_create(
      56,
      "0",
      list_createList(),
       // false, not to have infinite recursion
      instantiate_generation_summary(0),
      list_createList(),
      list_createList(),
      list_createList()
    );
  } else {
    region_detail = region_detail_create(
      56,
      "0",
      list_createList(),
      NULL,
      list_createList(),
      list_createList(),
      list_createList()
    );
  }

  return region_detail;
}


#ifdef region_detail_MAIN

void test_region_detail(int include_optional) {
    region_detail_t* region_detail_1 = instantiate_region_detail(include_optional);

	cJSON* jsonregion_detail_1 = region_detail_convertToJSON(region_detail_1);
	printf("region_detail :\n%s\n", cJSON_Print(jsonregion_detail_1));
	region_detail_t* region_detail_2 = region_detail_parseFromJSON(jsonregion_detail_1);
	cJSON* jsonregion_detail_2 = region_detail_convertToJSON(region_detail_2);
	printf("repeating region_detail:\n%s\n", cJSON_Print(jsonregion_detail_2));
}

int main() {
  test_region_detail(1);
  test_region_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // region_detail_MAIN
#endif // region_detail_TEST
