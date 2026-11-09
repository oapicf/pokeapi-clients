/*
 * EvolutionConditionExpression.h
 *
 * 
 */

#ifndef _EvolutionConditionExpression_H_
#define _EvolutionConditionExpression_H_


#include <string>
#include "EvolutionVariableSummary.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class EvolutionConditionExpression : public Object {
public:
	/*! \brief Constructor.
	 */
	EvolutionConditionExpression();
	EvolutionConditionExpression(char* str);

	/*! \brief Destructor.
	 */
	virtual ~EvolutionConditionExpression();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Evaluatable RPN condition expression using evolution variables (e.g. 'EC 100 % 0 ==')
	 */
	std::string getExpression();

	/*! \brief Set Evaluatable RPN condition expression using evolution variables (e.g. 'EC 100 % 0 ==')
	 */
	void setExpression(std::string  expression);
	/*! \brief Get Percentage chance of evolution under this condition (0-100)
	 */
	double getPercentageChance();

	/*! \brief Set Percentage chance of evolution under this condition (0-100)
	 */
	void setPercentageChance(double  percentage_chance);
	/*! \brief Get Evolution variables referenced in the expression
	 */
	std::list<EvolutionVariableSummary> getVariables();

	/*! \brief Set Evolution variables referenced in the expression
	 */
	void setVariables(std::list <EvolutionVariableSummary> variables);

private:
	std::string expression;
	double percentage_chance;
	std::list <EvolutionVariableSummary>variables;
	void __init();
	void __cleanup();

};
}
}

#endif /* _EvolutionConditionExpression_H_ */
