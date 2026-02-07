#ifndef berry_detail_TEST
#define berry_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define berry_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/berry_detail.h"
berry_detail_t* instantiate_berry_detail(int include_optional);

#include "test_berry_firmness_summary.c"
#include "test_item_summary.c"
#include "test_type_summary.c"


berry_detail_t* instantiate_berry_detail(int include_optional) {
  berry_detail_t* berry_detail = NULL;
  if (include_optional) {
    berry_detail = berry_detail_create(
      56,
      "0",
      56,
      56,
      56,
      56,
      56,
      56,
       // false, not to have infinite recursion
      instantiate_berry_firmness_summary(0),
      list_createList(),
       // false, not to have infinite recursion
      instantiate_item_summary(0),
       // false, not to have infinite recursion
      instantiate_type_summary(0)
    );
  } else {
    berry_detail = berry_detail_create(
      56,
      "0",
      56,
      56,
      56,
      56,
      56,
      56,
      NULL,
      list_createList(),
      NULL,
      NULL
    );
  }

  return berry_detail;
}


#ifdef berry_detail_MAIN

void test_berry_detail(int include_optional) {
    berry_detail_t* berry_detail_1 = instantiate_berry_detail(include_optional);

	cJSON* jsonberry_detail_1 = berry_detail_convertToJSON(berry_detail_1);
	printf("berry_detail :\n%s\n", cJSON_Print(jsonberry_detail_1));
	berry_detail_t* berry_detail_2 = berry_detail_parseFromJSON(jsonberry_detail_1);
	cJSON* jsonberry_detail_2 = berry_detail_convertToJSON(berry_detail_2);
	printf("repeating berry_detail:\n%s\n", cJSON_Print(jsonberry_detail_2));
}

int main() {
  test_berry_detail(1);
  test_berry_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // berry_detail_MAIN
#endif // berry_detail_TEST
