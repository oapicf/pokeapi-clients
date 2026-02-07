/*
 * MoveChange_effect_entries_inner.h
 *
 * 
 */

#ifndef _MoveChange_effect_entries_inner_H_
#define _MoveChange_effect_entries_inner_H_


#include <string>
#include "AbilityDetail_pokemon_inner_pokemon.h"
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

class MoveChange_effect_entries_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	MoveChange_effect_entries_inner();
	MoveChange_effect_entries_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MoveChange_effect_entries_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getEffect();

	/*! \brief Set 
	 */
	void setEffect(std::string  effect);
	/*! \brief Get 
	 */
	std::string getShortEffect();

	/*! \brief Set 
	 */
	void setShortEffect(std::string  short_effect);
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getLanguage();

	/*! \brief Set 
	 */
	void setLanguage(AbilityDetail_pokemon_inner_pokemon  language);

private:
	std::string effect;
	std::string short_effect;
	AbilityDetail_pokemon_inner_pokemon language;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MoveChange_effect_entries_inner_H_ */
