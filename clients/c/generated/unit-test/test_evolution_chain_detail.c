#ifndef evolution_chain_detail_TEST
#define evolution_chain_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define evolution_chain_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/evolution_chain_detail.h"
evolution_chain_detail_t* instantiate_evolution_chain_detail(int include_optional);

#include "test_item_summary.c"
#include "test_evolution_chain_detail_chain.c"


evolution_chain_detail_t* instantiate_evolution_chain_detail(int include_optional) {
  evolution_chain_detail_t* evolution_chain_detail = NULL;
  if (include_optional) {
    evolution_chain_detail = evolution_chain_detail_create(
      56,
       // false, not to have infinite recursion
      instantiate_item_summary(0),
       // false, not to have infinite recursion
      instantiate_evolution_chain_detail_chain(0)
    );
  } else {
    evolution_chain_detail = evolution_chain_detail_create(
      56,
      NULL,
      NULL
    );
  }

  return evolution_chain_detail;
}


#ifdef evolution_chain_detail_MAIN

void test_evolution_chain_detail(int include_optional) {
    evolution_chain_detail_t* evolution_chain_detail_1 = instantiate_evolution_chain_detail(include_optional);

	cJSON* jsonevolution_chain_detail_1 = evolution_chain_detail_convertToJSON(evolution_chain_detail_1);
	printf("evolution_chain_detail :\n%s\n", cJSON_Print(jsonevolution_chain_detail_1));
	evolution_chain_detail_t* evolution_chain_detail_2 = evolution_chain_detail_parseFromJSON(jsonevolution_chain_detail_1);
	cJSON* jsonevolution_chain_detail_2 = evolution_chain_detail_convertToJSON(evolution_chain_detail_2);
	printf("repeating evolution_chain_detail:\n%s\n", cJSON_Print(jsonevolution_chain_detail_2));
}

int main() {
  test_evolution_chain_detail(1);
  test_evolution_chain_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // evolution_chain_detail_MAIN
#endif // evolution_chain_detail_TEST
