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

	/*! \brief Get 
	 */
	int getId();

	/*! \brief Set 
	 */
	void setId(int  id);
	/*! \brief Get 
	 */
	int getAppeal();

	/*! \brief Set 
	 */
	void setAppeal(int  appeal);
	/*! \brief Get 
	 */
	std::list<SuperContestEffectFlavorText> getFlavorTextEntries();

	/*! \brief Set 
	 */
	void setFlavorTextEntries(std::list <SuperContestEffectFlavorText> flavor_text_entries);
	/*! \brief Get 
	 */
	std::list<MoveSummary> getMoves();

	/*! \brief Set 
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
