/*
 * PokeathlonStatAffectingNatures.h
 *
 * 
 */

#ifndef _PokeathlonStatAffectingNatures_H_
#define _PokeathlonStatAffectingNatures_H_


#include <string>
#include "PokeathlonStatAffectingNature.h"
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

class PokeathlonStatAffectingNatures : public Object {
public:
	/*! \brief Constructor.
	 */
	PokeathlonStatAffectingNatures();
	PokeathlonStatAffectingNatures(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokeathlonStatAffectingNatures();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A list of natures and how they change the referenced Pokéathlon stat.
	 */
	std::list<PokeathlonStatAffectingNature> getIncrease();

	/*! \brief Set A list of natures and how they change the referenced Pokéathlon stat.
	 */
	void setIncrease(std::list <PokeathlonStatAffectingNature> increase);
	/*! \brief Get A list of natures and how they change the referenced Pokéathlon stat.
	 */
	std::list<PokeathlonStatAffectingNature> getDecrease();

	/*! \brief Set A list of natures and how they change the referenced Pokéathlon stat.
	 */
	void setDecrease(std::list <PokeathlonStatAffectingNature> decrease);

private:
	std::list <PokeathlonStatAffectingNature>increase;
	std::list <PokeathlonStatAffectingNature>decrease;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokeathlonStatAffectingNatures_H_ */
