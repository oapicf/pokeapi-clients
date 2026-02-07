#ifndef pal_park_area_detail_TEST
#define pal_park_area_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pal_park_area_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pal_park_area_detail.h"
pal_park_area_detail_t* instantiate_pal_park_area_detail(int include_optional);



pal_park_area_detail_t* instantiate_pal_park_area_detail(int include_optional) {
  pal_park_area_detail_t* pal_park_area_detail = NULL;
  if (include_optional) {
    pal_park_area_detail = pal_park_area_detail_create(
      56,
      "0",
      list_createList(),
      list_createList()
    );
  } else {
    pal_park_area_detail = pal_park_area_detail_create(
      56,
      "0",
      list_createList(),
      list_createList()
    );
  }

  return pal_park_area_detail;
}


#ifdef pal_park_area_detail_MAIN

void test_pal_park_area_detail(int include_optional) {
    pal_park_area_detail_t* pal_park_area_detail_1 = instantiate_pal_park_area_detail(include_optional);

	cJSON* jsonpal_park_area_detail_1 = pal_park_area_detail_convertToJSON(pal_park_area_detail_1);
	printf("pal_park_area_detail :\n%s\n", cJSON_Print(jsonpal_park_area_detail_1));
	pal_park_area_detail_t* pal_park_area_detail_2 = pal_park_area_detail_parseFromJSON(jsonpal_park_area_detail_1);
	cJSON* jsonpal_park_area_detail_2 = pal_park_area_detail_convertToJSON(pal_park_area_detail_2);
	printf("repeating pal_park_area_detail:\n%s\n", cJSON_Print(jsonpal_park_area_detail_2));
}

int main() {
  test_pal_park_area_detail(1);
  test_pal_park_area_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // pal_park_area_detail_MAIN
#endif // pal_park_area_detail_TEST
