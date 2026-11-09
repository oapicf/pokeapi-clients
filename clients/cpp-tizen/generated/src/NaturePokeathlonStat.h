/*
 * NaturePokeathlonStat.h
 *
 * 
 */

#ifndef _NaturePokeathlonStat_H_
#define _NaturePokeathlonStat_H_


#include <string>
#include "PokeathlonStatSummary.h"
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

class NaturePokeathlonStat : public Object {
public:
	/*! \brief Constructor.
	 */
	NaturePokeathlonStat();
	NaturePokeathlonStat(char* str);

	/*! \brief Destructor.
	 */
	virtual ~NaturePokeathlonStat();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The amount of change.
	 */
	int getMaxChange();

	/*! \brief Set The amount of change.
	 */
	void setMaxChange(int  max_change);
	/*! \brief Get The stat being affected.
	 */
	PokeathlonStatSummary getPokeathlonStat();

	/*! \brief Set The stat being affected.
	 */
	void setPokeathlonStat(PokeathlonStatSummary  pokeathlon_stat);

private:
	int max_change;
	PokeathlonStatSummary pokeathlon_stat;
	void __init();
	void __cleanup();

};
}
}

#endif /* _NaturePokeathlonStat_H_ */
