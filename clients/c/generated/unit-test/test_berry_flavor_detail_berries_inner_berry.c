#ifndef berry_flavor_detail_berries_inner_berry_TEST
#define berry_flavor_detail_berries_inner_berry_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define berry_flavor_detail_berries_inner_berry_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/berry_flavor_detail_berries_inner_berry.h"
berry_flavor_detail_berries_inner_berry_t* instantiate_berry_flavor_detail_berries_inner_berry(int include_optional);



berry_flavor_detail_berries_inner_berry_t* instantiate_berry_flavor_detail_berries_inner_berry(int include_optional) {
  berry_flavor_detail_berries_inner_berry_t* berry_flavor_detail_berries_inner_berry = NULL;
  if (include_optional) {
    berry_flavor_detail_berries_inner_berry = berry_flavor_detail_berries_inner_berry_create(
      "0",
      "0"
    );
  } else {
    berry_flavor_detail_berries_inner_berry = berry_flavor_detail_berries_inner_berry_create(
      "0",
      "0"
    );
  }

  return berry_flavor_detail_berries_inner_berry;
}


#ifdef berry_flavor_detail_berries_inner_berry_MAIN

void test_berry_flavor_detail_berries_inner_berry(int include_optional) {
    berry_flavor_detail_berries_inner_berry_t* berry_flavor_detail_berries_inner_berry_1 = instantiate_berry_flavor_detail_berries_inner_berry(include_optional);

	cJSON* jsonberry_flavor_detail_berries_inner_berry_1 = berry_flavor_detail_berries_inner_berry_convertToJSON(berry_flavor_detail_berries_inner_berry_1);
	printf("berry_flavor_detail_berries_inner_berry :\n%s\n", cJSON_Print(jsonberry_flavor_detail_berries_inner_berry_1));
	berry_flavor_detail_berries_inner_berry_t* berry_flavor_detail_berries_inner_berry_2 = berry_flavor_detail_berries_inner_berry_parseFromJSON(jsonberry_flavor_detail_berries_inner_berry_1);
	cJSON* jsonberry_flavor_detail_berries_inner_berry_2 = berry_flavor_detail_berries_inner_berry_convertToJSON(berry_flavor_detail_berries_inner_berry_2);
	printf("repeating berry_flavor_detail_berries_inner_berry:\n%s\n", cJSON_Print(jsonberry_flavor_detail_berries_inner_berry_2));
}

int main() {
  test_berry_flavor_detail_berries_inner_berry(1);
  test_berry_flavor_detail_berries_inner_berry(0);

  printf("Hello world \n");
  return 0;
}

#endif // berry_flavor_detail_berries_inner_berry_MAIN
#endif // berry_flavor_detail_berries_inner_berry_TEST
