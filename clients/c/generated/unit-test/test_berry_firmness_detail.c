#ifndef berry_firmness_detail_TEST
#define berry_firmness_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define berry_firmness_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/berry_firmness_detail.h"
berry_firmness_detail_t* instantiate_berry_firmness_detail(int include_optional);



berry_firmness_detail_t* instantiate_berry_firmness_detail(int include_optional) {
  berry_firmness_detail_t* berry_firmness_detail = NULL;
  if (include_optional) {
    berry_firmness_detail = berry_firmness_detail_create(
      56,
      "0",
      list_createList(),
      list_createList()
    );
  } else {
    berry_firmness_detail = berry_firmness_detail_create(
      56,
      "0",
      list_createList(),
      list_createList()
    );
  }

  return berry_firmness_detail;
}


#ifdef berry_firmness_detail_MAIN

void test_berry_firmness_detail(int include_optional) {
    berry_firmness_detail_t* berry_firmness_detail_1 = instantiate_berry_firmness_detail(include_optional);

	cJSON* jsonberry_firmness_detail_1 = berry_firmness_detail_convertToJSON(berry_firmness_detail_1);
	printf("berry_firmness_detail :\n%s\n", cJSON_Print(jsonberry_firmness_detail_1));
	berry_firmness_detail_t* berry_firmness_detail_2 = berry_firmness_detail_parseFromJSON(jsonberry_firmness_detail_1);
	cJSON* jsonberry_firmness_detail_2 = berry_firmness_detail_convertToJSON(berry_firmness_detail_2);
	printf("repeating berry_firmness_detail:\n%s\n", cJSON_Print(jsonberry_firmness_detail_2));
}

int main() {
  test_berry_firmness_detail(1);
  test_berry_firmness_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // berry_firmness_detail_MAIN
#endif // berry_firmness_detail_TEST
