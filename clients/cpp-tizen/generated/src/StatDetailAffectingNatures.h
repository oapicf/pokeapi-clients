/*
 * StatDetail_affecting_natures.h
 *
 * 
 */

#ifndef _StatDetail_affecting_natures_H_
#define _StatDetail_affecting_natures_H_


#include <string>
#include "AbilityDetail_pokemon_inner_pokemon.h"
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

class StatDetail_affecting_natures : public Object {
public:
	/*! \brief Constructor.
	 */
	StatDetail_affecting_natures();
	StatDetail_affecting_natures(char* str);

	/*! \brief Destructor.
	 */
	virtual ~StatDetail_affecting_natures();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner_pokemon> getIncrease();

	/*! \brief Set 
	 */
	void setIncrease(std::list <AbilityDetail_pokemon_inner_pokemon> increase);
	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner_pokemon> getDecrease();

	/*! \brief Set 
	 */
	void setDecrease(std::list <AbilityDetail_pokemon_inner_pokemon> decrease);

private:
	std::list <AbilityDetail_pokemon_inner_pokemon>increase;
	std::list <AbilityDetail_pokemon_inner_pokemon>decrease;
	void __init();
	void __cleanup();

};
}
}

#endif /* _StatDetail_affecting_natures_H_ */
