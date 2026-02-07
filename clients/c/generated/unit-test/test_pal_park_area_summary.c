#ifndef pal_park_area_summary_TEST
#define pal_park_area_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pal_park_area_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pal_park_area_summary.h"
pal_park_area_summary_t* instantiate_pal_park_area_summary(int include_optional);



pal_park_area_summary_t* instantiate_pal_park_area_summary(int include_optional) {
  pal_park_area_summary_t* pal_park_area_summary = NULL;
  if (include_optional) {
    pal_park_area_summary = pal_park_area_summary_create(
      "0",
      "0"
    );
  } else {
    pal_park_area_summary = pal_park_area_summary_create(
      "0",
      "0"
    );
  }

  return pal_park_area_summary;
}


#ifdef pal_park_area_summary_MAIN

void test_pal_park_area_summary(int include_optional) {
    pal_park_area_summary_t* pal_park_area_summary_1 = instantiate_pal_park_area_summary(include_optional);

	cJSON* jsonpal_park_area_summary_1 = pal_park_area_summary_convertToJSON(pal_park_area_summary_1);
	printf("pal_park_area_summary :\n%s\n", cJSON_Print(jsonpal_park_area_summary_1));
	pal_park_area_summary_t* pal_park_area_summary_2 = pal_park_area_summary_parseFromJSON(jsonpal_park_area_summary_1);
	cJSON* jsonpal_park_area_summary_2 = pal_park_area_summary_convertToJSON(pal_park_area_summary_2);
	printf("repeating pal_park_area_summary:\n%s\n", cJSON_Print(jsonpal_park_area_summary_2));
}

int main() {
  test_pal_park_area_summary(1);
  test_pal_park_area_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // pal_park_area_summary_MAIN
#endif // pal_park_area_summary_TEST
