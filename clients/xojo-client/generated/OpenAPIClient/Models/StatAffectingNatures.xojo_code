#tag Class
Protected Class StatAffectingNatures

	#tag Property, Flags = &h0
		#tag Note
			A list of natures and how they change the referenced stat.
		#tag EndNote
		increase() As OpenAPIClient.Models.NatureSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of nature sand how they change the referenced stat.
		#tag EndNote
		decrease() As OpenAPIClient.Models.NatureSummary
	#tag EndProperty





	#tag ViewBehavior
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="increase"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="NatureSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="decrease"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="NatureSummary"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


