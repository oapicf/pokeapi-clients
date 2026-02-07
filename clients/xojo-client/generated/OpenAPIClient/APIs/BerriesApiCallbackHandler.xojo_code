#tag Interface
Protected Interface BerriesApiCallbackHandler
	#tag Method, Flags = &h0
		Sub BerryFirmnessListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.PaginatedBerryFirmnessSummaryList)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub BerryFirmnessRetrieveCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.BerryFirmnessDetail)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub BerryFlavorListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.PaginatedBerryFlavorSummaryList)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub BerryFlavorRetrieveCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.BerryFlavorDetail)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub BerryListCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.PaginatedBerrySummaryList)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub BerryRetrieveCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.BerryDetail)
		  
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
