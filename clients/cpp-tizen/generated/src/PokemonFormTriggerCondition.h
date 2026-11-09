/*
 * PokemonFormTriggerCondition.h
 *
 * 
 */

#ifndef _PokemonFormTriggerCondition_H_
#define _PokemonFormTriggerCondition_H_


#include <string>
#include "PokemonFormSummary.h"
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

class PokemonFormTriggerCondition : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonFormTriggerCondition();
	PokemonFormTriggerCondition(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonFormTriggerCondition();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The trigger for this form change.
	 */
	std::string getTrigger();

	/*! \brief Set The trigger for this form change.
	 */
	void setTrigger(std::string  trigger);
	/*! \brief Get The name of the required item, ability, or move. Only present for a resource-based trigger.
	 */
	std::string getName();

	/*! \brief Set The name of the required item, ability, or move. Only present for a resource-based trigger.
	 */
	void setName(std::string  name);
	/*! \brief Get The URL of the required item, ability, or move. Only present for a resource-based trigger.
	 */
	std::string getUrl();

	/*! \brief Set The URL of the required item, ability, or move. Only present for a resource-based trigger.
	 */
	void setUrl(std::string  url);
	/*! \brief Get The required base form. Only present when the trigger specifies one.
	 */
	PokemonFormSummary getBaseForm();

	/*! \brief Set The required base form. Only present when the trigger specifies one.
	 */
	void setBaseForm(PokemonFormSummary  base_form);

private:
	std::string trigger;
	std::string name;
	std::string url;
	PokemonFormSummary base_form;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonFormTriggerCondition_H_ */
