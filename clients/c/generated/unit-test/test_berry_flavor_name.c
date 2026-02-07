#ifndef berry_flavor_name_TEST
#define berry_flavor_name_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define berry_flavor_name_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/berry_flavor_name.h"
berry_flavor_name_t* instantiate_berry_flavor_name(int include_optional);

#include "test_language_summary.c"


berry_flavor_name_t* instantiate_berry_flavor_name(int include_optional) {
  berry_flavor_name_t* berry_flavor_name = NULL;
  if (include_optional) {
    berry_flavor_name = berry_flavor_name_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    berry_flavor_name = berry_flavor_name_create(
      "0",
      NULL
    );
  }

  return berry_flavor_name;
}


#ifdef berry_flavor_name_MAIN

void test_berry_flavor_name(int include_optional) {
    berry_flavor_name_t* berry_flavor_name_1 = instantiate_berry_flavor_name(include_optional);

	cJSON* jsonberry_flavor_name_1 = berry_flavor_name_convertToJSON(berry_flavor_name_1);
	printf("berry_flavor_name :\n%s\n", cJSON_Print(jsonberry_flavor_name_1));
	berry_flavor_name_t* berry_flavor_name_2 = berry_flavor_name_parseFromJSON(jsonberry_flavor_name_1);
	cJSON* jsonberry_flavor_name_2 = berry_flavor_name_convertToJSON(berry_flavor_name_2);
	printf("repeating berry_flavor_name:\n%s\n", cJSON_Print(jsonberry_flavor_name_2));
}

int main() {
  test_berry_flavor_name(1);
  test_berry_flavor_name(0);

  printf("Hello world \n");
  return 0;
}

#endif // berry_flavor_name_MAIN
#endif // berry_flavor_name_TEST
