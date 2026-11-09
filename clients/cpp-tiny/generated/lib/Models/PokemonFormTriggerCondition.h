
/*
 * PokemonFormTriggerCondition.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonFormTriggerCondition_H_
#define TINY_CPP_CLIENT_PokemonFormTriggerCondition_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PokemonFormSummary.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonFormTriggerCondition{
public:

    /*! \brief Constructor.
	 */
    PokemonFormTriggerCondition();
    PokemonFormTriggerCondition(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonFormTriggerCondition();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The trigger for this form change.
	 */
	std::string getTrigger();

	/*! \brief Set The trigger for this form change.
	 */
	void setTrigger(std::string trigger);
	/*! \brief Get The name of the required item, ability, or move. Only present for a resource-based trigger.
	 */
	std::string getName();

	/*! \brief Set The name of the required item, ability, or move. Only present for a resource-based trigger.
	 */
	void setName(std::string name);
	/*! \brief Get The URL of the required item, ability, or move. Only present for a resource-based trigger.
	 */
	std::string getUrl();

	/*! \brief Set The URL of the required item, ability, or move. Only present for a resource-based trigger.
	 */
	void setUrl(std::string url);
	/*! \brief Get The required base form. Only present when the trigger specifies one.
	 */
	PokemonFormSummary getBaseForm();

	/*! \brief Set The required base form. Only present when the trigger specifies one.
	 */
	void setBaseForm(PokemonFormSummary base_form);


    private:
    std::string trigger{};
    std::string name{};
    std::string url{};
    PokemonFormSummary base_form;
};
}

#endif /* TINY_CPP_CLIENT_PokemonFormTriggerCondition_H_ */
