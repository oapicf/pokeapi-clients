#ifndef region_summary_TEST
#define region_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define region_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/region_summary.h"
region_summary_t* instantiate_region_summary(int include_optional);



region_summary_t* instantiate_region_summary(int include_optional) {
  region_summary_t* region_summary = NULL;
  if (include_optional) {
    region_summary = region_summary_create(
      "0",
      "0"
    );
  } else {
    region_summary = region_summary_create(
      "0",
      "0"
    );
  }

  return region_summary;
}


#ifdef region_summary_MAIN

void test_region_summary(int include_optional) {
    region_summary_t* region_summary_1 = instantiate_region_summary(include_optional);

	cJSON* jsonregion_summary_1 = region_summary_convertToJSON(region_summary_1);
	printf("region_summary :\n%s\n", cJSON_Print(jsonregion_summary_1));
	region_summary_t* region_summary_2 = region_summary_parseFromJSON(jsonregion_summary_1);
	cJSON* jsonregion_summary_2 = region_summary_convertToJSON(region_summary_2);
	printf("repeating region_summary:\n%s\n", cJSON_Print(jsonregion_summary_2));
}

int main() {
  test_region_summary(1);
  test_region_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // region_summary_MAIN
#endif // region_summary_TEST
