#ifndef pal_park_area_name_TEST
#define pal_park_area_name_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pal_park_area_name_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pal_park_area_name.h"
pal_park_area_name_t* instantiate_pal_park_area_name(int include_optional);

#include "test_language_summary.c"


pal_park_area_name_t* instantiate_pal_park_area_name(int include_optional) {
  pal_park_area_name_t* pal_park_area_name = NULL;
  if (include_optional) {
    pal_park_area_name = pal_park_area_name_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    pal_park_area_name = pal_park_area_name_create(
      "0",
      NULL
    );
  }

  return pal_park_area_name;
}


#ifdef pal_park_area_name_MAIN

void test_pal_park_area_name(int include_optional) {
    pal_park_area_name_t* pal_park_area_name_1 = instantiate_pal_park_area_name(include_optional);

	cJSON* jsonpal_park_area_name_1 = pal_park_area_name_convertToJSON(pal_park_area_name_1);
	printf("pal_park_area_name :\n%s\n", cJSON_Print(jsonpal_park_area_name_1));
	pal_park_area_name_t* pal_park_area_name_2 = pal_park_area_name_parseFromJSON(jsonpal_park_area_name_1);
	cJSON* jsonpal_park_area_name_2 = pal_park_area_name_convertToJSON(pal_park_area_name_2);
	printf("repeating pal_park_area_name:\n%s\n", cJSON_Print(jsonpal_park_area_name_2));
}

int main() {
  test_pal_park_area_name(1);
  test_pal_park_area_name(0);

  printf("Hello world \n");
  return 0;
}

#endif // pal_park_area_name_MAIN
#endif // pal_park_area_name_TEST
