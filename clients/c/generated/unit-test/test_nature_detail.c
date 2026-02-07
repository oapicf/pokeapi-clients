#ifndef nature_detail_TEST
#define nature_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define nature_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/nature_detail.h"
nature_detail_t* instantiate_nature_detail(int include_optional);

#include "test_stat_summary.c"
#include "test_stat_summary.c"
#include "test_berry_flavor_summary.c"
#include "test_berry_flavor_summary.c"


nature_detail_t* instantiate_nature_detail(int include_optional) {
  nature_detail_t* nature_detail = NULL;
  if (include_optional) {
    nature_detail = nature_detail_create(
      56,
      "0",
       // false, not to have infinite recursion
      instantiate_stat_summary(0),
       // false, not to have infinite recursion
      instantiate_stat_summary(0),
       // false, not to have infinite recursion
      instantiate_berry_flavor_summary(0),
       // false, not to have infinite recursion
      instantiate_berry_flavor_summary(0),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  } else {
    nature_detail = nature_detail_create(
      56,
      "0",
      NULL,
      NULL,
      NULL,
      NULL,
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  }

  return nature_detail;
}


#ifdef nature_detail_MAIN

void test_nature_detail(int include_optional) {
    nature_detail_t* nature_detail_1 = instantiate_nature_detail(include_optional);

	cJSON* jsonnature_detail_1 = nature_detail_convertToJSON(nature_detail_1);
	printf("nature_detail :\n%s\n", cJSON_Print(jsonnature_detail_1));
	nature_detail_t* nature_detail_2 = nature_detail_parseFromJSON(jsonnature_detail_1);
	cJSON* jsonnature_detail_2 = nature_detail_convertToJSON(nature_detail_2);
	printf("repeating nature_detail:\n%s\n", cJSON_Print(jsonnature_detail_2));
}

int main() {
  test_nature_detail(1);
  test_nature_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // nature_detail_MAIN
#endif // nature_detail_TEST
