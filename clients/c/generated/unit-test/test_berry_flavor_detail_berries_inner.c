#ifndef berry_flavor_detail_berries_inner_TEST
#define berry_flavor_detail_berries_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define berry_flavor_detail_berries_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/berry_flavor_detail_berries_inner.h"
berry_flavor_detail_berries_inner_t* instantiate_berry_flavor_detail_berries_inner(int include_optional);

#include "test_berry_flavor_detail_berries_inner_berry.c"


berry_flavor_detail_berries_inner_t* instantiate_berry_flavor_detail_berries_inner(int include_optional) {
  berry_flavor_detail_berries_inner_t* berry_flavor_detail_berries_inner = NULL;
  if (include_optional) {
    berry_flavor_detail_berries_inner = berry_flavor_detail_berries_inner_create(
      56,
       // false, not to have infinite recursion
      instantiate_berry_flavor_detail_berries_inner_berry(0)
    );
  } else {
    berry_flavor_detail_berries_inner = berry_flavor_detail_berries_inner_create(
      56,
      NULL
    );
  }

  return berry_flavor_detail_berries_inner;
}


#ifdef berry_flavor_detail_berries_inner_MAIN

void test_berry_flavor_detail_berries_inner(int include_optional) {
    berry_flavor_detail_berries_inner_t* berry_flavor_detail_berries_inner_1 = instantiate_berry_flavor_detail_berries_inner(include_optional);

	cJSON* jsonberry_flavor_detail_berries_inner_1 = berry_flavor_detail_berries_inner_convertToJSON(berry_flavor_detail_berries_inner_1);
	printf("berry_flavor_detail_berries_inner :\n%s\n", cJSON_Print(jsonberry_flavor_detail_berries_inner_1));
	berry_flavor_detail_berries_inner_t* berry_flavor_detail_berries_inner_2 = berry_flavor_detail_berries_inner_parseFromJSON(jsonberry_flavor_detail_berries_inner_1);
	cJSON* jsonberry_flavor_detail_berries_inner_2 = berry_flavor_detail_berries_inner_convertToJSON(berry_flavor_detail_berries_inner_2);
	printf("repeating berry_flavor_detail_berries_inner:\n%s\n", cJSON_Print(jsonberry_flavor_detail_berries_inner_2));
}

int main() {
  test_berry_flavor_detail_berries_inner(1);
  test_berry_flavor_detail_berries_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // berry_flavor_detail_berries_inner_MAIN
#endif // berry_flavor_detail_berries_inner_TEST
