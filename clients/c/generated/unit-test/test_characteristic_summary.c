#ifndef characteristic_summary_TEST
#define characteristic_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define characteristic_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/characteristic_summary.h"
characteristic_summary_t* instantiate_characteristic_summary(int include_optional);



characteristic_summary_t* instantiate_characteristic_summary(int include_optional) {
  characteristic_summary_t* characteristic_summary = NULL;
  if (include_optional) {
    characteristic_summary = characteristic_summary_create(
      "0"
    );
  } else {
    characteristic_summary = characteristic_summary_create(
      "0"
    );
  }

  return characteristic_summary;
}


#ifdef characteristic_summary_MAIN

void test_characteristic_summary(int include_optional) {
    characteristic_summary_t* characteristic_summary_1 = instantiate_characteristic_summary(include_optional);

	cJSON* jsoncharacteristic_summary_1 = characteristic_summary_convertToJSON(characteristic_summary_1);
	printf("characteristic_summary :\n%s\n", cJSON_Print(jsoncharacteristic_summary_1));
	characteristic_summary_t* characteristic_summary_2 = characteristic_summary_parseFromJSON(jsoncharacteristic_summary_1);
	cJSON* jsoncharacteristic_summary_2 = characteristic_summary_convertToJSON(characteristic_summary_2);
	printf("repeating characteristic_summary:\n%s\n", cJSON_Print(jsoncharacteristic_summary_2));
}

int main() {
  test_characteristic_summary(1);
  test_characteristic_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // characteristic_summary_MAIN
#endif // characteristic_summary_TEST
