#tag Interface
Protected Interface EncountersApiCallbackHandler
	#tag Method, Flags = &h0
		Sub EncounterConditionListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.PaginatedEncounterConditionSummaryList)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub EncounterConditionRetrieveCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.EncounterConditionDetail)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub EncounterConditionValueListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.PaginatedEncounterConditionValueSummaryList)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub EncounterConditionValueRetrieveCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.EncounterConditionValueDetail)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub EncounterMethodListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.PaginatedEncounterMethodSummaryList)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub EncounterMethodRetrieveCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.EncounterMethodDetail)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub PokemonEncountersRetrieveCallback(status As OpenAPIClient.OpenAPIClientException, data() As OpenAPIClient.Models.PokemonEncountersRetrieve200ResponseInner)
		  
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
