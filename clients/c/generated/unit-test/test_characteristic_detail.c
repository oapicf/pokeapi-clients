#ifndef characteristic_detail_TEST
#define characteristic_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define characteristic_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/characteristic_detail.h"
characteristic_detail_t* instantiate_characteristic_detail(int include_optional);

#include "test_stat_summary.c"


characteristic_detail_t* instantiate_characteristic_detail(int include_optional) {
  characteristic_detail_t* characteristic_detail = NULL;
  if (include_optional) {
    characteristic_detail = characteristic_detail_create(
      56,
      56,
      list_createList(),
       // false, not to have infinite recursion
      instantiate_stat_summary(0),
      list_createList()
    );
  } else {
    characteristic_detail = characteristic_detail_create(
      56,
      56,
      list_createList(),
      NULL,
      list_createList()
    );
  }

  return characteristic_detail;
}


#ifdef characteristic_detail_MAIN

void test_characteristic_detail(int include_optional) {
    characteristic_detail_t* characteristic_detail_1 = instantiate_characteristic_detail(include_optional);

	cJSON* jsoncharacteristic_detail_1 = characteristic_detail_convertToJSON(characteristic_detail_1);
	printf("characteristic_detail :\n%s\n", cJSON_Print(jsoncharacteristic_detail_1));
	characteristic_detail_t* characteristic_detail_2 = characteristic_detail_parseFromJSON(jsoncharacteristic_detail_1);
	cJSON* jsoncharacteristic_detail_2 = characteristic_detail_convertToJSON(characteristic_detail_2);
	printf("repeating characteristic_detail:\n%s\n", cJSON_Print(jsoncharacteristic_detail_2));
}

int main() {
  test_characteristic_detail(1);
  test_characteristic_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // characteristic_detail_MAIN
#endif // characteristic_detail_TEST
