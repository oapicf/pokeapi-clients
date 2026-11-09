/*
 * PokeathlonStatAffectingNature.h
 *
 * 
 */

#ifndef _PokeathlonStatAffectingNature_H_
#define _PokeathlonStatAffectingNature_H_


#include <string>
#include "NatureSummary.h"
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

class PokeathlonStatAffectingNature : public Object {
public:
	/*! \brief Constructor.
	 */
	PokeathlonStatAffectingNature();
	PokeathlonStatAffectingNature(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokeathlonStatAffectingNature();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The maximum amount of change to the referenced Pokéathlon stat.
	 */
	int getMaxChange();

	/*! \brief Set The maximum amount of change to the referenced Pokéathlon stat.
	 */
	void setMaxChange(int  max_change);
	/*! \brief Get The nature causing the change.
	 */
	NatureSummary getNature();

	/*! \brief Set The nature causing the change.
	 */
	void setNature(NatureSummary  nature);

private:
	int max_change;
	NatureSummary nature;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokeathlonStatAffectingNature_H_ */
