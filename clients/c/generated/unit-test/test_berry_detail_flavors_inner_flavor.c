#ifndef berry_detail_flavors_inner_flavor_TEST
#define berry_detail_flavors_inner_flavor_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define berry_detail_flavors_inner_flavor_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/berry_detail_flavors_inner_flavor.h"
berry_detail_flavors_inner_flavor_t* instantiate_berry_detail_flavors_inner_flavor(int include_optional);



berry_detail_flavors_inner_flavor_t* instantiate_berry_detail_flavors_inner_flavor(int include_optional) {
  berry_detail_flavors_inner_flavor_t* berry_detail_flavors_inner_flavor = NULL;
  if (include_optional) {
    berry_detail_flavors_inner_flavor = berry_detail_flavors_inner_flavor_create(
      "0",
      "0"
    );
  } else {
    berry_detail_flavors_inner_flavor = berry_detail_flavors_inner_flavor_create(
      "0",
      "0"
    );
  }

  return berry_detail_flavors_inner_flavor;
}


#ifdef berry_detail_flavors_inner_flavor_MAIN

void test_berry_detail_flavors_inner_flavor(int include_optional) {
    berry_detail_flavors_inner_flavor_t* berry_detail_flavors_inner_flavor_1 = instantiate_berry_detail_flavors_inner_flavor(include_optional);

	cJSON* jsonberry_detail_flavors_inner_flavor_1 = berry_detail_flavors_inner_flavor_convertToJSON(berry_detail_flavors_inner_flavor_1);
	printf("berry_detail_flavors_inner_flavor :\n%s\n", cJSON_Print(jsonberry_detail_flavors_inner_flavor_1));
	berry_detail_flavors_inner_flavor_t* berry_detail_flavors_inner_flavor_2 = berry_detail_flavors_inner_flavor_parseFromJSON(jsonberry_detail_flavors_inner_flavor_1);
	cJSON* jsonberry_detail_flavors_inner_flavor_2 = berry_detail_flavors_inner_flavor_convertToJSON(berry_detail_flavors_inner_flavor_2);
	printf("repeating berry_detail_flavors_inner_flavor:\n%s\n", cJSON_Print(jsonberry_detail_flavors_inner_flavor_2));
}

int main() {
  test_berry_detail_flavors_inner_flavor(1);
  test_berry_detail_flavors_inner_flavor(0);

  printf("Hello world \n");
  return 0;
}

#endif // berry_detail_flavors_inner_flavor_MAIN
#endif // berry_detail_flavors_inner_flavor_TEST
