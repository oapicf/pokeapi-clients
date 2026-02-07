#tag Interface
Protected Interface EvolutionApiCallbackHandler
	#tag Method, Flags = &h0
		Sub EvolutionChainListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.PaginatedEvolutionChainSummaryList)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub EvolutionChainRetrieveCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.EvolutionChainDetail)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub EvolutionTriggerListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.PaginatedEvolutionTriggerSummaryList)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub EvolutionTriggerRetrieveCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.EvolutionTriggerDetail)
		  
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
