/*
 * PokemonStat.h
 *
 * 
 */

#ifndef _PokemonStat_H_
#define _PokemonStat_H_


#include <string>
#include "StatSummary.h"
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

class PokemonStat : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonStat();
	PokemonStat(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonStat();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getBaseStat();

	/*! \brief Set 
	 */
	void setBaseStat(int  base_stat);
	/*! \brief Get 
	 */
	int getEffort();

	/*! \brief Set 
	 */
	void setEffort(int  effort);
	/*! \brief Get 
	 */
	StatSummary getStat();

	/*! \brief Set 
	 */
	void setStat(StatSummary  stat);

private:
	int base_stat;
	int effort;
	StatSummary stat;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonStat_H_ */
