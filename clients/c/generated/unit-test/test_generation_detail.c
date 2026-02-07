#ifndef generation_detail_TEST
#define generation_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define generation_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/generation_detail.h"
generation_detail_t* instantiate_generation_detail(int include_optional);

#include "test_region_summary.c"


generation_detail_t* instantiate_generation_detail(int include_optional) {
  generation_detail_t* generation_detail = NULL;
  if (include_optional) {
    generation_detail = generation_detail_create(
      56,
      "0",
      list_createList(),
       // false, not to have infinite recursion
      instantiate_region_summary(0),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  } else {
    generation_detail = generation_detail_create(
      56,
      "0",
      list_createList(),
      NULL,
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  }

  return generation_detail;
}


#ifdef generation_detail_MAIN

void test_generation_detail(int include_optional) {
    generation_detail_t* generation_detail_1 = instantiate_generation_detail(include_optional);

	cJSON* jsongeneration_detail_1 = generation_detail_convertToJSON(generation_detail_1);
	printf("generation_detail :\n%s\n", cJSON_Print(jsongeneration_detail_1));
	generation_detail_t* generation_detail_2 = generation_detail_parseFromJSON(jsongeneration_detail_1);
	cJSON* jsongeneration_detail_2 = generation_detail_convertToJSON(generation_detail_2);
	printf("repeating generation_detail:\n%s\n", cJSON_Print(jsongeneration_detail_2));
}

int main() {
  test_generation_detail(1);
  test_generation_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // generation_detail_MAIN
#endif // generation_detail_TEST
