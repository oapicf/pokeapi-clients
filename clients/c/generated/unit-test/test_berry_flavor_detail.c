#ifndef berry_flavor_detail_TEST
#define berry_flavor_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define berry_flavor_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/berry_flavor_detail.h"
berry_flavor_detail_t* instantiate_berry_flavor_detail(int include_optional);

#include "test_contest_type_summary.c"


berry_flavor_detail_t* instantiate_berry_flavor_detail(int include_optional) {
  berry_flavor_detail_t* berry_flavor_detail = NULL;
  if (include_optional) {
    berry_flavor_detail = berry_flavor_detail_create(
      56,
      "0",
      list_createList(),
       // false, not to have infinite recursion
      instantiate_contest_type_summary(0),
      list_createList()
    );
  } else {
    berry_flavor_detail = berry_flavor_detail_create(
      56,
      "0",
      list_createList(),
      NULL,
      list_createList()
    );
  }

  return berry_flavor_detail;
}


#ifdef berry_flavor_detail_MAIN

void test_berry_flavor_detail(int include_optional) {
    berry_flavor_detail_t* berry_flavor_detail_1 = instantiate_berry_flavor_detail(include_optional);

	cJSON* jsonberry_flavor_detail_1 = berry_flavor_detail_convertToJSON(berry_flavor_detail_1);
	printf("berry_flavor_detail :\n%s\n", cJSON_Print(jsonberry_flavor_detail_1));
	berry_flavor_detail_t* berry_flavor_detail_2 = berry_flavor_detail_parseFromJSON(jsonberry_flavor_detail_1);
	cJSON* jsonberry_flavor_detail_2 = berry_flavor_detail_convertToJSON(berry_flavor_detail_2);
	printf("repeating berry_flavor_detail:\n%s\n", cJSON_Print(jsonberry_flavor_detail_2));
}

int main() {
  test_berry_flavor_detail(1);
  test_berry_flavor_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // berry_flavor_detail_MAIN
#endif // berry_flavor_detail_TEST
