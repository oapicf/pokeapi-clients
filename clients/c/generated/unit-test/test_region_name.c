#ifndef region_name_TEST
#define region_name_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define region_name_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/region_name.h"
region_name_t* instantiate_region_name(int include_optional);

#include "test_language_summary.c"


region_name_t* instantiate_region_name(int include_optional) {
  region_name_t* region_name = NULL;
  if (include_optional) {
    region_name = region_name_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    region_name = region_name_create(
      "0",
      NULL
    );
  }

  return region_name;
}


#ifdef region_name_MAIN

void test_region_name(int include_optional) {
    region_name_t* region_name_1 = instantiate_region_name(include_optional);

	cJSON* jsonregion_name_1 = region_name_convertToJSON(region_name_1);
	printf("region_name :\n%s\n", cJSON_Print(jsonregion_name_1));
	region_name_t* region_name_2 = region_name_parseFromJSON(jsonregion_name_1);
	cJSON* jsonregion_name_2 = region_name_convertToJSON(region_name_2);
	printf("repeating region_name:\n%s\n", cJSON_Print(jsonregion_name_2));
}

int main() {
  test_region_name(1);
  test_region_name(0);

  printf("Hello world \n");
  return 0;
}

#endif // region_name_MAIN
#endif // region_name_TEST
