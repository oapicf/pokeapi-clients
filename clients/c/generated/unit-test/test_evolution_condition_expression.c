#ifndef evolution_condition_expression_TEST
#define evolution_condition_expression_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define evolution_condition_expression_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/evolution_condition_expression.h"
evolution_condition_expression_t* instantiate_evolution_condition_expression(int include_optional);



evolution_condition_expression_t* instantiate_evolution_condition_expression(int include_optional) {
  evolution_condition_expression_t* evolution_condition_expression = NULL;
  if (include_optional) {
    evolution_condition_expression = evolution_condition_expression_create(
      "0",
      1.337,
      list_createList()
    );
  } else {
    evolution_condition_expression = evolution_condition_expression_create(
      "0",
      1.337,
      list_createList()
    );
  }

  return evolution_condition_expression;
}


#ifdef evolution_condition_expression_MAIN

void test_evolution_condition_expression(int include_optional) {
    evolution_condition_expression_t* evolution_condition_expression_1 = instantiate_evolution_condition_expression(include_optional);

	cJSON* jsonevolution_condition_expression_1 = evolution_condition_expression_convertToJSON(evolution_condition_expression_1);
	printf("evolution_condition_expression :\n%s\n", cJSON_Print(jsonevolution_condition_expression_1));
	evolution_condition_expression_t* evolution_condition_expression_2 = evolution_condition_expression_parseFromJSON(jsonevolution_condition_expression_1);
	cJSON* jsonevolution_condition_expression_2 = evolution_condition_expression_convertToJSON(evolution_condition_expression_2);
	printf("repeating evolution_condition_expression:\n%s\n", cJSON_Print(jsonevolution_condition_expression_2));
}

int main() {
  test_evolution_condition_expression(1);
  test_evolution_condition_expression(0);

  printf("Hello world \n");
  return 0;
}

#endif // evolution_condition_expression_MAIN
#endif // evolution_condition_expression_TEST
