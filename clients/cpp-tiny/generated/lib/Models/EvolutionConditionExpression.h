
/*
 * EvolutionConditionExpression.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_EvolutionConditionExpression_H_
#define TINY_CPP_CLIENT_EvolutionConditionExpression_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "EvolutionVariableSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class EvolutionConditionExpression{
public:

    /*! \brief Constructor.
	 */
    EvolutionConditionExpression();
    EvolutionConditionExpression(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~EvolutionConditionExpression();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Evaluatable RPN condition expression using evolution variables (e.g. 'EC 100 % 0 ==')
	 */
	std::string getExpression();

	/*! \brief Set Evaluatable RPN condition expression using evolution variables (e.g. 'EC 100 % 0 ==')
	 */
	void setExpression(std::string expression);
	/*! \brief Get Percentage chance of evolution under this condition (0-100)
	 */
	double getPercentageChance();

	/*! \brief Set Percentage chance of evolution under this condition (0-100)
	 */
	void setPercentageChance(double percentage_chance);
	/*! \brief Get Evolution variables referenced in the expression
	 */
	std::list<EvolutionVariableSummary> getVariables();

	/*! \brief Set Evolution variables referenced in the expression
	 */
	void setVariables(std::list<EvolutionVariableSummary> variables);


    private:
    std::string expression{};
    double percentage_chance{};
    std::list<EvolutionVariableSummary> variables;
};
}

#endif /* TINY_CPP_CLIENT_EvolutionConditionExpression_H_ */
