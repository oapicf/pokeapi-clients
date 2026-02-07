/*
 * PokeathlonStatDetail_affecting_natures.h
 *
 * 
 */

#ifndef _PokeathlonStatDetail_affecting_natures_H_
#define _PokeathlonStatDetail_affecting_natures_H_


#include <string>
#include "PokeathlonStatDetail_affecting_natures_decrease_inner.h"
#include "PokeathlonStatDetail_affecting_natures_increase_inner.h"
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

class PokeathlonStatDetail_affecting_natures : public Object {
public:
	/*! \brief Constructor.
	 */
	PokeathlonStatDetail_affecting_natures();
	PokeathlonStatDetail_affecting_natures(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokeathlonStatDetail_affecting_natures();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<PokeathlonStatDetail_affecting_natures_decrease_inner> getDecrease();

	/*! \brief Set 
	 */
	void setDecrease(std::list <PokeathlonStatDetail_affecting_natures_decrease_inner> decrease);
	/*! \brief Get 
	 */
	std::list<PokeathlonStatDetail_affecting_natures_increase_inner> getIncrease();

	/*! \brief Set 
	 */
	void setIncrease(std::list <PokeathlonStatDetail_affecting_natures_increase_inner> increase);

private:
	std::list <PokeathlonStatDetail_affecting_natures_decrease_inner>decrease;
	std::list <PokeathlonStatDetail_affecting_natures_increase_inner>increase;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokeathlonStatDetail_affecting_natures_H_ */
