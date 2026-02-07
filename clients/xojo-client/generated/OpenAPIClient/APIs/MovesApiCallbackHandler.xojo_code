#tag Interface
Protected Interface MovesApiCallbackHandler
	#tag Method, Flags = &h0
		Sub MoveAilmentListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.PaginatedMoveMetaAilmentSummaryList)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub MoveAilmentRetrieveCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.MoveMetaAilmentDetail)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub MoveBattleStyleListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.PaginatedMoveBattleStyleSummaryList)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub MoveBattleStyleRetrieveCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.MoveBattleStyleDetail)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub MoveCategoryListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.PaginatedMoveMetaCategorySummaryList)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub MoveCategoryRetrieveCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.MoveMetaCategoryDetail)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub MoveLearnMethodListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.PaginatedMoveLearnMethodSummaryList)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub MoveLearnMethodRetrieveCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.MoveLearnMethodDetail)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub MoveListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.PaginatedMoveSummaryList)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub MoveRetrieveCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.MoveDetail)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub MoveTargetListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.PaginatedMoveTargetSummaryList)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub MoveTargetRetrieveCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.MoveTargetDetail)
		  
		End Sub
	#tag EndMethod




	#tag ViewBehavior
		#tag ViewProperty
			Name="Name"
			Visible=true
			Group="ID"
			Type="String"
		#tag EndViewProperty
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			Type="String"
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
		#tag EndViewProperty
	#tag EndViewBehavior
End Interface
#tag EndInterface
