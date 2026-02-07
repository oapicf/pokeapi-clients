#ifndef berry_detail_flavors_inner_TEST
#define berry_detail_flavors_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define berry_detail_flavors_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/berry_detail_flavors_inner.h"
berry_detail_flavors_inner_t* instantiate_berry_detail_flavors_inner(int include_optional);

#include "test_berry_detail_flavors_inner_flavor.c"


berry_detail_flavors_inner_t* instantiate_berry_detail_flavors_inner(int include_optional) {
  berry_detail_flavors_inner_t* berry_detail_flavors_inner = NULL;
  if (include_optional) {
    berry_detail_flavors_inner = berry_detail_flavors_inner_create(
      56,
       // false, not to have infinite recursion
      instantiate_berry_detail_flavors_inner_flavor(0)
    );
  } else {
    berry_detail_flavors_inner = berry_detail_flavors_inner_create(
      56,
      NULL
    );
  }

  return berry_detail_flavors_inner;
}


#ifdef berry_detail_flavors_inner_MAIN

void test_berry_detail_flavors_inner(int include_optional) {
    berry_detail_flavors_inner_t* berry_detail_flavors_inner_1 = instantiate_berry_detail_flavors_inner(include_optional);

	cJSON* jsonberry_detail_flavors_inner_1 = berry_detail_flavors_inner_convertToJSON(berry_detail_flavors_inner_1);
	printf("berry_detail_flavors_inner :\n%s\n", cJSON_Print(jsonberry_detail_flavors_inner_1));
	berry_detail_flavors_inner_t* berry_detail_flavors_inner_2 = berry_detail_flavors_inner_parseFromJSON(jsonberry_detail_flavors_inner_1);
	cJSON* jsonberry_detail_flavors_inner_2 = berry_detail_flavors_inner_convertToJSON(berry_detail_flavors_inner_2);
	printf("repeating berry_detail_flavors_inner:\n%s\n", cJSON_Print(jsonberry_detail_flavors_inner_2));
}

int main() {
  test_berry_detail_flavors_inner(1);
  test_berry_detail_flavors_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // berry_detail_flavors_inner_MAIN
#endif // berry_detail_flavors_inner_TEST
