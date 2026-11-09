#ifndef berry_flavor_map_TEST
#define berry_flavor_map_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define berry_flavor_map_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/berry_flavor_map.h"
berry_flavor_map_t* instantiate_berry_flavor_map(int include_optional);

#include "test_berry_flavor_summary.c"


berry_flavor_map_t* instantiate_berry_flavor_map(int include_optional) {
  berry_flavor_map_t* berry_flavor_map = NULL;
  if (include_optional) {
    berry_flavor_map = berry_flavor_map_create(
      -2147483648,
       // false, not to have infinite recursion
      instantiate_berry_flavor_summary(0)
    );
  } else {
    berry_flavor_map = berry_flavor_map_create(
      -2147483648,
      NULL
    );
  }

  return berry_flavor_map;
}


#ifdef berry_flavor_map_MAIN

void test_berry_flavor_map(int include_optional) {
    berry_flavor_map_t* berry_flavor_map_1 = instantiate_berry_flavor_map(include_optional);

	cJSON* jsonberry_flavor_map_1 = berry_flavor_map_convertToJSON(berry_flavor_map_1);
	printf("berry_flavor_map :\n%s\n", cJSON_Print(jsonberry_flavor_map_1));
	berry_flavor_map_t* berry_flavor_map_2 = berry_flavor_map_parseFromJSON(jsonberry_flavor_map_1);
	cJSON* jsonberry_flavor_map_2 = berry_flavor_map_convertToJSON(berry_flavor_map_2);
	printf("repeating berry_flavor_map:\n%s\n", cJSON_Print(jsonberry_flavor_map_2));
}

int main() {
  test_berry_flavor_map(1);
  test_berry_flavor_map(0);

  printf("Hello world \n");
  return 0;
}

#endif // berry_flavor_map_MAIN
#endif // berry_flavor_map_TEST
