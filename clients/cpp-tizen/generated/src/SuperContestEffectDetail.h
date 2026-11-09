/*
 * SuperContestEffectDetail.h
 *
 * 
 */

#ifndef _SuperContestEffectDetail_H_
#define _SuperContestEffectDetail_H_


#include <string>
#include "MoveSummary.h"
#include "SuperContestEffectFlavorText.h"
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

class SuperContestEffectDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	SuperContestEffectDetail();
	SuperContestEffectDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SuperContestEffectDetail();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The identifier for this resource.
	 */
	int getId();

	/*! \brief Set The identifier for this resource.
	 */
	void setId(int  id);
	/*! \brief Get The level of appeal this super contest effect has.
	 */
	int getAppeal();

	/*! \brief Set The level of appeal this super contest effect has.
	 */
	void setAppeal(int  appeal);
	/*! \brief Get The flavor text of this super contest effect listed in different languages.
	 */
	std::list<SuperContestEffectFlavorText> getFlavorTextEntries();

	/*! \brief Set The flavor text of this super contest effect listed in different languages.
	 */
	void setFlavorTextEntries(std::list <SuperContestEffectFlavorText> flavor_text_entries);
	/*! \brief Get A list of moves that have the effect when used in super contests.
	 */
	std::list<MoveSummary> getMoves();

	/*! \brief Set A list of moves that have the effect when used in super contests.
	 */
	void setMoves(std::list <MoveSummary> moves);

private:
	int id;
	int appeal;
	std::list <SuperContestEffectFlavorText>flavor_text_entries;
	std::list <MoveSummary>moves;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SuperContestEffectDetail_H_ */
