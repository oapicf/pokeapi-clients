#ifndef characteristic_description_TEST
#define characteristic_description_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define characteristic_description_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/characteristic_description.h"
characteristic_description_t* instantiate_characteristic_description(int include_optional);

#include "test_language_summary.c"


characteristic_description_t* instantiate_characteristic_description(int include_optional) {
  characteristic_description_t* characteristic_description = NULL;
  if (include_optional) {
    characteristic_description = characteristic_description_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    characteristic_description = characteristic_description_create(
      "0",
      NULL
    );
  }

  return characteristic_description;
}


#ifdef characteristic_description_MAIN

void test_characteristic_description(int include_optional) {
    characteristic_description_t* characteristic_description_1 = instantiate_characteristic_description(include_optional);

	cJSON* jsoncharacteristic_description_1 = characteristic_description_convertToJSON(characteristic_description_1);
	printf("characteristic_description :\n%s\n", cJSON_Print(jsoncharacteristic_description_1));
	characteristic_description_t* characteristic_description_2 = characteristic_description_parseFromJSON(jsoncharacteristic_description_1);
	cJSON* jsoncharacteristic_description_2 = characteristic_description_convertToJSON(characteristic_description_2);
	printf("repeating characteristic_description:\n%s\n", cJSON_Print(jsoncharacteristic_description_2));
}

int main() {
  test_characteristic_description(1);
  test_characteristic_description(0);

  printf("Hello world \n");
  return 0;
}

#endif // characteristic_description_MAIN
#endif // characteristic_description_TEST
