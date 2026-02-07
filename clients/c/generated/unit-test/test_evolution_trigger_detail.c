#ifndef evolution_trigger_detail_TEST
#define evolution_trigger_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define evolution_trigger_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/evolution_trigger_detail.h"
evolution_trigger_detail_t* instantiate_evolution_trigger_detail(int include_optional);



evolution_trigger_detail_t* instantiate_evolution_trigger_detail(int include_optional) {
  evolution_trigger_detail_t* evolution_trigger_detail = NULL;
  if (include_optional) {
    evolution_trigger_detail = evolution_trigger_detail_create(
      56,
      "0",
      list_createList(),
      list_createList()
    );
  } else {
    evolution_trigger_detail = evolution_trigger_detail_create(
      56,
      "0",
      list_createList(),
      list_createList()
    );
  }

  return evolution_trigger_detail;
}


#ifdef evolution_trigger_detail_MAIN

void test_evolution_trigger_detail(int include_optional) {
    evolution_trigger_detail_t* evolution_trigger_detail_1 = instantiate_evolution_trigger_detail(include_optional);

	cJSON* jsonevolution_trigger_detail_1 = evolution_trigger_detail_convertToJSON(evolution_trigger_detail_1);
	printf("evolution_trigger_detail :\n%s\n", cJSON_Print(jsonevolution_trigger_detail_1));
	evolution_trigger_detail_t* evolution_trigger_detail_2 = evolution_trigger_detail_parseFromJSON(jsonevolution_trigger_detail_1);
	cJSON* jsonevolution_trigger_detail_2 = evolution_trigger_detail_convertToJSON(evolution_trigger_detail_2);
	printf("repeating evolution_trigger_detail:\n%s\n", cJSON_Print(jsonevolution_trigger_detail_2));
}

int main() {
  test_evolution_trigger_detail(1);
  test_evolution_trigger_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // evolution_trigger_detail_MAIN
#endif // evolution_trigger_detail_TEST
